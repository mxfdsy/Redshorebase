package cww.world.datastructure.sort;

/**
 * 选择排序
 */
public class SelectSort {


    public static void main(String[] args) {
        int[] bigIntArr = TestTimeUtils.getBigIntArr();
//        System.out.println(Arrays.toString(bigIntArr));
        TestTimeUtils.printCurrentTime();
        selectSort(bigIntArr);
        TestTimeUtils.printCurrentTime();

//        System.out.println("排序后");

    }

    public static void selectSort(int[] arr) {

        for (int k = 0; k < arr.length - 1; k++) {
            int minIndex = k;
            int minValue = arr[k];
            for (int i = k + 1; i < arr.length; i++) {
                if (minValue > arr[i]) {
                    minIndex = i;
                    minValue = arr[i];
                }
            }

            if (minIndex != k) {
                arr[minIndex] = arr[k];
                arr[k] = minValue;
            }
//            System.out.println("第" + (k + 1) + "排序后" + Arrays.toString(arr));
        }
    }
}



