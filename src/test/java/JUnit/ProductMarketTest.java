package JUnit;

import marketplace.ProductMarket;
import marketplace.Products;
import org.testng.annotations.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ProductMarketTest {
    private static ProductMarket productMarket;
    private static List<Products> productsList;

    @BeforeSuite(alwaysRun = true)
    public void createObject() {
        System.out.println("BeforeSuite");
        Products water = new Products("Bottle of water", 12);
        Products bread = new Products("Bread", 3);
        Products milk = new Products("Milk", 2);
        Products juice = new Products("Juice", 4);
        Products wheat = new Products("Wheat", 5);
        Products cheese = new Products("Cheese", 7);
        Products apple = new Products("Apple", 1);
        Products butter = new Products("Butter", 15);
        productsList = List.of(water, bread, milk, juice, wheat, cheese, butter, apple);
        productMarket = new ProductMarket(productsList);
    }



    @Test
    public void isAllNameOfProduct() {
        List<String> prodActual = productMarket.getAllNames();
        List<String> prodExpected = productsList.stream()
                .map(Products::getName)
                .sorted()
                .collect(Collectors.toList());
        assertEquals(prodActual, prodExpected);
    }

    @Test (groups = {"smoke"})
    public void isMore10() {
        System.out.println("isMore10");
        List<Products> prodActual = productMarket.more10();
        List<Products> prodExpected = productsList.stream()
                .filter(product -> product.getPrice() > 10)
                .collect(Collectors.toList());
        assertEquals(prodActual, prodExpected);
    }

    @Test
    public void isSmaller0() {
        List<Products> prodActual = productMarket.smaller0();
        List<Products> prodExpected = productsList.stream()
                .filter(prod -> prod.getPrice() < 0)
                .collect(Collectors.toList());
        assertEquals(prodActual, prodExpected);
    }

    @Test(groups = {"regression"})
    public void isReturnPriceUsString() {
        List<?> prodActual = productMarket.returnPriceUsString();
        List<?> prodExpected = productsList.stream()
                .map(product -> product.getPrice())
                .collect(Collectors.toList());
        assertEquals(prodActual, prodExpected);
    }

    @Test
    public void isReturnPriceUsOneString() {
        List<?> prodActual = productMarket.returnPriceUsOneString();
        List<?> prodExpected = productsList.stream()
                .map(product -> product.getPrice())
                .sorted().collect(Collectors.toList());
        assertEquals(prodActual, prodExpected);
    }
}
