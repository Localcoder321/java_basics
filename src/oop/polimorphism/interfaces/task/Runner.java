package oop.polimorphism.interfaces.task;

public class Runner {
    //Есть три класса:
    //Рыба - умеет плавать
    //Утка - умеет плавать и летать
    // Самолет - умеет летать
    //Создать по экземпляру каждого класса, создав интерфейсы
    //Закинуть плавающих в бассейн (в нем могут быть только те объекты, которые умеют плавать)
    //Отправить летающих в небо (в нем могут быть только те объекты, которые умеют летать)

    static void main() {
        Duck duck = new Duck();
        Airplane airplane = new Airplane();
        Fish fish = new Fish();

        Fly[] flying = {airplane, duck};

        Swim[]  swimming = {fish, duck};

        for (Swim swim : swimming) {
            swim.swim();
        }

        for (Fly fly : flying) {
            fly.fly();
        }
    }

}
