package Method;

public class VariableParameters {
    public static void main(String[] args) {
        VariableParameters variableParameters = new VariableParameters();
        variableParameters.test(1,2,3);
        //实例化
        //内存地址
        //输出了个指针
    }

    public void method(){}
    public void method(int i){}
    public void method(int i,int i2){}
    public void method(int i,double d){}


    public void test(int x,int... i){     //本质还是数组
        System.out.println(i[3]);
    }
}
