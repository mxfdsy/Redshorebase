package cww.world.datastructure.serarch;

import java.util.ArrayList;

/**
 * 二分查找（其数组必须是有序数组）
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 89, 1000, 1000};
//        int i = binarySearch(arr, 0, arr.length - 1, 1111);
//        System.out.println(i);

        ArrayList<Integer> integers = binarySearch2(arr, 0, arr.length - 1, 1000);
        System.out.println(integers);
    }


    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal > midVal) {
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }

    public static ArrayList<Integer> binarySearch2(int[] arr, int left, int right, int findVal) {
        ArrayList<Integer> results = new ArrayList<>();

        if (left > right) {
            return new ArrayList<>();
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal > midVal) {
            return binarySearch2(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch2(arr, left, mid - 1, findVal);
        } else {
            //向左边扫描
            int temp = mid -1;
            while (true){
                if (temp < 0 || arr[temp] != findVal) {
                    break;
                }
                results.add(temp);
                temp -= 1;
            }

            //向右边扫描
            int temp2 = mid +1;
            while (true){
                if (temp2 > arr.length -1 || arr[temp2] != findVal) {
                    break;
                }
                results.add(temp2);
                temp2 -= 1;
            }
            return results;
        }
    }
}
