package start.lesson4;

public class Scope {
    static void main() {
        double carPrice = 10_000;
        if(carPrice > 9_000) {
            double oldPrice = carPrice;
            carPrice*=0.95;
            System.out.println(oldPrice);
        }
        System.out.println(carPrice);
    }
}
