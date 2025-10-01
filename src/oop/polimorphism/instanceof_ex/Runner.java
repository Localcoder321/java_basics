package oop.polimorphism.instanceof_ex;

public class Runner {
    static void main() {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal[] zoo = {cat, dog};

        for (Animal animal : zoo) {
            if(animal instanceof Cat){
                Cat cat1 = (Cat) animal;
                cat1.sayMiau();

                ((Cat) animal).sayMiau();
            }

            if(animal instanceof Cat cat2) {
                cat2.sayMiau();
            }
        }
    }
}
