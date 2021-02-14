package Operator;

public class MultiType {
    public static void main(String[] args) {
        long a = 134325432543325L;
        int b = 123;
        short c = 20;
        byte d = 10;

        System.out.println(a+b+c+d);            //long
        System.out.println(b+c+d);              //int
        System.out.println(c+d);                //short
        System.out.println((double)c+d);        //尝试double转换
        //double float long int short byte char final
        //类型转换：byte、short、char用运算符运算后自动转型为int类型
        //不同类型混合运算无论是赋值还是运算都是向最高位转
    }
}
