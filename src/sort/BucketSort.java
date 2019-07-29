package sort;

import java.util.Arrays;

public class BucketSort {

    public static int[] bucketSort(int [] arr) {

        int i,j;
        int []bucket = new int[arr.length+1];
        Arrays.fill(bucket,0);

        for (i =0; i < arr.length; i++)
            bucket[arr[i]]++;

        int k = 0;

        for (i = 0; i < bucket.length; i++){
            for (j =0; j < bucket[i]; j++)
                arr[k++] = i;
        }
        return arr;
    }

    /*test*/
    public static void main(String[] args) {
        int []arr ={1,6,4,3,6,4,7,3,5,8,6,0};
        System.out.println(Arrays.toString(arr));
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
