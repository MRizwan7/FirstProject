import java.util.Scanner;

public class Diwaaliclass {
    public static void main(String[] args) {
        //GreatestOfNumbers(2,7,7);
        int x=10;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value");
        int Entervalue = sc.nextInt();
        System.out.println(Entervalue);


    }

    public static void GreatestOfNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Largest Number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest Number is " + b);
        } else {
            System.out.println("Largest Number is " + c);
        }
    }

    public static void Person(boolean notActive) {
        if (notActive) {
            System.out.println("You are Lazy Person");
        }
    }

}


