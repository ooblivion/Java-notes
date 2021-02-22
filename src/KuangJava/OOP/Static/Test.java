package KuangJava.OOP.Static;

//import java.lang.Math.random; 导入特定的包会报错，要加个static
import static java.lang.Math.random;//静态导入包
import static java.lang.Math.PI;

public class Test {
    public static void main(String[] args) {
        //System.out.println(Math.random());
        //若想不用Math. 则需要在头部导入Math包
        System.out.println(random());
        System.out.println(PI);
    }
}

/*
Math包里面的类被final修饰，final是断子绝孙符，被这个修饰的类不能被继承
但是仍然可以作为子类继承其他父类
 */
