package findMinMaxValue;


/**
 * 最小値を見つける。
 *
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {100, 88, 20, 212, 59, 2, 9};

        System.out.println("最大値：" + findMaxValue(array));
        System.out.println("最小値：" + findMinValue(array));


    }

    // 配列の最小値を求める
    public static int findMinValue(int[] array) {

        int minValue = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    // 配列の最大値を求める
    public static int findMaxValue(int[] array) {

        int maxValue = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}
