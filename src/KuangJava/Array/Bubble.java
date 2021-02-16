package KuangJava.Array;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //冒泡排序  时间复杂度为O(n2)
        //1. 比较数组中相邻的元素，如果第一个数比第二个数大，我们就交换它们的位置
        //2. 每一次比较都会产生出一个最大或最小的数
        //3. 下一轮可以少一次排序
        //4. 依次循环，直到结束
        int[] a = {11,324,456,213,21,32,35,654,32,123};

        int[] result = sort(a);
        System.out.println(Arrays.toString(result));

    }

    //第一个循环是一共要比较的轮数，第二个循环是数与数之间要比较的次数

    //-1是因为第一次比较之后，已经产生了一个最大的或最小的数，不需要进行下一轮的比较了。
    //内层比一轮，下次就少比一个，i表示已经排好了的数组元素的个数

    //本次的冒泡排序结果是从大到小

    public static int[] sort(int[] arr){
        //临时变量
        int temp = 0;

        //外层循环，判断要走多少次
        //-1 是为了不溢出，数组是从0开始所以少一个
        //length和下标不要弄混了，最大下标=length-1
        for (int i = 0; i < arr.length-1; i++) {

            //通过flag标识位减少没有意义的比较
            boolean flag = false;

            //内层循环，比较判断两个数，如果第一个数比第二个数大则交换位置
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true;
                }
            }
            if (flag==false){
                break;
            }

        }

        return arr;
    }
}
