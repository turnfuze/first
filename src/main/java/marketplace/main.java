package marketplace;
import java.util.List;

import static marketplace.ProductMarket.*;
public class main {
    public static void main(String[] args) {
        List<Products> eat ;
       Products water = new Products("Bottle of water", 12);
    Products bread = new Products("Bread", 3);
    Products milk = new Products("Milk", 2);
    Products juice = new Products("Juice", 4);
    Products wheat = new Products("Wheat", 5);
    Products cheese = new Products("Cheese", 7);
    Products apple = new Products("Apple", 1);
    Products butter = new Products("Butter", 15);
        List<Products> eat1 = List.of(water,bread,milk,juice,wheat,cheese,butter,apple);


        getAllNamesSOUT(eat1);//список всех продуктов
        more10SOUT(eat1);  //отдельно вывожу цены
        System.out.println(more10(eat1));    // отдельно вывожу отфильтрованые объекты по цене больше 10
        System.out.println(getAllNames(eat1));   // вывожу имена всех продуктов которые отсортированы а-z
        smaller0SOUT(eat1); // меньше ноля
        System.out.println(returnPriceUsString(eat1)); // цены в списке как стринг

    }
}
