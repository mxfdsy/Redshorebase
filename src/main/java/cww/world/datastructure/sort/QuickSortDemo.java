package cww.world.datastructure.sort;

public class QuickSortDemo {
   public static void  main (String[] ars){



   }

   static  void quickSort(int[] arr,int L ,int R) {
       if (L >= R) {
           return;
       }
       int left = L;
       int right = R;
       int pivot = arr[left];
       while (left < right) {

           while (arr[right] >= pivot) {
               right--;
           }
           if (left < right) {
               arr[left] = arr[right];
           }


           while (arr[left] <= pivot) {
               left++;
           }
           if (left < right) {
               arr[right] = arr[left];
           }
           if (left>=right) {
               arr[left] = pivot;
           }
       }

       quickSort(arr, L, right - 1);
       quickSort(arr, right + 1, R);
   }
}
