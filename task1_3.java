import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type num: ");
        int num1 = sc.nextInt();

        System.out.println("Type +/-: ");
        String symbol = sc.next();
        
        System.out.println("Type num: ");
        int num2 = sc.nextInt();

        if (symbol.equals("+") ) {
            System.out.println("Sum is " + (num1 + num2));
        } else if (symbol.equals("-")) {
            System.out.println("Dif is " + (num1 - num2));
        } else {
            System.out.println("Can't do this!");
        }
        sc.close();
    }
}
