package exercises;

import java.util.Scanner;

public class List1 {
    public static void main(String[] Args) {
        List1.exercise3();
    }

    public static void exercise1() {
        Scanner sc = new Scanner(System.in);

        int password, guess;

        password = 2002;
        System.out.print("Input password: ");
        guess = sc.nextInt();

        while (password != guess) {
            System.out.print("Wrong password, try again: ");
            guess = sc.nextInt();
            if (password == guess) {
                System.out.println("Access permited.");
            }
        }

        sc.close();
    }

    public static void exercise2() {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Input x and y coordinates to show which quadrant it belongs. If any is 0, it will end: ");
        System.out.print("X: ");
        x = sc.nextInt();
        System.out.print("Y: ");
        y = sc.nextInt();


        while (x != 0 && y != 0) {
            if (x < 0 && y > 0) {
                System.out.println("First");
            } else if (x > 0 && y > 0) {
                System.out.println("Second");
            } else if (x < 0) {
                System.out.println("Third");
            } else {
                System.out.println("Fourth");
            }
            System.out.println("Input again x and Y: ");
            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();
        }

        System.out.println("End");
        sc.close();
    }

    public static void exercise3(){
        Scanner sc = new Scanner(System.in);

        int fuel, gasoline = 0, alcohol = 0, diesel = 0;

        System.out.println("Choose your fuel:");
        System.out.println("1 - Gasoline");
        System.out.println("2 - Alcohol ");
        System.out.println("3 - Diesel");
        System.out.println("4 - Exit");
        fuel = sc.nextInt();

        while(fuel != 4){
            if(fuel == 1){
                gasoline++;
            }
            else if(fuel == 2){
                alcohol++;
            }
            else if(fuel == 3){
                diesel++;
            }
            else{
                System.out.println("Invalid code");
            }
            fuel = sc.nextInt();
        }
        System.out.println("THANK YOU!");
        System.out.printf("Gasoline: %d\n", gasoline);
        System.out.printf("Alcohol: %d\n", alcohol);
        System.out.printf("Diesel: %d\n", diesel);



        sc.close();
    }
}
