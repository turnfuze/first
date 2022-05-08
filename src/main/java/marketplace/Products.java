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
}
