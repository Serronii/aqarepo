package Lesson4.tasks;

import java.util.Scanner;

public class LoopTasks {

    public static void main(String[] args) {



        // Задача 1///////////////////////////////////////////
        //Написать программу, которая выводит числа от 1 до 10.
//        for (int i = 1; i <=10; i++) {
//            System.out.println(i);
//        }

        //Задача 2/////////////////////////////////////////////
        //Написать программу, которая считает и выводит сумму чисел от 1 до 100.
//        int sum = 0;
//
//        for(int i = 1; i <=100; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);


        // Задача 3///////////////////////////////////////////
        //Пользователь вводит числа с консоли.
        //Программа должна:
        //выводить каждое введённое число
        //завершаться, когда пользователь введёт 0
        //при вводе 0 вывести сообщение
        //«Ввод завершён»

        //1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int number = scanner.nextInt();
//
//        while (number != 0) {
//            System.out.println("Вы ввели: " + number);
//            System.out.println("Введите новое число");
//            number = scanner.nextInt();
//        }
//        System.out.println("Ввод завершён");

        //Задача 4////////////////////////////////////////
        //Пользователь вводит числа.
        //Программа должна:
        //считать сумму только положительных чисел
        //игнорировать отрицательные
        //завершаться при вводе 0
        //после завершения вывести сумму


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите число");
        int number = scanner.nextInt();

        while(number > 0) {
            System.out.println("Вы ввели: " + number);
            sum = number + sum;
            System.out.println("Введите новое число");
            number = scanner.nextInt();
        }
        System.out.println("Цикл закончился, " + sum );


    }
}
