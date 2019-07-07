package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        for (int i=arr.length-1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
    }


    /*test*/
    public static void main(String[] args) {
        int arr []= {1,4,3,2,5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
