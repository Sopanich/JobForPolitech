import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondTask {
    public static void main(String[] args) {
        // эксперимент 1
        mainJob(350000);
        // эксперимент 2
        mainJob(3500000);
        // эксперимент 3
        mainJob(35000000);

    }

    /**
     * Ответ
     * 61.436139517785094
     * 0
     * 2.422206357567697E21
     * 0
     * 6.951505276860046E248
     * 2002
     * */
    private static void mainJob(int num) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss:ms");
        Date date1 = new Date();
        int i = Integer.parseInt(formatter.format(date1).replaceAll(":", ""));
        double res = factorial(num);
        Date date2 = new Date();
        int b = Integer.parseInt(formatter.format(date2).replaceAll(":", ""));
        System.out.println(res);
        System.out.println(b - i);
    }

    private static double factorial(int n) {
        double result = 1.0;
        for (int i = 1; i <= n; i++) {
            result *= Math.pow(i, 0.000001);
        }
        return result;
    }
}
