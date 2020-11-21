package cww.world.datastructure.sort.cww;

import java.util.Arrays;

public class CwwMergeSort {
    public static void main(String[] args) {


        int[] arr = {3, 1, 4, 2};
        int[] temp = new int[4];

        cwwMergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void cwwMergeSort(int arr[], int left, int right, int[] temp) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        cwwMergeSort(arr, left, mid, temp);
        cwwMergeSort(arr, mid + 1, right, temp);
        merge(arr, left, mid, right, temp);
    }


    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                i++;
            } else {
                temp[t] = arr[j];
                j++;
            }
            t++;
        }

        while (i <= mid) {
            temp[t] = arr[i];
            i++;
            t++;
        }
        while (j <= right) {
            temp[t] = arr[j];
            j++;
            t++;
        }

        t = 0;
        int templeft = left;

        while (templeft <= right) {
            arr[templeft] = temp[t];
            t++;
            templeft++;
        }

    }
}
