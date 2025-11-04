public class DeamonThread implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i <3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Deamon live");
        }


        System.out.println("Deamon ends");
    }
}
