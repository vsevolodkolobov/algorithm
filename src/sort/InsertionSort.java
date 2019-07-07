package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort1(int[] arr) {

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

    public static void insertSort2 (int[] arr) {
            for (int i=0;i<arr.length;i++) {
                int min = arr[i];
                int min_i = i;

                for (int j=i+1;j<arr.length;j++) {
                    if (arr[j] < min ){
                        min =arr[j];
                        min_i = j;
                    }
                }
                if (i!=min_i) {
                    int tmp =arr[i];
                    arr[i] =arr[min_i];
                    arr[min_i] =tmp;
                }
            }
    }

    /*test*/
    public static void main(String[] args) {
            int arr1[] = {1,7,3,2,6,3};
            System.out.print(Arrays.toString(arr1));
            insertionSort1(arr1);
            System.out.println(Arrays.toString(arr1));

            int arr2[] = {1,7,3,2,6,3};
            System.out.print(Arrays.toString(arr2));
            insertSort2(arr2);
            System.out.print(Arrays.toString(arr2));


    }
}
