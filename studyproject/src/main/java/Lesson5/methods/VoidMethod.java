package Lesson5.methods;

import java.util.Scanner;

public class VoidMethod {

    /// void — the method does not return anything.

    //void:
    //- может менять данные
    //- может управлять логикой
    //- может управлять циклами
    //- может вызывать другие методы
    //- может работать с вводом / файлами / UI
    //- но НЕ возвращает значение


    //Вариант 1
    public static void sayHello() {
        System.out.println("Hi bitches!");
    }

    //Вариант 2
    //Метод ничего не возвращает, но меняет данные программы.
    static int counter = 0;
    public static void incrementCounter() {
        counter++;
    }

    //Вариант 3
    //Метод принимает решение, может завершиться раньше, ничего не возвращает
    public static void checkNumber(int number) { // принимаем число
        if (number < 0) {                         // если отрицательное
            return;                               // выходим из метода
        }


        number = 0;
        //public static void readUserInput() {
            Scanner scanner = new Scanner(System.in); // создаём Scanner
            number = scanner.nextInt();            // читаем число
            // число считано, но НЕ возвращено
        }

        //Вариант 4
        // void вызывает другие методы (очень важно)

        //public static void startTest() {
            //openPage();     // шаг 1
            //login();        // шаг 2
            //logout();       // шаг 3
        }

