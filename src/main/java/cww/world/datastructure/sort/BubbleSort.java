package cww.world.datastructure.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂的平方阶
 *
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {3, 9, -1, 10, 20};
//        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("排序前的结果是" + Arrays.toString(arr));
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
            System.out.println("第" + k + "次排序后" + Arrays.toString(arr));
            if (isChange) {
                isChange = false;
            } else {
                break;
            }
        }
//        int temp = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                temp = arr[i + 1];
//                arr[i + 1] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        System.out.println("排序后的结果是" + Arrays.toString(arr));
    }
}
