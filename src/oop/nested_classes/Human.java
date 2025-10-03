package oop.nested_classes;

public class Human {
    private Passport passport;

    public Human(String series, String number, PassportType passwordType) {
        this.passport = new Passport(series, number, passwordType);
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
                '}';
    }
}
