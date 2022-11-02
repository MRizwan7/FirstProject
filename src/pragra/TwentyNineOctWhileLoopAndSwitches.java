package pragra;


import java.util.Scanner;

public class TwentyNineOctWhileLoopAndSwitches {
    public static void main(String[] args) {

//double x=(int)45.6;
        //System.out.println(x);
        //gam();
        arr();
    }

    //WHILE LOOP
    public static void gam() {
        int thought = (int) (Math.random() * 10);
        System.out.println("Enter a number: ");
        Scanner sec = new Scanner(System.in);
        while (true) {
            int GuessedNumber = sec.nextInt();
            if (GuessedNumber == thought) {
                System.out.println("You Win");
                break;
            } else {
                System.out.println("Try Again");
            }
        }
    }

    public static void game() {
        int thoughtNumber;
        thoughtNumber = (int) (Math.random() * 10);
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        while (true) {
            int guessedNumber = s.nextInt();
            if (guessedNumber == thoughtNumber) {
                System.out.println("Right Answer");
                break;
            } else {
                System.out.println("TRY AGAIN");
            }


        }
    }

    public static void game2() {
        int thought = (int) (Math.random() * 10);
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        while (thought != guess) {
            System.out.println("wrong guess");
            guess = sc.nextInt();


            //if(thought==guess){
            //  System.out.println("GOOD");
            //break;
            //}
            //else {
            //  System.out.println("bad");
            //}
        }
        System.out.println("pass");

    }

    public static void game3() {
        int thought = (int) (Math.random() * 10);
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Keep Guessing");
            guess = sc.nextInt();


            //if(thought==guess){
            //  System.out.println("GOOD");
            //break;
            //}
            //else {
            //  System.out.println("bad");
            //}
        } while (thought != guess);
        System.out.println("pass");

    }
    ///////////DO-While LOOP

    public static void month() {
        System.out.println("Enter a month: ");
        Scanner scc = new Scanner(System.in);
        int num = scc.nextInt();
        if (num == 1 || num == 2 || num == 5 || num == 7 || num == 9 || num == 12) {
            System.out.println("31 days");
        } else if (num == 3 || num == 4 || num == 6 || num == 8 || num == 10 || num == 11) {
            System.out.println("30 days");
        } else {
            System.out.println("Enter Correct Value");
        }
    }

    public static void months() {
        System.out.println("Enter a month:1 to 12. ");
        Scanner scc = new Scanner(System.in);
        int num = scc.nextInt();

        switch (num) {
            case 1:
                System.out.println("31 days");
                break;

            case 2:
                System.out.println("30 days");
                break;

            case 3:
                System.out.println("29 days");
                break;

            case 4:
                System.out.println("28 days");
                break;
            case 5:
                System.out.println("27 days");
                break;
            case 6:
            case 7:
                System.out.println("26 days");
                break;
            default:
                System.out.println("Invalid");
                break;


        }

    }

    //////break&&&&&& continue

    public static void bre() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ENTER" + i);
            if (i == 5) {
                break;
            }
            System.out.println("END" + i);
        }
    }

    public static void con() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ENTER" + i);
            if (i == 5) {
                continue;
            }
            System.out.println("END" + i);
        }
    }

    //////ARRAYS

    public static void arr(){
        int marks1=10;
        int marks2=10;
        int marks3=10;
        int marks4=10;
        int marks5=10;
        System.out.println(marks1);
        System.out.println(marks2);
        System.out.println(marks3);
        System.out.println(marks4);
        System.out.println(marks5);

        int[]  arr= new int[10];

        //arr[0] =10;
        //arr[1] =10;
        //arr[2] =10;
        //System.out.println(arr);
for(int i=0;i<=9;i++){
    arr[i]=10;
    System.out.println(arr[i]);
}
        //for(int i=0;i<=9;i++){
        //  System.out.println(arr[i]);
        //}


    }
}


