import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Станислав", List.of("8 999 3344332", "8 922 8393839"));
        phoneBook.put("Олег", List.of("8 922 8332923", "8 999 8372623"));
        phoneBook.put("Елена", List.of("8 988 1122334", "8 933 9988776"));
        phoneBook.put("Иван", List.of("8 918 6655443", "8 999 4455667"));
        phoneBook.put("Василиса", List.of("8 911 3322449", "8 977 8811663"));

        menu(phoneBook);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static void find(Map<String, List<String>> phoneBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(phoneBook.get(name));
    }

    public static void allBook(Map<String, List<String>> phoneBook) {
        System.out.println(phoneBook);

    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phonеBook) {
        System.out.println(
                "Выберите команду: find - найти контакт, all - показать телефонную книгу, exit - выйти");
        while (true) {
            String comands = scanner();
            if (comands.equals("exit")) {
                break;
            } else {
                switch (comands) {
                    case "find":
                        find(phonеBook);
                        break;
                    case "all":
                        allBook(phonеBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phonеBook;
    }
}
