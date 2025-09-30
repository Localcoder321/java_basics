package start.lesson3;

public class Primitives {
    static void main() {
        //Bool values
        //true -> 1
        boolean answerYuri = true;
        //false -> 0
        boolean answerPetr = false;

        //full numbers
        //Byte
        byte maxByte = 127;
        byte minByte = -128;

        //Short -> short number weights 2 bytes or 16 bits
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer -> simple number weights 4 bytes or 32 bits
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long -> full number weights 8 bytes or 64 bits
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Сколько людей на планете?  long
        //Сколько рук у человека byte
        //Есть сигнал или нет? boolean
        //Количество стран в мире? short
        //Сколько жителей в Монако? int

        //Double -> number with dot weights 64 bits
        double myBottle = 1.5;
        //Float -> number with dot weights 32 bits
        float cola = 0.33F;

        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;

        System.out.println(doubleNumber);
        System.out.println(floatNumber);

        //Char -> character символы 16 bit
        char letter = 63;
        System.out.println(letter);

        char newLine = '\n';
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b\n");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);
    }
}
