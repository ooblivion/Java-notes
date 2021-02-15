package Method.Recursive;

import java.util.Scanner;

public class RecursiveCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result;
        System.out.print("please input what you want calculator: ");
        double a = input.nextDouble();
        String operation = input.next();
        double b = input.nextDouble();


        switch (operation){
            case "+":
                result = add(a,b);
                System.out.println(a+operation+b+"="+result);
                break;
            case "-":
                result = subtraction(a,b);
                System.out.println(a+operation+b+"="+result);
                break;
            case "*":
                result = multiplication(a,b);
                System.out.println(a+operation+b+"="+result);
                break;
            case "/":
                result = divisions(a,b);
                System.out.println(a+operation+b+"="+result);
                break;
            default:
                System.out.println("what you input that i can't understand");
        }

        input.close();
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static double subtraction(double a, double b){
        return a-b;
    }

    public static double multiplication(double a, double b){
        return a*b;
    }

    public  static  double divisions(double a, double b){
        return a/b;
    }

}

/*

递归作业，实现加减乘除功能并且能够循环接受新的数据，通过用户交互实现

思路
- 写四个方法：加减乘除
- 利用循环+switch进行用户交互
- 传递需要操作的两个数
- 输出结果

 */