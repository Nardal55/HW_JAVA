import java.util.ArrayList;
import java.util.List;

public class hw02 {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (isPrime(i)) {
                collection.add(i);
            }
        }

        for (Integer prime : collection) {
            System.out.format("%s ", prime);
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
