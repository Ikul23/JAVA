package kuleshovi.seminar_api_creation;

import java.util.Scanner;

/**
 * seminars
 */
public class seminars {
/**
 * Точка входа в приложение
 * @param args
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean f = true;
    
    while (f) {
        System.out.println("МЕНЮ ПРИЛОЖЕНИЯ");
        System.out.println("1 - Задача1");
        System.out.println("2 - Задача2");
        System.out.println("0 - завершение работы приложения!");
        System.out.println("=================================");
        System.out.print("Укажите номер задачи: ");

        int no = Integer.parseInt(scanner.nextLine());

        switch (no) {
            case 1:
                printName();
                System.out.println("  ");
                break;
            case 2:
                String str = ("Добро пожаловать на курс Java!");
                printWords(str);
                System.out.println("  ");
                break;
            case 0:
                System.out.println("0 - завершение работы приложения!");
                f = false;
                break;
            default:
                System.out.println("Вы указали неверный номер задачи\nПовторите попытку");
                break;
        }
   
    }

}

/**
 * Распечатать мое имя
 */
static void printName() {
    System.out.print("Введите свое имя: ");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    System.out.println("Привет, " + str + "!");
}

/**
 * Метод позволяет распечатать предложение наоборот
 *
 * @param s мое предложение
 */
static void printWords(String s) {
    String[] words = s.split(" ");
    for (int i = words.length - 1; i >= 0; i--) {
        System.out.print(words[i] + " ");
    }
    System.out.println();
}

}
