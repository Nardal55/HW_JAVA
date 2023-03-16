
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class hw02 {
    public static List<Integer> randomList(int size) {

        Random random = new Random();
        List<Integer> randomList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(10));
        }

        System.out.println(randomList.toString());
        return randomList;
    }

    public static void allResult(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = list.size();
        int sum = 0;

        for (Integer i : list) {
            sum += i;
        }

        double result = sum / count;
        BigDecimal bd = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
        

        System.out.printf(" Минимальное: %d\n Mаксимальное: %d\n Cреднее арифметическое: %f\n", min, max, bd);

    }

    public static void main(String[] args) {
        allResult(randomList(10));
    }

}
