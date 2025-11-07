package lesson1;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.time.LocalDate;

public class Parsing {
    public static void main(String[] args) {

  /**  Парсинг — это процесс разбора строки (текста) на данные нужного типа. */


/**  Пример 1: Парсинг числа из строки */
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println(number + 10);


/**  Пример 2: Парсинг даты */
        String dateStr = "2025-11-07";
        LocalDate date = LocalDate.parse(dateStr); // парсим строку в дату
        System.out.println(date.getYear()); // выведет 2025

/**  Пример 3: Парсинг JSON (сложнее) */
        String json = "{\"name\": \"Alex\", \"age\": 29}";
        JSONObject obj = new JSONObject(json); // парсим JSON
        System.out.println(obj.getString("name")); // Alex
        System.out.println(obj.getInt("age")); // 29


/**  Пример 3: Парсинг из XML в String */




    }
}
