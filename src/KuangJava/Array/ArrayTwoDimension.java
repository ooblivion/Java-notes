package KuangJava.Array;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        //[5][2]
        /*
            array[0] 1,2
            array[1] 2,3
            ...
            array[4] 5,6
         */
        int[][] array = {{1,2},{2,3},{3,4},{4,5},{5,6}};

        //printArray(array[0]);
        System.out.println(array[0][0]);//直接输出的话会返回一个内存地址，保存的是堆中的地址
        //两个for循环就可以全部打印出来了

    }

    //打印数组元素
    //数组可以封装成参数
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
