package oop.polimorphism.difference_interface_and_abstract_class;

public class IvanDurak implements Swimable {
    private Boat boat;

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public void swim() {
        boat.swim();
    }
}
