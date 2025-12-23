package Lesson4.tasks;

import java.util.Scanner;

public class BreakContinueReturnTask {

    ///  break → выйти из цикла
    /// continue → пропустить шаг
    /// return → выйти из метода / программы


    public static void main(String[] args) {

        //Задача 1
        //Программа перебирает числа от 1 до 10.
        //Требования:
        //если число равно 5 → прекратить цикл
        //остальные числа выводить на экран

        for(int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("вы ввели 5"); // cаут нужен перед брейком, так как брейк сразу останавливает цикл
                break;
            }
            System.out.println(i);
        }

        //Задача 2
        //Пользователь вводит числа с консоли.
        //Требования:
        //отрицательные числа не обрабатывать
        //положительные — выводить
        //при вводе 0 программа завершается полностью

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("введите число");
            int number = scanner.nextInt();

            if(number == 0){
                return;
            }

            if(number < 0){
                continue;
            }

            System.out.println("вы ввели :" + number);
        }
    }
}
