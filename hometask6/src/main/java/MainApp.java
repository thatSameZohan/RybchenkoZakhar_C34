import org.tms.classes.model.User;
import org.tms.classes.service.Service;

public class MainApp {

    public static void main(String[] args) {

        Service service=new Service();
        System.out.println(service.maxValue(98,14));


        User Cat=new User();
        Cat.setUsername("Citya");
        System.out.println(Cat.getUsername());

        System.out.println(service.print(Cat));
        System.out.println(service.print(10));



    }
}
