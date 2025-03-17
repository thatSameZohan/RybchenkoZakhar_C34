import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        //        task 1

        System.out.println("task 1");

        int[]array1={1,4,8,3,5,7};

        System.out.println(Arrays.toString(array1));

        int[]array2=new int[array1.length];

        for (int i=0; i<array2.length;i++){
            array2[i]=array1[array1.length-1-i];
        }

        System.out.println(Arrays.toString(array2));

//        task 2

        System.out.println("task 2");

        int[]array3={1,4,8,9,3,5,7,9,7};

        System.out.println(Arrays.toString(array3));

        int[]array4=new int[array3.length-1];

        int removeEl=(array4.length)/2;

        System.out.println("remove element "+array3[removeEl]);

        for (int i=0; i<array4.length;i++){
            if (i<removeEl){
                array4[i]=array3[i];
            }
            else{
                array4[i]=array3[i+1];
            }

        }

        System.out.println(Arrays.toString(array4));



//        int[] array1 = new int[10];
//
//        array1[0]=10;
//
//        System.out.println(array1[0]);
//
//        Arrays.fill(array1,5);
//
//        System.out.println(Arrays.toString(array1));
//
//        for (int i=0; i<array1.length; i++){
//            array1[i]=i;
//        }
//
//        System.out.println(Arrays.toString(array1));
//
//        int [] array2={2,3,7,1,8};
//
//        for (int el:array2){
//            System.out.print(el+ " ");
//        }
//
//        System.out.println();
//
//        System.out.println(Arrays.toString(array2));
//
//        System.out.println("Enter the number");
//
//       Scanner scanner=new Scanner(System.in);
//       int findNumber= scanner.nextInt();
//       boolean found=false;
//
//       for (int i=0; i<array2.length; i++){
//            if(array2[i]==findNumber){
//                found=true;
//                break;
//            }
//        }
//
//        System.out.println(found ? "Number is found":"Number is not found");
    }
}
