public class VariablesDemo {
    public static void main(String[] args) {
        // integers
        //byte -128 ... 127
        // byte myByte = 128; - error
        byte myByte = 127;
        byte myByte1 = -127;
        // never use it
        short myShort = 32000;
        // 4 bytes
        int myInt = 32000000;
        // 8 bytes
        long myLong = 323232323232323L;
        long myLong2 = 1231231123123123123L;

        // floats
        float myFloat = 3.14F;

        double myDouble = 32.38;

        float myFloat2 = 3.15F;

        // boolean
        boolean myBoolean = true;
        boolean myBoolean2 = false;

        // characters
        char myChar = 'C';
        char myChar1 = 'a';

        //Strings - referenced - heap
        String myString = "Java";

    }
}
