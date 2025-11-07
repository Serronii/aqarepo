package lesson1;

public class Cast {

    public static void main(String[] args) {

        // Java allocates a certain amount of memory in bytes for each data type.
        //byte = 1 byte
        //short = 2 bytes
        //int = 4 bytes
        //long = 8 bytes
        //float = 4 bytes
        //double = 8 bytes
        //boolean = 1 bit
        //char = 2 bytes

        int one = 100;
        double two = 4.3;

/**       Auto (implicit) Cast     */
/**    JVM делает это сама, потому что double может вместить любое int. */
      //Переобразование int в double
       double castIntToDouble = one; //
        System.out.println(castIntToDouble);

/**       Manual (explicit) Cast     */
/**    Когда есть риск потери данных, ты должен указать тип вручную в скобках. */
      //Переобразование dobule в int
        int castDoubleToInt = (int) two;
        System.out.println(castDoubleToInt);


      //Practice
        byte a = 1;
        short b = a;
        System.out.println(b + " byte to short");

        byte castToByte = (byte) b;
        System.out.println(castToByte + " explicit");

    }
}
