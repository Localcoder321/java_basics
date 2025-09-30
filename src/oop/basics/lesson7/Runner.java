package oop.basics.lesson7;

import oop.basics.lesson7.book.Book;
import oop.basics.lesson7.zoo.Zoo;

public class Runner {
    static void main() {
        Cat cat = new Cat("Black", 12.4, "Petr");
        System.out.println(cat.color);
        System.out.println(cat.ownerName);
        System.out.println(cat.weight);
        cat.color = "Red";
        System.out.println(cat.color);
        cat.destroySofa("Walik");
        String hunt = cat.hunt(false);
        String hunt2 = cat.hunt(false, false);
        System.out.println(hunt);
        System.out.println(hunt2);
        cat.hunt("Morning");

        cat.feed("Michael", "Fish", "Water", "Milk");
        System.out.println("\n--------------------------");

        Book book = new Book("Martin Iden", "Djek London", 120, false);
        book.countRowsOnPage();
        book.countRowsOnPage(52);
        book.aboutTheBook();
        System.out.println("\n--------------------------");

        Dog dog = new Dog("Boxter", 14, "Maxim");
        System.out.println(dog);
        dog.setWeight(24);
        System.out.println(dog);
        System.out.println(dog.getOwner());

        Dog dog2 = new Dog();
        System.out.println(dog2);
        System.out.println("\n--------------------------");

        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }
}
