package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
             int tmp, min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    /*test*/
    public static void main(String[] args) {
        int arr[] = {1,5,3,5,3,5,6,4,6,8,0,3,6};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
