package practicesort.sort;

import java.util.Arrays;

/**
 * �o�u���\�[�g���K
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

        // �O��ő召��r
        // �O�����[�v�F�v�f����������B�O�����[�v1�T�ɂ��A�傫���l�����̈ʒu�Ɋm�肵�Ă����B
        // �������[�v�F�O�����[�v1���̂��тɁAi���A�����͈͂͒Z���Ȃ�B
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // �O�̗v�f���傫����ΑO��v�f����ւ�
                if (array[j] > array[j + 1]) {
                    int tmpVal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmpVal;
                }
            }
        }
    }
}
