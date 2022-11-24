import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FourthTask {
    public static void main(String[] args) {
        // эксперимент 1
        mainJob(11);
        // эксперимент 2
        mainJob(106);
        // эксперимент 3
        mainJob(1060);
    }

    /**
     * Ответ
     *
     * 5989
     * 0
     * 5035974
     * 0
     * 1010100116
     * 1001
     */
    private static void mainJob(int number) {
        int[] mas = new int[number];
        Random rnd = new Random();
        for (int i = 0; i < number; i++) {
            mas[i] = rnd.nextInt(10);
        }
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss:ms");
        Date date1 = new Date();
        int sum = 0;
        int a = Integer.parseInt(formatter.format(date1).replaceAll(":", ""));
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {
                    sum +=mas[(i + j + k) /3];
                }
            }
        }
        Date date2 = new Date();
        int b = Integer.parseInt(formatter.format(date2).replaceAll(":", ""));
        System.out.println(sum);
        System.out.println(b - a);
    }
}
