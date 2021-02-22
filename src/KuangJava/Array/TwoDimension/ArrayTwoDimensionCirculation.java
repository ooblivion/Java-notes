package KuangJava.Array.TwoDimension;

public class ArrayTwoDimensionCirculation {
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3,4},{3,4,5,6}};

        //写个循环，全部打印出来
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
//总结：二维数组的元素是一维数组
//多维数组平时用到二维数组也差不多就够了