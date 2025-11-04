import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString

public class Order {
    private int id;
    private String name;
    private Status status;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(name, order.name) && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }
}
