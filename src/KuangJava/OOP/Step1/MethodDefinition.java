package KuangJava.OOP.Step1;

import java.io.IOException;

public class MethodDefinition {
    //main方法 启动当前程序
    public static void main(String[] args) {
    }

    /*
    返回值类型要和返回值对应

    修饰符 返回值类型 方法名(方法的参数){
        方法体
        return 返回值;
    }
     */

    //以下是一个返回hello world的方法
    public String sayhello(){
        return "hello world";
    }

    //返回一个空值
    public void hello(){
        return;
    }

    //计算 比大小
    public int Max(int a,int b){
        return a>b ? a : b;     //三元运算符 若a>b 结果true 输出a 若a<b 结果false 输出b
    }

    //异常抛出 准确的说应该叫方法上声明异常
    public void readfile(String file) throws IOException {   //异常抛出 IO流 throws IOException
        //还有数组下标越界也是异常抛出：Arrayindexoutofboundes
    }
}
