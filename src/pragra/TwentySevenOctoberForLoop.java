package pragra;

public class TwentySevenOctoberForLoop{
    public static void main(String[] args) {
       // loop();
        //loo();
        //febn();
        num();
    }
    public static void loop() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print("Hello_");

            }
        }
        }
        public static void loo() {
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("Hello_1 ");
                }
                System.out.println();
            }
        }
    public static void febn() {
        int n = 5, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {

                System.out.print(firstTerm);
            for(int j = i; j <= n;++j){
                System.out.println();
            }

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;


        }
    }
    public static void num() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void nu() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
    public static void n() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    }

