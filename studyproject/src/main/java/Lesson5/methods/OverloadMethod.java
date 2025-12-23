package Lesson5.methods;

public class OverloadMethod {

    ///  Method overloading is when methods have the same name but different parameters

    /// Перегрузка — это когда у методов одно и то же имя,
    /// но разные параметры.
    /// Java выбирает нужный метод по аргументам, которые вы передаёте.


    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, int b, double c) {
        return a + b + c;
    }



}

