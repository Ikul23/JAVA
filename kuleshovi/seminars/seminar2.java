package kuleshovi.seminars;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;
import java.util.UUID;

public class seminar2 {
    public static void main(String[] args) {
        //timeCheck();
       // task1();
       calculator();
       add(0, 0);
       minus(0, 0);
       multi(0, 0);
       divide(0, 0); 
       logging(true, null);
    }
/**
 * Метод замеряющий время отклика на обработку операции рандомного добавления строк UUID
 */
    static void timeCheck() {
        String buf = "";
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 90000; i++) {
            buf += UUID.randomUUID();
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Операция выполнена за " + (endTime - startTime) / 1000 + " секунд");
    }
/**
 * Метод преобразования в частотный массив строки введенной пользователем строки
 */
static void task1() {
    char c = 'a';
    int codeA = c;
    int[] statistic = new int[26];
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите строку:");
    String s = scanner.nextLine();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
            statistic[(s.charAt(i) - codeA)]++;
        }
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < statistic.length; i++) {
        if (statistic[i] > 0) {
            stringBuilder
                    .append((char) (i + codeA))
                    .append(statistic[i])
                    .append('\n');
        }
    }
    System.out.println(stringBuilder.toString());
}

/**
 * Метод создания калькулятора вещественных чисел
 */
static void calculator() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите первое число:");
    double x = Double.parseDouble(scanner.nextLine());
    System.out.print("Введите операцию (+ - * /): ");
    char operation =  scanner.nextLine().charAt(0);
    System.out.print("Введите второе число:");
    double y = Double.parseDouble(scanner.nextLine());
    switch (operation) {
        case '+': System.out.println(x + '+' + y + '=' + add(x,y));
        break;         
        case '-': System.out.println(x + '-' + y + '=' + minus(x,y));
        break;            
        case '*': System.out.println(x + '*' + y + '=' + multi(x,y));
        break;            
        case '/': System.out.println(x + '/' + y + '=' + divide(x,y));
        break;            
        default:
        System.out.print("Wrong operation!");
            break;
    }
}
/**
 * Ниже статические методы ля метода калькулятор
 * @param a
 * @param b
 * @return
 */
static double add(double a, double b) {
    return a + b;
}
static double minus(double a, double b) {
    return a - b;
}
static double multi(double a, double b) {
    return a * b;
}
static double divide(double a, double b) {
    if (b != 0) return a / b;
    return -1;
    }
    

static void logging(boolean append, String note) {
    try {
        File file = new File("log.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file, append);
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
        fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

