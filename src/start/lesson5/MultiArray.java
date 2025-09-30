package start.lesson5;

public class MultiArray {
    static void main() {
        //Ограбили магазин. Вор был ростом 178.
        // Следователь нашел две группы людей около магазина. Задача найти вора по росту.
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 193};
        int[][] multiArray = {group1, group2};
        upperFor:
        for(int[] group : multiArray) {
            //System.out.println(Arrays.toString(group));
            for (int number : group) {
                //System.out.println(number);
                if (number == 178) {
                    System.out.println("Вор " + number);
                    break upperFor;
                } else {
                    System.out.println("Не вор");
                }
            }
        }
    }
}
