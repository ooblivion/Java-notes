package KuangJava.Base;

public class Type_Conversion {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;
        double s = i;

        //强制转换（类型）变量名 高->低
        //自动转换 低->高

        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        /*
        1. 不能对布尔值进行转换
        2. 不能把对象抓换成不相干的类型
        3. 在把大容量转换到低容量的时候，强制转换
        4. 转换的时候可能存在内存溢出或精度的问题
         */


        System.out.println("===========");
        char x = 'a';
        int d = x+1;
        System.out.println(d);
        System.out.println((char)d);

        //内存溢出 强制转换
        //操作比较大的数的时候，注意溢出问题
        //JDK7特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years;            //-1474836480，计算的时候已经溢出
        long total2 = money*years;          //默认是int，转换之前已经存在问题了
        long total3 = money*((long)years);  //先把一个数转换成long，或者将money定义成long也可以
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);


        //类型转换处了转换基本类型，还可以把类互相转换
    }
}
