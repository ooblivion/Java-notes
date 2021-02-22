package KuangJava.OOP.OOPFeature;

//A是B的子类
public class A extends B{
//    public void test(){
//        System.out.println("A=>test()");
//    }
//    //o代表重载

    //Override 重写
    @Override //注解 有功能的注释
    public void test() {
        //默认 super.test();
        System.out.println("A=>test()");
    }
}
