package Method;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int max = max(n1, n2);
        System.out.println(max+" is bigger than another");

        scanner.close();
    }

    //比较大小
    //public                 static                 int         max
    //所有成员都可用    可以直接调用，是一个类变量      返回值类型     方法名

    public static int max(int num1,int num2){

        int result;

        if (num1 == num2){
            System.out.println("the two number is equal");
            return 0;
        }
        else if (num1 > num2){
            result = num1;
        }else {
            result = num2;
        }

        return result;//返回值还要初始化
    }
}

//修饰符分权限修饰符，特征修饰符，不过常用的也就那么几个

//retur除了有返回值的意思以外，还有终止方法