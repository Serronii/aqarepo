package Lesson3;

import java.util.Scanner;


public class ScannerConsole {


    public static void main(String[] args) {

        /**   Scanner — это класс из пакета java.util, который позволяет читать данные:
         из консоли,
         из файла,
         из строки,
         из других потоков ввода.  */

        //класc   //перем    //cоздание обьекта  //класс сканер  //тип входа данных
        Scanner   scanner  =        new           Scanner        (System.in);

        /**                     Чтение строки из консоли                         */

        //Чтение целой строки из консоля
        System.out.println("Введите имя: ");
        String userInput = scanner.nextLine(); // считывает весь ввод в консоль
        System.out.println("Имя пользователя : " + userInput);

        // Чтение одного слова из консоля
        System.out.print("Введите город: ");
        String city = scanner.next(); // cчитывает только 1 слово до пробела
        System.out.println("Город: " + city);

        //Чтение int
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt(); // nextInt !
        System.out.println("Возраст: " + age);

        //Чтение double
        System.out.print("Вы QA? (true/false): ");
        boolean isQA = scanner.nextBoolean();
        System.out.println("Ответ: " + isQA);

        //Чтение математического оператора
        System.out.println("Введите оператор + - / *");
        char oper = scanner.next().charAt(0); //вписываем 0 индекс, чтобы оно вытянуло 1 символ из слова
        System.out.println("Вы выбрали : " +  oper);

                                   //Проверка перед чтением
        System.out.println("Please enter the value");
        if (scanner.hasNextInt()) {   // scanner.hasNextInt()
            int value = scanner.nextInt();
            System.out.println("You entered " + value);
        } else {
            System.out.println("It is not int!");
        }

    }
}
