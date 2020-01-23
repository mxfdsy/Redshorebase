package cww.world.datastructure.serarch;

import java.util.ArrayList;

/**
 * 差值查找
 */
public class InsertValueSearch {
    public static void main(String[] args) {

        int[] arr = {1, 5, 10, 89, 1000, 1000};
//        int i = binarySearch(arr, 0, arr.length - 1, 1111);
//        System.out.println(i);

        ArrayList<Integer> integers = binarySearch2(arr, 0, arr.length - 1, 5);
        System.out.println(integers);
    }


    public static ArrayList<Integer> binarySearch2(int[] arr, int left, int right, int findVal) {
        ArrayList<Integer> results = new ArrayList<>();

        if (left > right || findVal < arr[0] || findVal > arr[arr.length -1]) {
            return new ArrayList<>();
        }

        int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
        int midVal = arr[mid];
        if (findVal > midVal) {
            return binarySearch2(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch2(arr, left, mid - 1, findVal);
        } else {
            results.add(mid);
            return results;
        }
    }

}
