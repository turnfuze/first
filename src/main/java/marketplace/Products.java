package marketplace;

import lombok.*;

import java.util.Objects;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Products {
    @Setter
    @Getter
    private String name;
    @Getter
    private float price;

//    public Products(String name, float price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Products products = (Products) o;
//        return Float.compare(products.price, price) == 0 && Objects.equals(name, products.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, price);
//    }
//
//    @Override
//    public String toString() {
//        return "Products{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                '}';
//    }
}
