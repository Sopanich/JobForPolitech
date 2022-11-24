import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ThirdTask {
    public static void main(String[] args) {
        // эксперимент 1
        mainJob(650);
        // эксперимент 2
        mainJob(6500);
        // эксперимент 3
        mainJob(65000);
    }

    /**
     * Ответ
     * 0
     * 0
     * 10001
     */
    private static void mainJob(int num) {
        int[] numb = new int[num];
        Random rnd = new Random();
        for (int i = 0; i < num; i++) {
            numb[i] = rnd.nextInt(10);
        }
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss:ms");
        Date date1 = new Date();
        int i = Integer.parseInt(formatter.format(date1).replaceAll(":", ""));
        bubbleSort(numb);
        Date date2 = new Date();
        int b = Integer.parseInt(formatter.format(date2).replaceAll(":", ""));
        System.out.println(b - i);
    }

    public static void bubbleSort(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
