package findMinMaxValue;


/**
 * �ŏ��l��������B
 *
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {100, 88, 20, 212, 59, 2, 9};

        System.out.println("�ő�l�F" + findMaxValue(array));
        System.out.println("�ŏ��l�F" + findMinValue(array));


    }

    // �z��̍ŏ��l�����߂�
    public static int findMinValue(int[] array) {

        int minValue = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    // �z��̍ő�l�����߂�
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
