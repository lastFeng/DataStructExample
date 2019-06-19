package bubblesort;

import util.SwapUtil;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-19 21:24
 */
public class BubbleSort {

    /**
     * 冒泡排序：选择最小的值往上冒泡
     * @param array 需要排序的数组
     * @return int array
     * */
    public int[] bubleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    SwapUtil.swapArray(array, i, j);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 8, 7, 3, 4};

        new BubbleSort().bubleSort(array);
        SwapUtil.printArray(array);
    }
}
