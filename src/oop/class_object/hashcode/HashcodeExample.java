package oop.class_object.hashcode;

import oop.class_object.equals.Child;

public class HashcodeExample {
    static void main() {
        Child child1 = new Child("Kirov Sergey", 2019);
        Child child2 = new Child("Petrov Ivan", 2018);
        Child child3 = new Child("Menshikova Anastasiya", 2019);
        Child child4 = new Child("Ivanov Valentin", 2018);

        Child[] group0 = {child4, child2};
        Child[] group1 = {child3, child1};
        Child[][] children = {group0, group1};
        ChildrenGardenWithGroups childrenGardenWithGroups = new ChildrenGardenWithGroups(children);

        Child childForFind = new Child("Kirov Sergey", 2019);
        boolean result = false;

        for (Child child : childrenGardenWithGroups.getChildren()[childForFind.hashCode()]) {
            if(child.equals(childForFind)) {
                result = true;
                break;
            }
        }

        System.out.println(result);
    }
}
