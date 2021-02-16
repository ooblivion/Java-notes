package KuangJava.Base;

public class Variables {
    static int allClicks=0;     //类变量
    String str="hello world";   //实例变量
    public void method(){
        int i = 0;              //局部变量
    }

    public static void main(String[] args) {
        //type varName [=value] [{,varName[=value]}]
        //int a,b,c;
        int a=1,b=2,c=3;//尽量写三行，不推荐这么写，可读性较差
        int A = 1;
        int B = 2;
        int C = 3;

        char x = 'X';
        double pi = 3.1415;
        //引用类型
        String name = "wdnmd";
    }
}
