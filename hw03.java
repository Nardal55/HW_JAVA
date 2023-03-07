import java.util.Scanner;

public class hw03 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = Result(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

    public static int scanNumber() {
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        return number;
    }

    public static String scanOperations() {
        Scanner iScanner = new Scanner(System.in);
        String operations = iScanner.nextLine();
        return operations;

    }

    static int Result(String calc, int num1, int num2) {
        int result = 0;
        switch (calc) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

}
