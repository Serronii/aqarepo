package Lesson5.task;

public class UserUtils {


    //1. Метод проверки строки
    //Метод:
    //принимает String text
    //принимает int minLength

    //возвращает boolean

    //Логика:
    //если text == null → false
    //если длина строки меньше minLength → false
    //иначе → true


//    public static boolean name(String text, int minLenght) {
//        if(text == null) {
//            return false;
//        }
//
//        if(text.length() < minLenght) {
//            return false;
//        }
//        return true;
//    }

    //2. Метод подсчёта чисел
    //Метод:
    //принимает int limit
    //возващает int

    //Логика:
    //посчитать сумму чисел от 1 до limit
    //если limit <= 0 → вернуть 0
    //(используйте цикл)


    public static int count(int limit) {
        if (limit <= 0) { //  входные параметры проверяем в первую очередь!
            return 0;
        }

        int sum = 0;
        for(int i = 1; i <= limit; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //   Задача 3 — СЛЕДУЮЩАЯ
    //  Перегрузка метода sum
    //Создайте два метода с одинаковым именем:
    // Оба метода:
      //возвращают сумму чисел
     // ничего не печатают
     //только считают и return

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static int sum(int a, int b){
        return a + b;
    }

    //Задача 4 — ПОСЛЕДНЯЯ
    //Метод-действие (void)
    //Метод:
    //принимает String name
    //принимает int age
    //Логика:
    //если name == null → сразу выйти из метода
    //если age < 18 → вывести одно сообщение
    //если age >= 18 → вывести другое сообщение
    //Метод:
    //ничего не возвращает
    //только выполняет действие

    public static void nameMethod(String name, int age) {
        if (name == null) {
            return;
        }
        if(age < 18) {
            System.out.println("Age less than 18");
        } else {
            System.out.println("Age accepted");
        }
    }







}
