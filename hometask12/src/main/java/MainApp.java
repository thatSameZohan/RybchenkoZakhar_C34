import java.io.*;

public class MainApp {

    public static void main(String[] args)  {

       try (LineNumberReader reader=new LineNumberReader (new FileReader("C://Users/hometask.txt"));
            Writer writerRomeo=new BufferedWriter(new FileWriter("C://Users/romeo.txt"));
            Writer writerGulieta=new BufferedWriter(new FileWriter("C://Users/gulieta.txt"))){

            String read=reader.readLine();
            while (read!=null) {
                if(read.contains("Romeo")) {
                    writerRomeo.write(read + "\n");
                }
                if(read.contains("Gulieta")) {
                    writerGulieta.write(read + "\n");
                }
                read = reader.readLine();
            }
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
    }


}
