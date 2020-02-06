package cww.world.datastructure.tenalgorithm;

/**
 * 二分查找非递归的实现
 * （数组必须是
 */
public class BinarySearchNoRecur {

    public static void main(String[] args) {
        int[] arr = {1,3, 8, 10, 11, 67, 100};
        int index = binarySearch(arr, 1);
        System.out.println("index=" + index);//
    }


    /**
     * 数组是从小到大
     *
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                //需要向左边查找 这个时候不是递归
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
