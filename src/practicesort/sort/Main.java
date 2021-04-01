package practicesort.sort;

import java.util.Arrays;

/**
 * バブルソート練習
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {20, 100, 10, 90, 60, 10};

        //
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {

        // 前後で大小比較
        // 外側ループ：要素を一つずつ検査。外側ループ1週につき、大きい値が後ろの位置に確定していく。
        // 内側ループ：外側ループ1周のたびに、i分、検査範囲は短くなる。
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 前の要素が大きければ前後要素入れ替え
                if (array[j] > array[j + 1]) {
                    int tmpVal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmpVal;
                }
            }
        }
    }
}
