import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainApp {
    public static void main(String[] args) {

        Worker worker1=new Worker(3000);
        Worker worker2=new Worker(2000);
        Worker worker3=new Worker(1500);
        Worker worker4=new Worker(2500);

        Predicate<Worker> isRich=(worker) -> worker.getSalary()>=3000;
        System.out.println(isRich.test(worker1));

        Consumer<Worker> printSalary= (worker) -> System.out.println(worker.getSalary());
        printSalary.accept(worker1);

        Supplier<String> print = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        };
        System.out.println(print.get());

        Function<Worker,Integer> toSalary=(worker)->worker.getSalary();
        System.out.println(toSalary.apply(worker1));

        Set<Worker> workers=new TreeSet<>((o1,o2)->o1.getSalary() - o2.getSalary());
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        System.out.println(workers);

    }
}
