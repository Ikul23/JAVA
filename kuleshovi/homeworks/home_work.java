//Задание
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре будут 
//повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
//Вывод должен быть отсортирован по убыванию числа телефонов.


package kuleshovi.homeworks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class home_work {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Иванов", "144-456-700");
        addContact(phoneBook, "Иванов", "123-456-789");
        addContact(phoneBook, "Петров", "987-654-321");
        addContact(phoneBook, "Сидоров", "111-222-333");
        addContact(phoneBook, "Иванов", "555-666-777");
        addContact(phoneBook, "Петров", "888-999-000");
        
        printPhoneBook(phoneBook);    
    }

    // Метод для добавления контакта в телефонную книгу
    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для вывода отсортированной телефонной книги
    public static void printPhoneBook(Map<String, List<String>> phoneBook) {
        
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        
        entries.sort(Comparator.comparingInt(entry -> entry.getValue().size()));

        for (int i = entries.size() - 1; i >= 0; i--) {
            Map.Entry<String, List<String>> entry = entries.get(i);
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println("Фамилия: " + name + "    " + "Номер телефона: " + phoneNumbers);
        }
    }
}