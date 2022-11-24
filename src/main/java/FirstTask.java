import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        // эксперимент 1
        mainJob(35000);
        // эксперимент 2
        mainJob(350000);
        // эксперимент 3
        mainJob(3500000);
    }

    /**
     * ВАРИАНТ:6
     * Пробовал искать разницу в секундах, но её нет. Так же попробовал в миллисекундах, но у меня хорошее железо
     * поэтому он и тут не нашёл разницы. В остальных заданиях буду вычислять разницу миллисекунд
     * Вот такие получились ответы
     * 8749
     * 0
     * 206443
     * 0
     * 2324217
     * 0
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
        int res = rank(3, numb);
        Date date2 = new Date();
        int b = Integer.parseInt(formatter.format(date2).replaceAll(":", ""));
        System.out.println(res);
        System.out.println(b - i);
    }

    public static int rank(int key, int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            // находим середину
            int mid = low + (high - low) / 2;
            // если ключ поиска меньше начения в середине
            // то верхней границей будет элемент до середины
            if (key < numbers[mid]) {
                high = mid - 1;
            } else if (key > numbers[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
