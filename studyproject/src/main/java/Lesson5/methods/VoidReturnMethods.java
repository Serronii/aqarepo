package Lesson5.methods;

public class VoidReturnMethods {


    //Пример 1 — несколько параметров
    public static int sum(int num1, int num2) {
        int summ = num1 + num2;
        return summ;
    }

    //Пример 2 — разные типы параметров
    public static boolean isLongEnough(String text, int minLength) {
        return text.length() >= minLength;
    }

    //Пример 3 - Метод с параметром-флагом (boolean)
    public static void log(String message, boolean enabled) {   //параметр управляет поведением метода
        if (!enabled) {
            return;
        }
        System.out.println(message);
    }

    //Метод с несколькими параметрами одного типа
    public static int max(int a, int b, int c) {      //больше 2 параметров — нормально
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }





}
