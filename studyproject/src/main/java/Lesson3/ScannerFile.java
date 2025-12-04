package Lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) throws FileNotFoundException {


        /**                     Чтение данных из файла                     */
        Scanner scanner = new Scanner(new File("src/data.txt"));
        String row = scanner.nextLine();
        System.out.println(row);

        //Проверка существует ли еще строки в файле
        if (scanner.hasNextLine()){
            String row2 = scanner.nextLine();
            System.out.println(row2);
        } else {
            System.out.println("File finished after the first line ");
        }
        scanner.close(); // закрытие сканера после всех операций.









        //Задачка вывести все строки из файла и поместить их в лист
    }
}
