package Lesson6;

public class StringLesson {

    /// String is an object that stores text.
    public static void main(String[] args) {


    String title = "Login page";


    /// length() — длина строки
    String text = "Hello";
    int len = text.length();
    System.out.println(len); // 5


    /// equals() — сравнение строк (ОЧЕНЬ ВАЖНО)
        String a = "Login";
        String b = "Login";

        System.out.println(a.equals(b)); // true
        System.out.println("///////////////////////////");

       //❌ НЕЛЬЗЯ
       //   a == b

    /// contains() — содержит ли строка подстроку
        String title1 = "Login page";

        System.out.println(title1.contains("Login")); // true
        System.out.println(title1.contains("Home"));  // false


    /// startsWith() / endsWith()
        String url = "https://google.com";
        url.startsWith("https"); // true
        url.endsWith(".com");    // true






    }
}
