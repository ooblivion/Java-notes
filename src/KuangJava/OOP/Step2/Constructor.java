package KuangJava.OOP.Step2;


//构造器
//每个类都有个默认的构造方法
public class Constructor {

    public static void main(String[] args) {
        //new 实例化了一个对象
        Person person = new Person("lbwsb");
        //没有赋任何值会返回一个null
        System.out.println(person.name);
    }
}
//学了一个类，关于工厂和其他东西的知识树都通了
//一个完整的类，应该就是属性，方法。空构造，有参构造，然后Set和get，再toString

//构造器的核心作用
//1.使用new关键字必须要有构造器 new一个对象的时候本质还是在调用构造器
//2.构造器一般用来初始化值

/*
构造器特点
    1.和类名相同
    2.无返回值

作用
    1.new关键词本质还是调用构造器
    2.构造器一般用来初始化值

注意点
    1.定义了有参构造之后，如果想使用无参构造，显示的定义一个无参的构造

快捷键
    alt+inser 构造器

其他
    this.xxx = www;
    xxx代表当前类里面的
    www代表传进来的值

没有自己定义构造器，编译器默认生成一个无参的构造器，如果级显示定义了，编译器就不会给我们生成了
 */