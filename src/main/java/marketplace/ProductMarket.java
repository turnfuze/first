package marketplace;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private List<Products> products;

    public ProductMarket(List<Products> products) {
        this.products = products;
    }

    public List<String> getAllNames() {
        return products.stream()
                .map(product -> product.getName())
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Products> more10() {
        return products.stream()
                .filter(product -> product.getPrice() > 10)
                .collect(Collectors.toList());
    }

    public List<Products> smaller0() {
        return products.stream()
                .filter(prod -> prod.getPrice() < 0)
                .collect(Collectors.toList());
    }

    public List<?> returnPriceUsString() {
        return products.stream()
                .map(product -> product.getPrice())
                .collect(Collectors.toList());
    }

    public List<?> returnPriceUsOneString() {
        return products.stream()
                .map(product -> product.getPrice())
                .collect(Collectors.toList());
    }
}
