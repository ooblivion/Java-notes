package KuangJava.Array;

public class UseForEach {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7};


        printArray(arrays);
        System.out.println("====");
        reverse(arrays);
//        //int array：变量 表示数组里面的每一个元素，增强for真的好用
//        //JDK1.5，没有下标，适合打印输出
//        //下面这个的快捷键  arrays.for + alt.enter
//        for (int array : arrays) {
//            System.out.print(array+"\t");
//        }

    }

    //打印数组元素
    //数组可以封装成参数
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+"\t");
        }
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];  //进来的数组和返回的要相同

        //反转的操作
        for (int i = 0, j=result.length-1; i < arrays.length; i++, j--) {
            result[j]=arrays[i];
            System.out.println(arrays[j]);
        }

        return result;
    }
}
//c语言中的数组不能作为返回值，只能返回指针
