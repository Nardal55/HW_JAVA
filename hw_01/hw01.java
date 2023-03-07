package hw_01;

import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", additionNumber(i));
        System.out.printf("Факториал: %d\n", Factorial(i));
        iScanner.close();
    }

    public static int additionNumber(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int Factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }

}
