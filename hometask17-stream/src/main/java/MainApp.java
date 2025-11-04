import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        List<Integer> values = List.of(5,2,13,18,18,17,9,9,26,41,39,62,99,88,88);

        List<Integer> even=values.stream()
                .filter(val->val%2==0)
                .collect(Collectors.toList());
        System.out.println(even);

        List <Integer> distinct=values.stream()
                .distinct()
                .toList();
        System.out.println(distinct);

        int sum= values.stream()
                .mapToInt(val->val.intValue())
                .sum();
        System.out.println(sum);

        var max= values.stream()
                .mapToInt(val->val.intValue())
                .max();
        System.out.println(max);

        var big10=values.stream()
                .filter(val->val>10)
                .findFirst();
        System.out.println(big10);


        boolean allMatch=values.stream()
                .allMatch(val->val%10==0);
        System.out.println(allMatch);

        List <String> strings=List.of("Generate","More", "Optional");

        List<Integer> lenght=strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(lenght);

        List <String> upper=strings.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upper);

        List <String> withoutA=strings.stream()
                .filter(s -> !s.contains("a"))
                .toList();
        System.out.println(withoutA);





    }
}
