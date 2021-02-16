package KuangJava.Operator;

public class Logic {
    public static void main(String[] args) {
        //逻辑运算符 判断 与或非  &&  ||  !
        //单&和单|都有效果但是不短路
        //and   与   两个都位真即位真
        //or    或   其中一个位真即为真
        //not   非   假变真，真边假
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: "+(a && b));
        System.out.println("a || b: "+(a || b));
        System.out.println("!(a && b): "+(!(a && b)));
        //加号是连接起来输出，和python的类似

        //短路运算
        //先对b进行判断发现是假的就不去看后面的a是真是假，直接退出
        System.out.println("a && b: "+(b && a));

        System.out.println("==============");

        //短路运算实验
        //短路与和与是不同的，与是不管第一个是否为true都会进行第二次判断
        int s = 10;
        boolean d = (s<9)&&(s++<9);     //后面的自增没有进行
        int S = 10;
        boolean D = (S<11)&&(S++<11);   //后面的自增进行了
        System.out.println(d);
        System.out.println(s);
        System.out.println(S);
        System.out.println(D);

    }
}
