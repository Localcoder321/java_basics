package start.lesson5;

import java.util.Arrays;

public class Array {
    static void main() {
        int x = 5;
        int y = 10;
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[] {y,x};
        System.out.println(Arrays.toString(array2));
        int[] array3 = {x,y};
        System.out.println(Arrays.toString(array3));

        //Практическое задание
        //Ответить на вопрос "Столица Катара?" и записать в массив (какого то типа)
        String[] countryArray = new String[] {"D", "O", "X", "A"};
        System.out.println(Arrays.toString(countryArray));
    }
}
