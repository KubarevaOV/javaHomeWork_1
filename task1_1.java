import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        System.out.println("\n\nType num: ");

        Scanner sc = new Scanner(System.in);  
        int num = sc.nextInt();
        int sum = 0;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            factorial = factorial * i;
        }

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + factorial + "\n\n");
        sc.close();
    }
}