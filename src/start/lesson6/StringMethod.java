package start.lesson6;

import java.util.Arrays;

public class StringMethod {
    static void main() {
        String text = "Hello World!";
        //Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //Перевод в нижний регистр
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //Длина строки
        int length = text.length();
        System.out.println(length);

        //Есть ли в тексте другой текст?
        boolean contain = text.contains("Hello");
        System.out.println(contain);

        //Замена всех куска текста (подстроки) на другой текст
        String replacedLetter = text.replaceAll("r", "a");
        System.out.println(replacedLetter);

        //Повторить текст п раз
        String repeatedText = text.repeat(10);
        System.out.println(repeatedText);

        //Разбить текст на массив String
        String names = "Yuri;James;May;Vasya";
        String[] arrayString = names.split(";");
        System.out.println(Arrays.toString(arrayString));

        //Объединение строк (Конкатенация)
        String word1 = "hi ";
        String word2 = "friend";
        String result = word1 + word2;
        System.out.println(result);

        //Начинается нa подстроку
        boolean startsWithHell = text.startsWith("Hell");
        System.out.println(startsWithHell);

        //Заканчивается на подстроку
        boolean endsWithText = text.endsWith("rld");
        System.out.println(endsWithText);

        //Обрезка строки (Первые 5 символов)
        String firstFiveLetters = text.substring(0,5);
        System.out.println(firstFiveLetters);

        //Выбрать текст начиная с 11 символа до конца строки, перевести в нижний регистр,
        //разбить строку на массив по пробелу. Вывести на экран каждое слово из массива и длину строки этого слова
        String name = "my name is Giovanni Giorgio";
        String[] partOfTextLowerCase = name.substring(11).toLowerCase().split(" ");
        for(String res : partOfTextLowerCase) {
            System.out.println(res);
            System.out.println(res.length());
        }
    }
}
