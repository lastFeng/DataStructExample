package insertsort;

import util.SwapUtil;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-19 21:46
 */
public class InsertSort {
    /**
     * 插入排序：从后往前插，只要比当前小，就换位
     * @param array 需要排序的数组
     * @return int array
     * */
    public int[] insertSort(int[] array){
        for (int i = 1; i < array.length; i++){
            for (int j = i; j > 0; j--){
                if (array[j] < array[j - 1]){
                    SwapUtil.swapArray(array, j-1, j);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 8, 7, 3, 4};

        new InsertSort().insertSort(array);
        SwapUtil.printArray(array);
    }
}
