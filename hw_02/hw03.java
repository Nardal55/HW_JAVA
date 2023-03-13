import java.io.IOException;
import java.lang.System.Logger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

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

    public static String loggerScan(String log) throws IOException { // int тоже пробовал (не работает)
        Logger loger = Logger.getLogger(hw03.class.getName());
        FileHandler fHandler = new FileHandler("hw03.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);
        loger.info(Arrays.ToString(log));
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
