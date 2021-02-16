package KuangJava.Array;

public class ArrayInitialize {
    public static void main(String[] args) {
        //静态初始化：创建 + 赋值
        int[] a = {1,2,3,45,6};//放多少个空间就多大，一旦定义之后空间就不可改变了

        //Example[] examples = {new Example(),new Example()};
        //引用其他的class

        System.out.println(a[3]);

        //动态初始化：包含默认初始化
        int[] b = new int[10];
        b[0] = 11;
        System.out.println(b[0]);

    }
}
