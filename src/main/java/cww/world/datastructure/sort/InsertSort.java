package cww.world.datastructure.sort;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = TestTimeUtils.getBigIntArr();
        TestTimeUtils.printCurrentTime();
        insertSort(arr);
        TestTimeUtils.printCurrentTime();
        int ar = 6;
        ar -= 5;
        System.out.println(ar);
//        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertValue;
            }
        }
//
//        int insertValue = arr[1];
//        int insertIndex = 1 - 1;
//        while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
//            arr[insertIndex+1] = arr[insertIndex];
//            insertIndex--;
//        }
//        arr[insertIndex+1] = insertValue;
//        System.out.println(Arrays.toString(arr));
//
//        int insertValue2 = arr[2];
//        int insertIndex2 = 2 - 1;
//        while (insertIndex2 >= 0 && insertValue2 < arr[insertIndex2]) {
//            arr[insertIndex2+1] = arr[insertIndex2];
//            insertIndex2--;
//        }
//        arr[insertIndex+1] = insertValue2;
//
//        System.out.println(Arrays.toString(arr));


//        int insertValue2 = arr[2];
//        int insertIndex2 = 2 - 1;
//        while (insertIndex2 >= 0 && insertValue2 < arr[insertIndex2]) {
//            arr[insertIndex+1] = arr[insertIndex2];
//            insertIndex2--;
//        }
    }

}
