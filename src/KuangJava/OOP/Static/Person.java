package KuangJava.OOP.Static;

public class Person {

    //2
    //和对象同时产生，而且在构造方法之前，可以用来赋一些初始值
    {
        System.out.println("匿名代码块");
    }

    //1 只执行一次
    static {
        System.out.println("静态代码块");
    }

//    //静态代码块 匿名代码块
//    {
//        //代码块（匿名代码块）
//        //程序在执行的时候不能主动调用这些模块
//        //在创建这个对象的时候就已经自动创建了，而且在构造器之前
//    }
//
//    //有时候为了方便初始化一些东西 用下面这种静态代码块 在这里面可以加载一些初始化的数据
//    static {
//        //静态代码块
//        //类一加载执行，永久只执行一次
//    }


    //无参构造器 3
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("==============");
        Person another = new Person();//第二个不会输出静态代码块的内容，静态代码块的内容只会执行一次
    }
}
/*
静态 > 匿名 > 构造
 */
