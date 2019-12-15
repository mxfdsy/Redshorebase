package cww.world.datastructure.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTimeUtils {
    public static int[] getBigIntArr() {
        int[] arr = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // Éú³ÉÒ»¸ö[0, 8000000) Êý
        }
        return arr;
    }

    public static void printCurrentTime() {
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println(date1Str);
    }
}
