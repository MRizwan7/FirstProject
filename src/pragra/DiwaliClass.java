package pragra;

public class DiwaliClass {
    public static void main(String[] args) {
        //MonthsInfo(5);
        testEvenOrOdd(50);
        //testPositiveOrNegative(0);

    }

    public static void testEvenOrOdd(int x) {

        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }

    public static void testPositiveOrNegative(int x) {


        if (x > 0) {
            System.out.println("Postive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else if (x == 0) {
            System.out.println("ZERO");
        }
    }

    public static void MonthsInfo(int month) {
        if (month == 1) {
            System.out.println("31");
        }

        else if(month == 2) {
            System.out.println("31");
        }

                    else if (month == 3) {
            System.out.println("31");
        } else if (month == 4) {
            System.out.println("31");
        } else if (month == 5) {
            System.out.println("31");
        } else if (month == 6) {
            System.out.println("31");
        } else if (month == 7) {
            System.out.println("31");
        } else if (month == 8) {
            System.out.println("31");
        } else if (month == 9) {
            System.out.println("31");
        } else if (month == 10) {
            System.out.println("31");
        } else if (month == 11) {
            System.out.println("31");
        } else if (month == 12) {
            System.out.println("31");
        }


    }
}



