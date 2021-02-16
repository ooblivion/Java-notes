package KuangJava.Array;

import java.util.Arrays;
//工具类都是人写的，自己也可以写

public class ArraysUtil {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,23,435,565,23324,6453,23};
        System.out.println(arrays);     //直接输出会返回一个hashcode [I@1b6d3586

        System.out.println(Arrays.toString(arrays));

        printArray(arrays);
        System.out.println();

        //数组进行排序：升序
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));    //输出的是升序，改变比较的方法可以变成降序

        //数组填充
        //将指定的长值分配给指定数组的每个元素的值。
        //左闭右开区间[1,4)，实际原因到了[4]就会判定停止
        Arrays.fill(arrays,1,4,99);
        System.out.println(Arrays.toString(arrays));

    }

    //实现打印数组的方法
    public static  void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i==0){
                System.out.print("[");
            }
            if (i==a.length-1){
                System.out.print(a[i]+"]");
            }else {
                System.out.print(a[i]+", ");
            }
        }
    }


}
