package KuangJava.Base;

public class Type {
    public static void main(String[] args) {
        String a = "hello";
        int number = 10;
        //基本类型
        //整数
        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 40L;

        //小数：浮点数
        float num5 = 10.1F;
        double num6 = 1.1234243254325235;

        //字符
        char name = 'w';
        //字符串，string不是关键字，是类
        //string name = "wwt";

        //布尔值：是非
        boolean flag = true;

        System.out.println(a);
        System.out.println(number);

        //float 有限 离散 舍入误差 大约 接近但不等于
        float f = 0.1f; //0.1
        double d = 1.0/10;  //0.1
        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);


        char s = '\u0061';
        System.out.println(s);


        //布尔值扩展
        boolean flag1 = true;

        if (!flag1==true){

        }
        //等价与 if(flag)

    }
}

