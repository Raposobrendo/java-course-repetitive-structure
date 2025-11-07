package exercises;

import java.util.Scanner;

public class List2 {
    public static void main(String[] Args) {
        List2.exercise7();
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

    public static void exercise2(){
        Scanner sc = new Scanner(System.in);

        int in = 0, out = 0, qty, x;

        System.out.print("Choose the quantity of numbers to input. The numbers will be classified in between or not the range of 10 and 20: ");
        qty = sc.nextInt();
        for(int i = 0; i < qty; i ++){
            x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            }
            else{
                out++;
            }
        }
        System.out.printf("In: %d\n", in);
        System.out.printf("Out: %d", out);

        sc.close();
    }

    public static void exercise3(){
        Scanner sc = new Scanner(System.in);

        int qty;
        double x1, x2, x3;

        System.out.print("How much times you want to make a ponderated medium of 3 numbers? (1st * 2, 2nd * 3, 3rd * 5/3): ");
        qty = sc.nextInt();

        for(int i = 0; i < qty; i++){
            System.out.printf("Cicle %d: ", i+1);
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();

            System.out.printf("Ponderated Medium: %.2f\n", ((x1 * 2) + (x2 * 3) + (x3 * 5))/10);
        }

        sc.close();
    }

    public static void exercise4(){
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int qty;

        System.out.print("Select how much division operations do you want to make: ");
        qty = sc.nextInt();
        System.out.println("Choose 2 numbers to make a division: ");

        for(int i = 0; i < qty; i++){
            System.out.print("Number 1: ");
            num1 = sc.nextDouble();
            System.out.print("Number 2: ");
            num2 = sc.nextDouble();
            if(num2 == 0){
                System.out.println("Impossible division");
            }
            else{
                System.out.println(num1/num2);
            }

        }
        sc.close();
    }

    public static void exercise5(){
        Scanner sc = new Scanner(System.in);

        int num, aux = 1;

        System.out.print("Choose a number to make a factorial: ");
        num = sc.nextInt();
        for(int i = 1; i <= num;i++){
            aux *= i;
        }
        System.out.println(aux);

        sc.close();
    }

    public static void exercise6(){
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Select a number and we will show it's divisors: ");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }

    public static void exercise7(){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Select the number to see the square and cube from 1 to the selected number: ");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.printf("%d %d %d\n", i, i*i, i*i*i);
        }
s
        sc.close();
    }
}
