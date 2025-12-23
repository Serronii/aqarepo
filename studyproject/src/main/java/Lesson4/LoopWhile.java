package Lesson4;

import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {


        ///  Цикл вайл выполняется пока условие тру. Проверка условия перед каждой итерацией.
        ///  while — когда не знаем, сколько раз будем крутиться.


        // //////////// Вариант 1 /////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);   // создаём Scanner для ввода с консоли
        System.out.println("Введите число");
        int number = sc.nextInt();             // считываем первое число

        while (number != 0) {                  // УСЛОВИЕ ВЫХОДА (пока введённое число НЕ равно 0)
            System.out.println("Вы ввели: " + number); // выводим введённое число
            System.out.println("Введите новое число");
            number = sc.nextInt();              // считываем следующее число
        }
        System.out.println("Ввод завершён");      // сюда попадаем, когда ввели 0


        // //////////// Вариант 2 //////////////////////////////////////////////////////////////
        Scanner sc2 = new Scanner(System.in);  // создаём Scanner для ввода с консоли
        System.out.println("Введите число");
        int number2 = sc2.nextInt();           // считываем первое число

        while (number2 != 0) {                 // УСЛОВИЕ ВЫХОДА (пока введённое число НЕ равно 0)
            System.out.println("Вы ввели: " + number2); // выводим введённое число
            System.out.println("Введите новое число");
            number2 = sc2.nextInt();             // считываем следующее число

            if (number2 == 0) {                    // если пользователь ввёл 0
                System.out.println("Вы ввели 0. Программа завершена");
            }
        }


        // //////////// Вариант 3 //////////////////////////////////////////////////////////////
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите число");

        while (true) {                            // бесконечный цикл
            int number3 = sc3.nextInt();            // считываем первое число
            System.out.println("Вы ввели: " + number3);

            if (number3 == 0) {                    // условие выхода
                System.out.println("Ввод завершён");
                break;                            // выходим из ЦИКЛА! (ТУТ БРЕЙК ТАК КАК НУЖЕН ВЫХОД ИЗ ЦИКЛА)
            }                                     // В остальных вариантах условие выхода передано в while

            System.out.println("Введите новое число");
        }








    }
}
