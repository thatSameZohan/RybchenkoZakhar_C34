import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    private int salary;

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                '}';
    }



}
