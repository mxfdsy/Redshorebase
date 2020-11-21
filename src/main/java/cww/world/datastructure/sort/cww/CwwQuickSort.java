package cww.world.datastructure.sort.cww;

import java.util.Arrays;

public class CwwQuickSort {
    public static void main(String[] args){

        int[] arr = {10,1,4,3,19,8};
        interview(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void  interview(int[] arr, int L, int R){
        if (L >= R){
            return;
        }
        int left = L;
        int right = R;
        int pivot = arr[L];


        while(left < right){

            while(arr[right] >= pivot && left < right){
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
            }

            while(arr[left] <= pivot && left < right){
               left++;
            }
            if (left < right) {
                arr[right] = arr[left];
            }

            if (left >= right) {
                arr[left] = pivot;
            }
        }


        interview(arr,L,right -1);
        interview(arr,right + 1,R);


    }
}
