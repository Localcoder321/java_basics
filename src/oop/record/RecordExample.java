package oop.record;

public class RecordExample {
    static void main() {
        Human human = new Human(1980, "Ivan", "Ivanovich", "Ivanov");
        System.out.println(human);
        HumanRecord humanRecord = new HumanRecord(1980, "Ivan", "Ivanovich", "Ivanov");
        System.out.println(humanRecord);
        humanRecord.getInfo();
    }
}
