package oop.inheritance.lesson9.task2;

public class CountriesGuide {
    public static final Country FRANCE = new Country(67_000_000L, "французский язык", "Евразия");
    public static final Country ARGENTINA = new Country(43_000_000L, "испанский язык", "Южная Америка");
    public static final Country ITALY = new Country(58_000_000L, "итальянский язык", "Евразия");

    private CountriesGuide() {}
}
