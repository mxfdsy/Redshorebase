package cww.world.datastructure.sort;

import java.util.Arrays;

/**
 * 基数排序
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {53, 3, 542, 748, 14, 214};

        radixSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void radixSort(int[] arr) {

        //获取数组中最大的数的位数
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxLength = (max + "").length();


        //定义一个二维数组(包含 10个一维数组)
        int[][] bucket = new int[10][arr.length];

        //为了记录每个桶中，实际存放了多少个数据，我们定义一个一维数组来记录各个桶的每次放入的数据个数
        // bucketElementCounts[0]就是第一桶的存放的数据个数
        int[] bucketElementCounts = new int[10];


        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //根据n位数进行排序
            for (int j = 0; j < arr.length; j++) {
                //取出每个元素的个位元素
                int digitOfElement = arr[j] / n % 10;
                //设置 第 digitOfElement 的数组 的第bucketElement[digitOfElement]个元素的值
                 bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                //数据就加一
                bucketElementCounts[digitOfElement]++;
            }

            //按照这个顺序把数据放回
            int index = 0;
            //遍历每个桶 并将桶中的数据放入原数组
            for (int k = 0; k < bucketElementCounts.length; k++) {
                if (bucketElementCounts[k] != 0) {
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index++] = bucket[k][l];
                    }
                }
                //桶里面的数据置为0
                bucketElementCounts[k] = 0;
            }
            System.out.println("第" + (i + 1) + "一轮已经搞定");
        }


//        //根据个位数进行排序
//        for(int j = 0;j <arr.length;j++){
//            //取出每个元素的个位元素
//            int digitOfElement = arr[j] % 10;
//            //设置 第 digitOfElement 的数组 的第bucketElement[digitOfElement]个元素的值
//            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
//            //数据就加一
//            bucketElementCounts[digitOfElement]++;
//        }
//
//        //按照这个顺序把数据放回
//        int index = 0;
//        //遍历每个桶 并将桶中的数据放入原数组
//        for(int k = 0;k < bucket.length;k++){
//            if (bucketElementCounts[k] != 0) {
//             for(int l = 0; l < bucket.length;l++){
//                 arr[index++] = bucket[k][l];
//             }
//            }
//            //桶里面的数据置为0
//            bucketElementCounts[k] = 0;
//        }
//        System.out.println("第一轮已经搞定");

//        //第二轮
//        //根据个位数进行排序
//        for(int j = 0;j <arr.length;j++){
//            //取出每个元素的十位元素
//            int digitOfElement = arr[j] /10 % 10;
//            //设置 第 digitOfElement 的数组 的第bucketElement[digitOfElement]个元素的值
//            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
//            //数据就加一
//            bucketElementCounts[digitOfElement]++;
//        }
//
//        //按照这个顺序把数据放回
//         index = 0;
//        //遍历每个桶 并将桶中的数据放入原数组
//        for(int k = 0;k < bucket.length;k++){
//            if (bucketElementCounts[k] != 0) {
//                for(int l = 0; l < bucket.length;l++){
//                    arr[index++] = bucket[k][l];
//                }
//            }
//        }
//        System.out.println("第二轮已经搞定");
//
//        //第三轮
//        //根据个位数进行排序
//        for(int j = 0;j <arr.length;j++){
//            //取出每个元素的百位元素
//            int digitOfElement = arr[j] /100 % 10;
//            //设置 第 digitOfElement 的数组 的第bucketElement[digitOfElement]个元素的值
//            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
//            //数据就加一
//            bucketElementCounts[digitOfElement]++;
//        }
//
//        //按照这个顺序把数据放回
//        index = 0;
//        //遍历每个桶 并将桶中的数据放入原数组
//        for(int k = 0;k < bucket.length;k++){
//            if (bucketElementCounts[k] != 0) {
//                for(int l = 0; l < bucket.length;l++){
//                    arr[index++] = bucket[k][l];
//                }
//            }
//        }
//        System.out.println("第三轮已经搞定");
    }
}
