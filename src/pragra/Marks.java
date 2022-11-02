package pragra;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        //mar();
        //loops();
        feb();
    }


    public static void mar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Marks:");
        int p = sc.nextInt();
        System.out.println("Enter Chemistry");
        int c = sc.nextInt();
        System.out.println("Enter Maths Marks");
        int m = sc.nextInt();
        System.out.println("Enter Science Marks");
        int s = sc.nextInt();
        System.out.println("Enter Geography Marks");
        int g = sc.nextInt();
        int sum = (p + c + m + s + g);

        if (sum >= 80) {
            System.out.println("Good!You got A+ Grade" + sum);
        }
        //If the average is <80 and >=60 then prints Grade ‘B’
        else if (sum < 80 && sum >= 60) {
            System.out.println("Good!You got B Grade" + sum);
        } else if (sum < 60 && sum >= 40) {
            System.out.println("Good!You got C Grade" + sum);
        } else {
            System.out.println("You got F");
        }
    }

    public static void loops() {
        for (int counter = 1; counter <= 10; ++counter) {
            int sum = 0;
            sum = sum + counter;
            //System.out.println(sum);
            if (counter % 2 == 0) {
                System.out.println(sum);
            }

        }
    }

    public static void fact() {
        int i = 1;
        int factorial = 5;
        int n = 5;
        for (i = 1; i <= n; i++) {
            i = i * n;
            System.out.println(n);
        }

    }

    public static void fac() {
        int n = 4, fact = 1;

        for (int i = 1; i <= n; i++) {

            fact = fact * i;
            System.out.println("4!=" + fact);
        }
    }

    public static void feb() {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");


            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}




