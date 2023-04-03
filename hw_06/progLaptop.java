import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class progLaptop {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Lenovo", 8, 256, "Windows 11", "синий", 15.6);
        Laptop laptop2 = new Laptop("Asus", 16, 512, "без ОС", "серый", 16);
        Laptop laptop3 = new Laptop("Apple MacBook Pro 13", 8, 256, "MacOs", "золотистый", 13.3);
        Laptop laptop4 = new Laptop("HP", 4, 2000, "без ОС", "черный", 15.6);
        Laptop laptop5 = new Laptop("Dell", 8, 1000, "Windows 11", "серый", 17);

        Set<Laptop> unicLaptop = new HashSet<Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
        System.out.printf("Всего выборочных ноутбуков: %d \n", unicLaptop.size());

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите характеристики: \n 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println(" 2. Объем жесткого накопителя: ");
        int storUser = sc.nextInt();

        System.out.println(" 3. Диагональ");
        double digUser = sc.nextDouble();

        for (Laptop lap : unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getHardDisk() >= storUser) && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();

    }

}
