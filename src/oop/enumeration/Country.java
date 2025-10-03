package oop.enumeration;

public enum Country {
    JAPAN("Japan", 140_000_000L, "japanese language"),
    GREECE("Greece", 10_000_000L, "greece language"),
    ARGENTINA("Argentina", 47_000_000L, "spanish language");
    private String name;
    private long peopleCount;
    private String language;

    Country(String name, long peopleCount, String language) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", peopleCount=" + peopleCount +
                ", language='" + language + '\'' +
                "}\n";
    }
}
