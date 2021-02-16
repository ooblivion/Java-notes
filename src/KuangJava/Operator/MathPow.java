package KuangJava.Operator;

public class MathPow {
    public static void main(String[] args) {
        //幂运算 2^3 2*2*2=8 Java里面不能这么写
        //很多运算用工具类库来实现
        //Math库
        //这个Math类不用导包
        //input Math.pow(2, 3) and alt+enter
        double pow = Math.pow(2, 100);
        System.out.println(pow);
    }
}
