package cww.world.datastructure.sort;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 8, 5, 9};
        HeapSort(arr);

    }

    public static void HeapSort(int arr[]) {
        System.out.println("堆排序");

//        adjustHeap(arr, 1, arr.length);
//
//        //第一次[4, 9, 8, 5, 6]
//        System.out.println("第一次"+ Arrays.toString(arr));
//
//        adjustHeap(arr, 0, arr.length);
//
//        System.out.println("第二次"+ Arrays.toString(arr));

        //每个非叶子节循环，得到大顶堆或者小顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        int temp = 0;
        /**
         * 将堆顶的元素和末尾的交换
         * 重新调整结构，使其继续满菊堆定义，然后继续交换
         */
        for (int j = arr.length - 1; j > 0; j--) {
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            //因为 这个树已经是有小到大了 根节点的最大值没了，他下面的左右节点有一个肯定是最大的
            //我们现在只要把最大的放到最前端就好 不用在全部等到树
            adjustHeap(arr, 0, j);
        }

        System.out.println("有序数组" + Arrays.toString(arr));
    }


    /**
     * @param arr    等待排序的数组
     * @param i      表示 费叶子节点在数组中的索引
     * @param length 表示有几个元素继续调整（持续的减少）
     *               <p>
     *               功能：讲数组调整成 以i 对应的非叶子节节点调整成大顶堆
     *               例子：  int arr[] = {4, 6, 8, 5, 9} i = 1 -> int arr[] = {4, 9, 5, 8, 6};
     *               大顶堆的特点： arr[i] >= arr[2 *1 +1] && >=arr[2 *i +2]
     *               i 非叶子节点的值
     *
     *               我们会多次调用这个方法
     */
    public static void adjustHeap(int arr[], int i, int length) {
        int temp = arr[i];

        //找i 对应的左子节点（k 是i的左子节点 ，下次是k 的左子节点）
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            //左子节点的值小于右子节点的值
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;
            }
            //如果子节点大与父节点 子节点的值给父节点
            if (arr[k] > temp) {
                arr[i] = arr[k];

                //k 值赋值给i 继续比较
                i = k;
            } else {
                //这里敢 终止的原因是我们是左右比较的 下面的数据  k = k * 2 + 1 会比较

                break;
            }
        }

        //循环结束  我们已经将比i 为父节点的数的最大值 放在了顶部（如果有交换值的话）在讲 较小的那个值 复制回给 arr[i]
        arr[i] = temp;


    }


}
