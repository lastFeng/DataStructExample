package selectsort;

import util.SwapUtil;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-19 20:12
 */
public class SelectSort {
    /**
     * 选择排序
     *  -- 从头开始比较
     *  -- 找到做小的数，放到首部，
     *  -- 从下一个位置继续查找
     *
     * @param array 需要排序的数组
     * @return int array
     * */
    public int[] selectSort(int [] array){
        // 记录数组的长度
        int length = array.length;

        // 最后一位一定最小，所以只需要执行到倒数第二位即可
        for (int i = 0; i < length - 1; i++){
            // 将首位的索引记录，找到之后最小的索引
            int minIndex = i;
            for (int j = i + 1; j < length; j++){
//                if (array[minIndex] > array[j]){
//                    // 比当前最小索引的值小，记录索引
//                    minIndex = j;
//                }
                // 优化
                minIndex = array[minIndex] > array[j] ? j : minIndex;
            }
            // 首位索引没有改变，那么就不需要交换
            if (minIndex != i){
                SwapUtil.swapArray(array, i, minIndex);
            }

        }
        return array;
    }




    public static void main(String[] args) {
        int[] array = {1, 9, 8, 7, 3, 4};

        SelectSort selectSort = new SelectSort();

        array = selectSort.selectSort(array);
        SwapUtil.printArray(array);
    }
}
