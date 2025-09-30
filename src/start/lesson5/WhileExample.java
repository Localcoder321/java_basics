package start.lesson5;

public class WhileExample {
    static void main() {
        int count = 0;
        //while (count < 100) {
            //System.out.println(count++);
        //}

        while (true) {
            count++;
            System.out.println(count);
            if(count == 1_000_000) {
                break;
            }
        }
    }
}
