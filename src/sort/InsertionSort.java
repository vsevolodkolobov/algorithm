package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i=1; i<arr.length;i++) {
            int curElem = arr[i];
            int prevKey = i-1;

            while (prevKey >=0 && arr[prevKey] > curElem) {
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = curElem;
                prevKey--;
            }
        }
    }



    /*test*/
    public static void main(String[] args) {
            int arr1[] = {1,7,3,2,6,3};
            System.out.print(Arrays.toString(arr1));
            insertionSort(arr1);
            System.out.println(Arrays.toString(arr1));



    }
}
