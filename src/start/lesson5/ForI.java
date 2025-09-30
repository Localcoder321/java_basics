package start.lesson5;

public class ForI {
    static void main() {
        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }

        //Практическое задание Nº1
        //Распечатать все четные числа из массива numbers2
        int[] numbers2 = {3, 2, 10, 5, 8};
        for (int number : numbers2) {
            if(number % 2 == 0) {
                System.out.println("Even number " + number);
            }
        }

        //Практическое задание Nº2
        //Распечатать все элементы под четными индексами из массива numbers2
        for (int i = 0; i < numbers2.length; i+=2) {
            System.out.println(numbers2[i]);
        }
    }
}
