package KuangJava.Method;

public class MethodOverloading {
    public static void main(String[] args) {
        double max = max(20, 14);
        System.out.println(max+" is bigger than another");
    }
//根据入参进行匹配，返回值不同不构成重载
//重载是子类继承时候修改父类方法的说法

    public static double max(double num1,double num2){

        double result;

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
