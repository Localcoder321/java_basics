package start.lesson5;

public class Continue {
    static void main() {
        //Тренер дал задание спортсмену. Он бросает кости, и если выпадает любое значение от 1 до 5 - то он отжимается
        //А если выпадает шесть, то он отдыхает (ничего не делает)
        int[] results = {3,5,6,2,1};
        for(int result : results) {
            if(result == 6) {
                System.out.println("отдыхает");
                continue;
            } else {
                System.out.println("отжимается");
            }
        }
    }
}
