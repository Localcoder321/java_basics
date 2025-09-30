package oop.inheritance.lesson9.task;

public class Task {
    //Мы создаем профессии на предприятии
    //Для охранника характерно умение сторожить. Зарплата 15_000
    //Для бухгалтера характерно считать налоги. Бухгалтер офисный работник. Зарплата 50_000
    //Для секретаря характерно печатать документы. Секретарь офисный работник. Зарплата 30_000
    //Каждый офисный работник умеет пить кофе.
    //Каждый человек умеет получать зарплату(характерную для его профессии) .
    //У каждого человека есть пол.
    //Воссоздать такую структуру в java.
    static void main() {
       Guard guard = new Guard(true);
       Accountant accountant = new Accountant( false);
       Assistant assistant = new Assistant( false);
       assistant.getSalary();
       accountant.getSalary();
       guard.getSalary();
       assistant.drinkCoffee();
       accountant.drinkCoffee();
    }
}
