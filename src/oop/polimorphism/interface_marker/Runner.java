package oop.polimorphism.interface_marker;

public class Runner {
    static void main() {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if(bird instanceof Alive) {
            System.out.println("Bird is alive");
        }
        if(airplane instanceof Alive) {
            System.out.println("Airplane is alive");
        } else  {
            System.out.println("Airplane is not alive");
        }
    }
}
