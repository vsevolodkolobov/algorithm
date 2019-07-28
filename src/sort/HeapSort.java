package sort;

import java.util.Arrays;

public class HeapSort {

    static void heapify(int[] array, int length, int i) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;

        if (leftChild < length && array[leftChild] > array[largest])
            largest = leftChild;
        if (rightChild < length && array[rightChild] > array[largest])
            largest = rightChild;
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }

    public static void heapSort(int []array) {
        if (array.length == 0) return;

        int length = array.length;

        for (int i = length/2-1; i>=0; i--)
            heapify(array,length,i);

        for (int i = length; i>= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array,i,0);
        }

    }

    /*test*/
    public static void main(String[] args) {
        int [] arr ={1,5,3,2,6,3,4,1};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

