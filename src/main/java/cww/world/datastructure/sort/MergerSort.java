package cww.world.datastructure.sort;

public class MergerSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        int[] temp = new int[arr.length];

    }


    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            //向左
            mergeSort(arr, left, mid, temp);
            //向右
            mergeSort(arr, mid + 1, right, temp);

            merge(arr, left, mid, right, temp);
        }
    }

    /**
     * @param arr   排序数组
     * @param left
     * @param mid   中间索引
     * @param right
     * @param temp  中转数组
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;//左边开始
        int j = mid + 1; //右边开始
        int t = 0; //temp数组 开始

        //1
        //左右两边的数据(有序) 拷贝到temp数组
        //一直到有一边处理完毕为止
        while (i <= mid && j <= right) {
            //如果左边的有序序列数小于 右边的有序序列数
            //拷贝到temp
            //
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t += 1;
                i += 1;
            } else { //反之
                temp[t] = arr[j];
                t += 1;
                j += 1;
            }
        }
        //2
        //把有剩余的数据的一边的数据 一次填充到temp
        while (i <= left) {
            temp[t] = arr[i];
        }

        while (j <= right) {
            temp[t] = arr[j];
        }
        //3z
        //将 temp 的元素数拷贝到 arr
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }
    }
}
