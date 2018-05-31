package sort;

/**
 * 算法描述:
 * 1.从第一个元素开始，认为第一个元素是已经排序的
 * 2. 取出下一个元素，和已经排好序的元素进行比较，从后向前扫描
 * 3.如何待插入元素大于当前数据元素，指针前移，知道找到小于当前元素,
 * 4.将其插入到该位置
 * 时间复杂度:O(n^2)
 *
 * @author Yoke Created on 2018/5/24
 */
public class InsertSort {

    private static void insertSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 & arr[j] < arr[j - 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 10, 8};
        insertSort(arr, arr.length);
        for (int anArr : arr) {
            System.out.println(anArr);
        }
    }
}
