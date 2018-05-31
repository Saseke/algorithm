package sort;

/**
 * @author Yoke
 * Created on 2018/5/21
 */
public class quickSort {

    public static void main(String[] args) {
        int a[] = {4, 3, 10, 5, 2, 1};
        ajustArray(a, 0, a.length - 1);
        for (int anA : a) {
            System.out.println(anA);
        }
    }

    private static void ajustArray(int[] a, int off, int set) {
        if (off < set) {
            int x = a[off], j = set, i = off;
            while (i < j) {
                while (i < j && a[j] >= x) {
                    j--;
                }
                if (i < j) {
                    a[i++] = a[j];
                }
                while (i < j && a[i] < x) {
                    i++;
                }
                if (i < j) {
                    a[j--] = a[i];
                }
            }
            a[i] = x;
            ajustArray(a, off, i - 1);
            ajustArray(a, i + 1, set);
        }
    }
}
