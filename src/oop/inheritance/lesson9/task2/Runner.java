package oop.inheritance.lesson9.task2;

public class Runner {
    static void main() {
        //Создать справочник стран
        //Класс справочник должен иметь 3 страны: Франция, Аргентина, Италия
        //Франция имеет 67_000_000 человек, французский язык, континент: Евразия
        // Аргентина имеет 47_000_000 человек, испанский язык, континент: Южная Америка
        // Италия имеет 58_000_000 человек, итальянский язык, континент: Евразия
        //При получении страны из справочника, мы можем получить каждый атрибут по отдельности

        Country france = CountriesGuide.FRANCE;
        Country argentina = CountriesGuide.ARGENTINA;
        Country italy = CountriesGuide.ITALY;

        System.out.println("France");
        System.out.println(france.getNumberOfPeople());
        System.out.println(france.getContinent());
        System.out.println(france.getLanguage());
        System.out.println("-----------------------");

        System.out.println("Argentina");
        System.out.println(argentina.getNumberOfPeople());
        System.out.println(argentina.getContinent());
        System.out.println(argentina.getLanguage());
        System.out.println("-----------------------");

        System.out.println("Italy");
        System.out.println(italy.getNumberOfPeople());
        System.out.println(italy.getContinent());
        System.out.println(italy.getLanguage());
    }
}
