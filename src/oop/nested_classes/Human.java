package oop.nested_classes;

public class Human {
    private Passport passport;
    private Heart heart;

    public Human(String series, String number, PassportType passwordType, double weight) {
        this.passport = new Passport(series, number, passwordType);
        this.heart = new Heart(weight);
    }

    public static class Passport {
        private String series;
        private String number;
        private PassportType passwordType;

        public Passport(String series, String number, PassportType passwordType) {
            this.series = series;
            this.number = number;
            this.passwordType = passwordType;
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "series='" + series + '\'' +
                    ", number='" + number + '\'' +
                    ", passwordType=" + passwordType +
                    '}';
        }
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Human{" +
                "passport=" + passport +
                ", heart=" + heart +
                '}';
    }

    public class Heart {
        private double weight;
        public Heart(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Heart{" +
                    "weight=" + weight +
                    '}';
        }
    }
}
