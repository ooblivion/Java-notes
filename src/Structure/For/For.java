package Structure.For;

public class For {
    //这个循环是最重要的
    /*
    练习
    1. 计算0~100之间奇数和偶数的和
    2. 用while或for循环输出1~1000之间能被5整除的数，并且每行输出三个
    3. 打印九九乘法表
     */

    /*
    for(initialize; boolean; renew){
        //code
    }
     */

    public static void main(String[] args) {
        int a = 1;//初始化条件--initialize

        while(a<=100){//条件判断--boolean
            System.out.println(a);//循环体--code
            a+=2;//迭代--renew 每一次循环会让a的值刷新 a = a + 2
        }

        System.out.println("while循环结束");


        //      初始化 条件判断 迭代
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }

        System.out.println("for循环结束");


        /*
        有个快捷键
        100.fori可以生成下面的代码
        for (int i = 0; i < 100; i++) {

            
        }
         */

        /*
        最先执行初始化步骤，可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句
        然后布尔值判断，然后执行循环体语句，然后才是迭代，接着开始新一轮的循环，从布尔判断开始
         */

    }
}
