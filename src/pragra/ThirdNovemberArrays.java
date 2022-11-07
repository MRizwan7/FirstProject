package pragra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirdNovemberArrays {
    public static void main(String[] args) {
mark();
    }
    public static void marks(){
        int array[]=new int[10];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<=9;i++){
            System.out.println("Enter Marks");
            array[i]=sc.nextInt();

        }
        //for(int i=0;i<=9;i++){
            //System.out.println(array[i]);
        //}
        ////   OR
        System.out.println(Arrays.toString(array));

    }
    public static void mark(){
        //int array[]=new int[10];
        int arrays[]={1,2,3,4,5};
        System.out.println(arrays) ;
        //int ar[]={1,2,3,4,5,6};

        //  OR
        //int a[]=new int[] {1,2,3,4,5,6};
    }
    public static void student(){
        int marks[]=new int[1000];
        Random r= new Random();
        for(int i=0;i<=999;i++){
            marks[i]=r.nextInt(10);

        }
    }
}
