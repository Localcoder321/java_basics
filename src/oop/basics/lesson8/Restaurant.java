package oop.basics.lesson8;

public class Restaurant {
    private static int sausage = 0;
    private static int bread = 0;

    public void getOrder() {
        if(sausage > 0 && bread > 1) {
            sausage--;
            bread-=2;
            System.out.println("Заказ выполнен!");
        } else {
            System.out.println("Hет ингредиентов!");
        }
    }

    public void getSupply() {
        sausage+=100;
        bread+=200;
        System.out.println("Запасы пополнены!");
    }
}
