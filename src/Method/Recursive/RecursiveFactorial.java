package Method.Recursive;

import java.util.Scanner;

public class RecursiveFactorial {
    /*
    2!=2*1
    3!=3*2*1
    4!=4*3*2*1
    ....
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int result = f(input);
        System.out.println(result);
        scanner.close();

    }
    //阶乘 动态规划
    public static int f(int n){

        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
        //这里面的return是结束的意思
    }
}

/*
if n=3

|————————|      |———————|      |———————|      |———————|
|        | ---> |       | ---> |       | ---> |       |
|  Main  | <--- | f(3)  | <--- | f(2)  | <--- | f(1)  |
|————————|      |———————|      |———————|      |———————|

边界条件：到最后一个数的时候程序会执行到低，上面这个的边界是f(1)
前阶段：当参数不等于1的时候不停调用自身，也就是从左到右的这个过程
返回阶段：n*(n-1)

for循环也可以实现但是时间复杂读更高，相比起来递归更巧妙

补充一下 Java的程序都是[栈机制]/[Stack]
每调用一个方法就会压一层，从最底层开始
---------
|       |
|       |
| ....  |
|  ...  |
| second|
| first |
---------

如果这个栈满了就会溢出

比如如果是100!就会输出0，是20就会输出-2102132736

int类型的17就溢出，long类型的26就溢出，要用biginteger

能不用就不用吧，写算法题用一下还可以，但是递归这个原理很重要
 */
