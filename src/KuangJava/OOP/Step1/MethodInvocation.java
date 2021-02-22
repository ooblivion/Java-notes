package KuangJava.OOP.Step1;

public class MethodInvocation {
    public static void main(String[] args) {
        //调用学生类里面的方法 静态方法可以直接调用
        ClassStudent.staticsay();

        //非静态方法 需要把这个类实例化 也就是new一个对象
        new ClassStudent().say();
        //equal
        //new ClassStudent() + alt enter
        //对象类型 对象名字 = 对象值
        ClassStudent student = new ClassStudent();
        student.say();
    }
    //当a和b都是静态或都是非静态的时候可以相互调用
    public static void a(){
        b();
        //c();

        MethodInvocation methodInvocation = new MethodInvocation();
        methodInvocation.c();
    }
    //因为static是和class/类一起加载的，当class存在的时候static也存在
    public static void b(){

    }
    //类实例化才存在 一个已经存在的东西调用不存在的所以会报错
    //非静态方法需要一个对象来调用，非静态方法需要实例化对象才能被调用，static加载的早，类一加载它就有了
    //非静态可以相互调用是因为【同步加载】
    public void c(){

    }

    //静态方法 static

    //非静态方法 without static

    //静态方法其实就是普通全局函数

    //.var局部变量  .field全局变量

    //静态方法只能调用静态方法，非静态方法可以调用静态方法
}
