package sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 9, 8};
        System.out.println("排序之前");
        printArray(arr);
        insertionSort(arr);
        System.out.println("排序之后");
        System.out.println(Arrays.toString(arr));
    }


    private static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int d = arr.length / 2; d > 0; d /= 2) {
            for (int i = d; i < arr.length; i++) {
                for (int j = i - d; j >= 0; j -= d) {
                    if (arr[j] > arr[j + d]) {
                        swap(arr, j, j + d);
                    }
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1) {
                System.out.print(arr[x] + ", ");
            } else {
                System.out.println(arr[x] + "]");
            }

        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
