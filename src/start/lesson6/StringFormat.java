package start.lesson6;

public class StringFormat {
    static void main() {
        String name = "Yuri";
        int age = 30;
        String text = String.format("Меня зовут %s. Мне %d лет", name, age);
        System.out.println(text);
        System.out.printf("Меня зовут %s. Мне %d лет\n", name, age);

        //Задача: С помощью String format составить строку:
        //Привет, я менеджер салона [Имя бренда]
        //У нас есть модель - [Имя модели] за [Цена]
        //Есть ли у нее автоматическая коробка передач?
        // [Да/Нет]
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean hasAutomaticTransmission = true;
        String result = String.format("""
                Привет, я менеджер салона %s
                У нас есть модель - %s за %f
                Есть ли у нее автоматическая коробка передач?
                %s""", carMark, carModel, price, hasAutomaticTransmission?"Да":"Нет");
        System.out.print(result);
    }
}
