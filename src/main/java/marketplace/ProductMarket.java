package marketplace;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
@AllArgsConstructor
public class ProductMarket {
    private List<Products> products;

//    public ProductMarket(List<Products> products) {
//        this.products = products;
//    }

//    public List<Products> sortUp(List<Products> array) {
//        List<Products> sortedList = array.stream().filter(products1 -> products1.getPrice() > 10);
//        sortedList = products.stream().map(products -> products.getName());
//        return sortedList;
//    }

    public  static List<String> getAllNames(List<Products> products){
        List<String> namesOfProducts = products.stream().
                map(product -> product.getName()).
                sorted().
                collect(Collectors.toList());
        return namesOfProducts;
    }

    public  static void getAllNamesSOUT(List<Products> products){
              products.stream().forEach(prod1->System.out.print(prod1.getName()));
    }

    public static void more10SOUT (List<Products> products){
        products.stream().
                filter(product -> product.getPrice()>10).
                forEach(prod -> System.out.println(prod.getPrice()));
    }

    public static List<Products> more10 (List<Products> products){
        List<Products> productsMore10 = products.stream().
                filter(product -> product.getPrice()>10).
                collect(Collectors.toList());
        return productsMore10;
    }

    public static List<Products> smaller0(List<Products> products){
        List<Products> pricesSmaller0 = products.stream().
                filter(prod->prod.getPrice()<0).
                collect(Collectors.toList());
        return pricesSmaller0;
    }

    public static void smaller0SOUT(List<Products> products){
         products.stream().
                 filter(prod->prod.getPrice()<0).
                 forEach(prod-> System.out.println(prod.getPrice()));

    }

    public static List returnPriceUsString(List<Products> products){
        List price= products.stream().map(product -> product.getPrice()).collect(Collectors.toList());
        System.out.println("test " + 4 + price.get(1));
         return price;
    }

    public static List returnPriceUsOneString(List<Products> products){
        return products.stream().map(product -> product.getPrice()).collect(Collectors.toList());
    }

}
