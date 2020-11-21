package cww.world.datastructure.sort.cww;

import java.util.Arrays;

public class CwwBubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,-5,0,9,7,4,3};
        cwwBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void cwwBubbleSort(int[] arr){
        int temp = 0;
        boolean isGo = true;
        for(int i = 1; isGo && i < arr.length; i++)
            for (int j = 0; j < arr.length - i; j++){
                isGo = false;
                if (arr[j] > arr[j + 1]) {
                    isGo = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
}
