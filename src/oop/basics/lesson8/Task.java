package oop.basics.lesson8;

public class Task {
    //Создать сеть ресторанов, которая обладает общими, для всех ресторанов, запасами продуктов: сосиски, хлеб.
    //Каждый ресторан может подать блюдо: тогда минус 1 сосиска и два куска хлеба из общего запаса.
    //Если сосисок или хлеба не хватает, тогда вывести на экран: HET ингредиентов!
    //Каждый ресторан может принять партию товара: плюс 100 сосисок и 200 кусков хлеба.
    //Запасы продуктов должны быть скрыты от чужих глаз!
    static void main() {
        Restaurant restaurant = new Restaurant();
        Restaurant restaurant2 = new Restaurant();
        restaurant.getOrder();
        restaurant.getSupply();
        restaurant.getOrder();
        restaurant2.getOrder();
    }
}
