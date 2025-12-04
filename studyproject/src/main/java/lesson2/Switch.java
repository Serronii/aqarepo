package lesson2;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

  /**  Switch — это conditional statement, который выбирает, какой блок кода выполнить, в зависимости от значения
    переменной.  */

        Scanner scanner = new Scanner(System.in);


        //                  ПЕРВЫЙ ПРИМЕР               !
        System.out.println("Please enter the user type with a capital letter :");
        String user = scanner.nextLine();

        switch (user) { // свитч хавает только переменные и выражение (a + b пример)
            // тип case должен совпадать с типом переменной.
            //' ' — это символ (тип char)
            //" " — это строка (тип String)
            // 1,2,3 - это число
            // enum значение
            // switch не работает с double/float

            case "Serhii": // передаем возможный вариант который будет в свитч переменной
                System.out.println("Middle AQA Engineer"); //выполняется код если case value == user variable
                break; //  брейк останавливает свитч (выходит из него)
            case "Ioana":
                System.out.println("Middle AQA Engineer");
                break;
            case "Alex":
                System.out.println("QA Team Lead");
                break;
            default:
                System.out.println("Unknown user");
        }
// //////////////////////////////////////////////////////////////////////////////////////////
//                         ВТОРОЙ ПРИМЕР                     //
        System.out.println("Введите первое число");
        double first = scanner.nextInt();

        System.out.println("Введите оператор");
        char oper = scanner.next().charAt(0);

        System.out.println("Введите второе число");
        double second = scanner.nextInt();

        double result;

        switch (oper) {
            case '+' :
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '/' :
                if (first ==0 || second ==0){
                    System.out.println("Ошибка деления на 0");
                    return; // останавливает весь метод.
                }
                result = first / second;
                break;
            case '*':
                result = first * second;
                break;
            default:
                System.out.println("unknown operator");
                return; // останавливает весь метод.
        }
        System.out.println("Результат : " + result);

        //return нужен, когда после switch есть код, который нельзя выполнять в случае default.
        //Если после switch можно продолжать работать без проблем, return не нужен.


        scanner.close();

    }
}
