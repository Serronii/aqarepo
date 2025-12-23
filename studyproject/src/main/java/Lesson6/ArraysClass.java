package Lesson6;

public class ArraysClass {

    public static void main(String[] args) {


    ///  An array -  is a variable that stores multiple values of the same type.


//    Indexes start from 0.
//    int[] numbers = {1, 2, 3, 4};
//
//        System.out.println(numbers.length); // количество елементов (4)
//        System.out.println(numbers[1]); //проверка 1 индекса


    String[] titles = {
            "Home",
            "Login",
            "Dashboard",
            "Settings"
    };
        // Проверка с конца, ищем через length (КОГДА НЕ ЗНАЕМ ТОЧННЫЙ ИНДЕКС)
//        System.out.println(titles[titles.length -1]); //проверка 2 елемента с конца
//
//        //или
//
//        String secondLastTitle = titles[titles.length -1]; //проверка 1 елемента с конца
//        System.out.println(secondLastTitle);
//
//        //(КОГДА ЗНАЕМ ТОЧНЫЙ ИНДЕКС
//
//        System.out.println(titles[3]); //псследний индекс

        //titles.length - ЭТО ВЫЗОВ ЧИСЛА ЕЛЕМЕНТОВ ЛИСТА
        //titles[1] - ЭТО ВЫЗОВ 1 ИНДЕКСА ИЗ ЛИСТА


        ///  1. Перебор массива   //////////////////////////////////////////////////////////////////
                         // всегда < если сравниваем индексы с количеством елементов.
        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]); //тут мы выводим индексы с 0 начинаем
            // 0 < 4      Сравниваем значение переменной і с Числом длинны ЛИСТА = 4
            // 1 < 4
            // 2 < 4
            // 3 < 4
            // 4 < 4 Ошибка (МЫ значения i присваиваем листу titles[i], а у нас только 3 индекса
        }

        /// 2. For-each (упрощённый перебор)  //////////////////////////////////////////////////
        ///    Iterates through all elements without indexes.

        for (String title : titles) {
            System.out.println(title);
        }

        /// Нельзя добавлять / удалять элементы в МАССИВ
        titles[4] = "New"; // ❌ если размер = 4









    }
}
