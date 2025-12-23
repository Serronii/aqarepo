package Lesson6;

public class StringTask {

    public static void main(String[] args) {


        String title = "Dashboard page";

// 1️⃣ Длина строки
        int length = title.length();
        System.out.println("Length: " + length);

// 2️⃣ Проверка contains
        boolean hasDashboard = title.contains("Dashboard");
        System.out.println("Contains 'Dashboard': " + hasDashboard);
        // так же будет работать если вписать контеинс."деш"

// 3️⃣ Сравнение строк
        boolean isLoginPage = title.equals("Login page");
        System.out.println("Equals 'Login page': " + isLoginPage);








    }
}
