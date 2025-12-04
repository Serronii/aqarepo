package Lesson3;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {

        /**                     Чтение данных из строки                         */

        String data = "John 25 true";

        Scanner scanner1 = new Scanner(data);

        String name = scanner1.next();      // John
        int age1 = scanner1.nextInt();       // 25
        boolean isQA1 = scanner1.nextBoolean(); // true
        System.out.println(name + ", " + age1 + ", " + isQA1);

        //или считать всю строку.
        String line = scanner1.nextLine();
        System.out.println(line);
    }
}
