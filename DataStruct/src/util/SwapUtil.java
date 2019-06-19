package util;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-19 21:26
 */
public class SwapUtil {
    /**
     * 数组的start和end位置进行交换
     * @param array 数组
     * @param first 交换索引
     * @param second 交换索引
     * @return array int
     * */
    public static int[] swapArray(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
        return array;
    }

    /**
     * 打印数据的数据
     * @param array 需要打印的数组
     * */
    public static void printArray(int[] array){
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
