package pragra;

import java.util.Scanner;

public class Practice {
    public static final void main(String[] args) {
marks();
    }

    public static void marks() {
        int marks[] = {1,2,8,5,32};

        int sum=0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter Marks");

            sum=sum+marks[i];

        }

            System.out.println(sum);
    }
}
