package cww.world.datastructure.sort;

/**
 * 冒泡排序
 * 时间复杂的平方阶
 *
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = TestTimeUtils.getBigIntArr();
        TestTimeUtils.printCurrentTime();
        sort(arr);
        TestTimeUtils.printCurrentTime();
    }

    private static void sort(int[] arr) {
        Boolean isChange = false;
        for (int k = 1; k < arr.length; k++) {
            int temp = 0;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    isChange = true;
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
//            System.out.println("第" + k + "次排序后" + Arrays.toString(arr));
            if (isChange) {
                isChange = false;
            } else {
                break;
            }
        }
    }
}
