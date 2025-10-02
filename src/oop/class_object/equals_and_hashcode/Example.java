package oop.class_object.equals_and_hashcode;

public class Example {
    static void main() {
        Child child1 = new Child("Kirov Sergey", 2019);
        Child child2 = new Child("Petrov Ivan", 2019);
        Child child3 = new Child("Menshikova Anastasiya", 2019);
        Child child4 = new Child("Ivanov Valentin", 2018);

        Child[] children = {child1, child2, child3, child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;
        Child childForFind = new Child("Kirov Sergey", 2019);

        for(Child child : childrenGarden.getChildren()) {
            if(child.equals(childForFind)) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
