package exercises;

import java.util.Scanner;

public class List2 {
    public static void main(String[] Args) {
        List2.exercise1();
    }

    public static void exercise1() {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Input a number between 1 and 1000, and then, we will show every odd number: ");
        x = sc.nextInt();
        while (x <= 0 || x > 1000) {
            System.out.print("Invalid number, try again: ");
            x = sc.nextInt();
        }
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
