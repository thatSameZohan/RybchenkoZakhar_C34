public class RunnableImpl implements Runnable{
    @Override
    public void run() {

        System.out.println("implements Thread");

        int [] arr={5,4,7,23,66,2,6,122};
        int max=arr[0];

        for (int el: arr){
            if (el>max){
                max=el;

            }
        }

        System.out.println("max="+max);


    }
}
