package marketplace;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Products water = new Products("Bottle of water", 12);
        Products bread = new Products("Bread", 3);
        Products milk = new Products("Milk", 2);
        Products juice = new Products("Juice", 4);
        Products wheat = new Products("Wheat", 5);
        Products cheese = new Products("Cheese", 7);
        Products apple = new Products("Apple", 1);
        Products butter = new Products("Butter", 15);
        List<Products> eat1 = List.of(water, bread, milk, juice, wheat, cheese, butter, apple);

        ProductMarket products = new ProductMarket(eat1);

        System.out.println(products.getAllNames());         //список всех продуктов
        System.out.println(products.returnPriceUsOneString()); //отдельно вывожу отсортированые цены
        System.out.println(products.more10());              // отдельно вывожу отфильтрованые объекты по цене больше 10
        System.out.println(products.getAllNames());         // вывожу имена всех продуктов которые отсортированы а-z
        System.out.println(products.smaller0());            // меньше ноля
        System.out.println(products.returnPriceUsString()); // цены в списке как стринг
    }
}
