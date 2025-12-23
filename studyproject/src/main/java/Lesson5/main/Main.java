package Lesson5.main;

import Lesson5.methods.OverloadMethod;
import Lesson5.methods.VoidReturnMethods;
import Lesson5.methods.testMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        int result = VoidReturnMethods.sum(10, 53);
//        System.out.println(result);


        // задача 1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите строку");
//        String input = scanner.nextLine();
//        System.out.println("Введите лимит");
//        int limit = scanner.nextInt();
//
//        if(testMethod.validLength(input,limit)) { // иф выполняется только когда тру
//            System.out.println("Правильная строка");
//        } else { // елс если фолс
//            System.out.println("неправильная строка");
//        }


        testMethod.counting(4,2);

        OverloadMethod.sum(34,54,4.4);

        System.out.println(OverloadMethod.sum(3,4));

    }
}
