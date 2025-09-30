package oop.inheritance.lesson9.task2;

public class Country {
    private long numberOfPeople;
    private String language;
    private String continent;

    public Country(long numberOfPeople, String language, String continent) {
        this.numberOfPeople = numberOfPeople;
        this.language = language;
        this.continent = continent;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }
}
