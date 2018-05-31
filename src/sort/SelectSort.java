package sort;

import java.util.Arrays;

/*
 *选择排序,时间复杂度:O(n^2)
 */
public class SelectSort {


    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 2, 6};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[temp]) {
                    temp = j;
                }
            }
            if (temp != i) {
                swap(arr, temp, i);
            }
        }
    }

    private static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
