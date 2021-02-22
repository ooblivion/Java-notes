package KuangJava.OOP.Step2;

//学生类
//逐渐开始在类里面不添加main方法
public class Student {
    //属性：字段
    String name;//null
    int age;//0

    //方法
    public void study(){
        //this代表当前这个类
        System.out.println(this.name+"在学习");
    }
}
