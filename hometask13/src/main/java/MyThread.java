public class MyThread extends Thread {

    public void run(){

        System.out.println("extends Thread");

        int [] arr={5,4,7,23,66,2,6,122};
        int min=arr[0];

        for (int el: arr){
            if (el<min){
                min=el;

            }
        }

        System.out.println("min="+min);



    }
}
