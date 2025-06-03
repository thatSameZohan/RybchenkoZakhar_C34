import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {

        List <Integer> valueList = List.of(5,2,7,8,4,44,30,21,15,18);
        List <Integer> newValueList=new ArrayList<>();

        for  (Integer el:valueList){
            if (el%2==0){
                newValueList.add(el);
            }
        }
        System.out.println(newValueList);



        Set<Order> orders=new HashSet<>();

        Order order1=new Order(1, "Pizza", Status.NEW);
        Order order2=new Order(2, "Sushi", Status.ATWORK);
        Order order3=new Order(3, "Food", Status.READY);
        Order order4=new Order(3, "Food", Status.READY);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        System.out.println(orders);
        System.out.println(orders.size());

    }
}
