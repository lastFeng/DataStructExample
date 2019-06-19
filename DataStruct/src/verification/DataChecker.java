package verification;

import selectsort.SelectSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author guowf
 * @mail guowf_buaa@163.com
 * @description:
 * @data created in 2019-06-19 21:13
 * 对数器：验证算法是否正确
 */
public class DataChecker {
    /**
     * 产生随机数组
     * */
    static int[] generateRandomArray(){
        Random r = new Random();
        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(10000);
        }

        return arr;
    }
    /**
     *
     * */
    static void check(){
        int num = 10000;
        // 多次检测，以此来检测正确性的稳定
        while (num > 0) {

            int[] arr = generateRandomArray();

            int[] arr2 = new int[arr.length];
            // 数组拷贝，修改arr不会影响arr2
            System.arraycopy(arr, 0, arr2, 0, arr2.length);

            Arrays.sort(arr);
            new SelectSort().selectSort(arr2);

            boolean same = true;

            for (int i = 0; i < arr2.length; i++) {
                if (arr[i] != arr2[i]) {
                    same = false;
                }
            }
            System.out.println(same == true ? "right" : "wrong");
            num--;
        }
    }

    public static void main(String[] args) {
        check();
    }

}
