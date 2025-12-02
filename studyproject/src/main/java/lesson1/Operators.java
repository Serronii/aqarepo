package lesson1;

public class Operators {

    public static void main(String[] args) {

        /**                     Addition operator   +                             */
        //Арифметическое сложение
        int a = 10;
        int b = 2;

        int sum = a + b;
        System.out.println(sum);
        System.out.println(a + b);
        System.out.println(10 + 2);

        //Конкатенация строк
        String text = "My name is " + "Serhi";
        System.out.println(text);

        /**                      Subtraction operator       -                    */
        //Арифметическое вычитание
        int c = 10 - 3;
        System.out.println(c);

        //Унарный минус (negation)
        int x = 5;
        int y = -x;
        System.out.println(x + y + " What's happened");


        /**                      Division operator       /                        */
        int h = 7;
        int d = 2;
        int result = h / d;


        /**                      Remainder operator       %                        */
        //  Moduluce (%) - (остаток от деления)

        int cc = 9;
        int dd = 2;

        //  (Сколько раз 2 помещается в 9? 4 раза, 9-8 = 1)
        int result1 = cc % dd;
        System.out.println(result1 + " Остаток от деления ");


        /**                      Increment (Инкремент)  / Декремент — decrement                       */
        int i = 0;
        System.out.println(i++ + " postfix increment"); //выведет 0

        int j = 0;
        System.out.println(++j + " prefix increment"); // выведет 1


        System.out.println("///////////////////////////");

        int ig = 0;
        System.out.println(ig-- + " ig postfix decrement"); //

        int jg = 0;
        System.out.println(--jg + " prefix decrement"); //

        System.out.println("///////////////////////////");

        for (int f = 0; f < 5; f++) {
            System.out.println(f + " postfix increment цикл 1"); // выведет: 0 1 2 3 4
        }

        System.out.println("///////////////////////////");

        for (int hh = 0; hh < 5; ++hh) {
            System.out.println(hh + " prefix increment цикл 2"); // выведет: 0 1 2 3 4
        }


    }
}
