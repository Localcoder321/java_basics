package start.lesson4;

public class Ternary {
    static void main() {
        int money = 100;
        int breadPrice = 70;
        int moneyAfterShopping = money - breadPrice;
        int childMoney = moneyAfterShopping >= 50?10:5;
        moneyAfterShopping -= moneyAfterShopping>=50?10:5;
        System.out.println(childMoney);
        System.out.println(moneyAfterShopping);
    }
}
