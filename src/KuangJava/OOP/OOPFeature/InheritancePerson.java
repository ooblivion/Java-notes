package KuangJava.OOP.OOPFeature;

//person 人 是一个比较高的类别 父类/基类
public class InheritancePerson {

    //public    公共的才可以用
    //privat    私有的不能继承
    //default   默认的，可以什么都不写
    //protected 受保护的

    //public是最高级别的，如果让子类去继承父类一般都是public
    //属性应该的私有的，方法公有
    public int money = 10_0000_0000;
    private int privatemoney = 100;

    public int getMoney() {
        return privatemoney;
    }

    public void say(){
        System.out.println("👴说了一句话");
    }

    //=====================
    //super

    protected String name = "lbwnb";

    //如果是private就无法继承
    //（不是，好像可以继承但是无法访问，只能被本地访问。子类只是拥有父类的私有方法，但是没有访问权限）
    public void print(){
        System.out.println("print out a linn in father");
    }

    public InheritancePerson(){
        System.out.println("Person无参构造执行");
    }

}
//封装是关于底层的，而继承是宏观的把握，多态也是要有继承的一个前提

//类只有单继承，接口可以多继承

//多继承和多重继承 意思是不一样的，方法只有单继承，但是可以多重继承；多继承就是一个子类有多个父类

//构造方法（构造器）是不能继承的

//C# 继承简单一些，直接用冒号就可以了

/*
在Java中，所有的类都默认直接或间接继承Object（匿名内部类）
Object才是所有类的祖先
 */