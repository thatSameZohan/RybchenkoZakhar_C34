import java.util.Scanner;

public class SomeClass {

    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scanner= new Scanner(System.in);
        int number=scanner.nextInt();
        int counter=0;
        while (number%10==0){
            counter=counter+1;
            number=number/10;
        }

        System.out.println(counter+" nuuls");

    }
}
