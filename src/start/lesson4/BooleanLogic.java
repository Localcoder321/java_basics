package start.lesson4;

public class BooleanLogic {
    static void main() {
        //Buy bread
        boolean isBoughtBread = false;
        //Buy milk
        boolean isBoughtMilk = false;
        if(isBoughtBread && isBoughtMilk) {
            System.out.println("Happy with bread and milk");
        } else if(isBoughtBread) {
            System.out.println("Happy with bread");
        } else if(isBoughtMilk) {
            System.out.println("Happy with milk");
        }
        else {
            System.out.println("Sad without bread and milk");
        }

        //0г - Логическое или, если хотя бы одно значение true, то тогда true, и только если Bce значения false,
        //то тогда false
        //boolean isBoughtMilk0rBread = true || true;
        //boolean isBoughtMilkOrBread = true;
        //boolean isBoughtMilkOrBread = true || false;
        //boolean isBoughtMilkOrBread = true;
        //boolean isBoughtMilkOrBread = false || false;
        //boolean isBoughtMilkOrBread =false;

        //Bought candy or not
        //NOT - Логическое не, который переворачивает значение true на false и наоборот
        boolean isBoughtCandy = false;
        if(!isBoughtCandy) {
            System.out.println("Happy and healthy");
        }
    }
}
