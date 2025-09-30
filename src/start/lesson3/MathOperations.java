package start.lesson3;

public class MathOperations {
    static void main() {
        int x = 10;
        int y = 5;

        //Add
        int sum = x+y;
        System.out.println(sum);

        //Difference
        int diff = x-y;
        System.out.println(diff);

        //Multiply
        int multiply = x*y;
        System.out.println(multiply);

        //Divide
        int div = x/y;
        System.out.println(div);
        y = 3;
        double divide = (double)x/y;
        System.out.println(divide);

        //Increment
        x = x+1;
        x++;
        x+=10;
        System.out.println(x);

        //Decrement
        x = x-1;
        x--;
        x-=1;
        System.out.println(x);

        //Остаток после деления
        int number = 4;
        int modulo = number % 3;
        System.out.println(modulo);

        //Скобки
        int z = (2+2)*2;
        System.out.println(z);

        // Создать переменные с ростом (!в метрах), весой.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        double height = 1.75;
        int weight = 85;
        double index = (double) weight/(height*height);
        System.out.println(index);
    }
}
