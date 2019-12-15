package cww.world.datastructure.sort;

import java.util.Arrays;

/**
 * 快排
 */
public class QuickSort {
    public static void main(String[] args) {
//        int[] bigIntArr = TestTimeUtils.getBigIntArr();
//        int[] bigIntArr = {-9, 78, 0, 23, -567, 70,-1 ,900,4561};
        int[] bigIntArr = {2,-1,-3,-4};
        TestTimeUtils.printCurrentTime();
        quickSort(bigIntArr, 0, bigIntArr.length - 1);
        TestTimeUtils.printCurrentTime();
        System.out.println(Arrays.toString(bigIntArr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;

        int pivot = arr[(left + right) / 2];
        int temp = 0;
        //左小右大
        while (l < r) {
            while (arr[l] < pivot) {
                l += 1;
            }
            while (arr[r] > pivot) {
                r -= 1;
            }

            //已经按照左小右大了
            if (l >= r) {
                break;
            }
            //交换数据
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //当数组中有重复的数字，就不用换位子了
            if (arr[l] == pivot) {
                r -= 1;
            }
            if (arr[r] == pivot) {
                l += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        //如果不加这个永远向左递归，数组中只有一个数字
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if (left < r) {
            quickSort(arr, left, r);
        }
        if (right > l) {
            quickSort(arr,l,right);
        }


    }
}