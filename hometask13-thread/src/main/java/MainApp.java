public class MainApp {

    public static void main(String[] args) throws InterruptedException {

        Thread deamon = new Thread(new DeamonThread());
        deamon.setDaemon(true);
        deamon.start();

        Thread threadExtends =new MyThread();
        Thread threadRunnable = new Thread(new RunnableImpl());



        threadExtends.start();
        threadRunnable.start();


        threadExtends.join();
        threadRunnable.join();

        System.out.println("stop MainApp");
    }
}
