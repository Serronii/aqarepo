package lesson2;

public class ConditionalStatementsIF {

    public static void main(String[] args) {

        /**       The "IF" statement is used to check conditions that evaluate to true or false.    */

        /**                     Check one condition.          */
        if (10 > 9) { // условие
            System.out.println("true"); //выполнение кода если условие = true, если будет false, код не выполнится
        }

        /**                   Check two conditions : true and false       */
        if (10 == 9) {
            System.out.println("True cond"); //выполняется когда тру
        } else {
            System.out.println("false cond"); //выполняется когда фолс
        }

        /**                     Used when there are several options.        */
        int number =  75;

        if (number < 10){
            System.out.println("true conditions1 ");
        } else if (number < 10) {
            System.out.println("false condition2");
        } else if (number <= 10) {
            System.out.println("true condition3");
        } else {
            System.out.println("Els4"); // выполнится если все остальное не тру
        }

        /**                     Conditional logical operators                 */
        //     &  → оба условия должны быть true.
        if (5+4 > 4 & 24 == 20 + 4) {
            System.out.println("true condition 1"); //выполнится если  оба условия должны быть true.
        }

        //     || → хотя бы одно условие true.
        if (5+5 >= 10 || 2+2 == 3) {
            System.out.println("true cond");
        }

        //     ! → меняет значение на противоположное. (changes the meaning to the opposite.)
        int abs = 46;
        if (abs != 55) {
            System.out.println("success");
        }

        /**     Short version of if (ternary operator)   */
        int age = 18;
        String type = (age <= 18) ? "Adult" : "Minor"; //adult = true; minor = false
        System.out.println(type);



    }
}
