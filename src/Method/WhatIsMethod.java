package Method;

public class WhatIsMethod {
    //main method declaration
    public static void main(String[] args) {
//        int sum = add(1, 2);
//        System.out.println(sum);

        test();

    }

    //add
    //  修饰符   返回值类型 方法名(形参)
    public static int add(int a, int b){
        return a+b;
    }

    //方法的固定写法
    public static void test(){
        for (int i = 1; i<=10; i++){
            for (int j = 10; j>=i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


/*
形参和实参的区别

实参(argument)
全称为"实际参数"是在调用时传递给函数的参数. 实参可以是常量、变量、表达式、函数等，
无论实参是何种类型的量，在进行函数调用时，它们都必须具有确定的值， 以便把这些值传送给形参。
因此应预先用赋值，输入等办法使实参获得确定值。

形参(parameter)
全称为"形式参数" 由于它不是实际存在变量，所以又称虚拟变量。
是在定义函数名和函数体的时候使用的参数,目的是用来接收调用该函数时传入的参数.在调用函数时，
实参将赋值给形参。因而，必须注意实参的个数，类型应与形参一一对应，并且实参必须要有确定的值。
 */