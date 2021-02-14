package Structure.For;

public class ForQue3 {
    public static void main(String[] args) {
        //打印九九乘法表
        //for循环嵌套
        /*
        1*1=1
        1*2=2 2*2=4
        ...
        1*9=9 ...
         */

        //先打印第一列
        //把固定的1再用一个循环包起来
        //去掉重复选项 i<=j
        //调整样式
        for(int j = 1; j<=20; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");       //不换行用print，不用println
            }
            System.out.println("\n");
        }
        //外面的循环用来判断第几行，里面的来判断不同的行输出多少个
        //利用原理：2个嵌套的for循环，从最里面的for开始循环，最里面的for循环完了才到外面的for开始循环

    }
}
