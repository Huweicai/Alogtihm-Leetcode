package sort;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 排序算法
 *
 * @author huweicai
 */
public class SortAlgorithm {
    /**
     * 插入排序
     * 最好时间复杂度：O(n) (数组正序)
     * 最坏时间复杂度：O(n^2) (数组逆序)
     *
     * @param a
     * @return
     */
    public static int[] insertSort(int[] a) {
        //遍历数组
        for (int i = 1; i < a.length; i++) {
            //遍历已排序数据
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp < a[j]) {
                //大于temp后移，为temp留出空间
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        return a;
    }

    /**
     * shell排序
     * note ： 不稳定 ， 如果两个相同的数被分到不同的组 ， 顺序就无法保证了
     * 最好的平方阶简单排序算法
     * @param a
     * @return
     */
    public static int[] shellSort(int[] a) {
        //初始基数
        int n = a.length / 2;
        while (n >= 1) {
            //分组
            for (int i = 0; i < n; i++) {
                for (int j = i + n; j < a.length; j += n) {
                    //当前值
                    int temp = a[j];
                    int k = j - n;
                    //遍历已排序
                    while (k >= i && temp < a[k]) {
                        a[k + n] = a[k];
                        k -= n;
                    }
                    a[k + n] = temp;
                }
            }
            n /= 2;
        }
        return a;
    }

    /**
     * 冒泡
     * avg: O(n^2)
     * best: 平方
     *
     * @param a
     * @return
     */
    public static int[] bubbleSort(int[] a) {
        //大循环冒泡
        for (int i = a.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    /**
     * 优化版冒泡，到上次最后存在逆序交换的地方结束（后面有序）
     * best : n
     * avg  ：n平方
     * @param a a
     * @return int[a] in right order
     */
    public static int[] betterBubbleSort(int[] a) {
        int min = a.length;
        while (min > 0) {
            int t = 0;
            for (int j = 0; j < min - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    t = j;
                }
            }
            min = t;
        }
        return a;
    }

    /**
     * 快速排序
     * 分划
     * @param a
     * @return
     */
    public static int[] quickSort(int[] a) {
        return a;
    }

    private static void qsort(int[] a, int min, int max) {
        //选区最左为基准值
        int base = a[min];
        //前后指针同时从两边出发
        int start = min +1;
        int end = max;
        while (start < end) {
            //从左往右找到第一个比base大的数，如果小于就一直循环直到找到第一个比它大的数或者前后指针相碰
            while (a[start] < base) {

            }
            //从右往左找到第一个比base小的数，如果大于就一直循环直到找到一个比它小的数或者前后指针相碰
            while (a[start] < base) {

            }
            if (start < end) {
                //交换它们
            } else {
                //将base放到中间来
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {32, 1, 6, 3434, 2, 9, 24, 99};
        int[] shell = shellSort(Arrays.copyOf(a, a.length));
        int[] insert = insertSort(Arrays.copyOf(a, a.length));
        int[] bubble = bubbleSort(Arrays.copyOf(a, a.length));
        int[] btbubble = betterBubbleSort(Arrays.copyOf(a, a.length));
        System.out.println(Arrays.toString(insert));
        System.out.println(Arrays.toString(shell));
        System.out.println(Arrays.toString(bubble));
        System.out.println(Arrays.toString(btbubble));
    }
}
