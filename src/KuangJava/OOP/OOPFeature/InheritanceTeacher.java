package KuangJava.OOP.OOPFeature;

//老师 is a 人 子类/派生类
//子类继承了父类就会拥有父类的全部方法，不仅是全部的方法

//extends InheritancePerson
public class InheritanceTeacher extends InheritancePerson {

    //快捷键 ctrl+h 打开一个继承树

    //============================
    //super
    private String name = "www";

    public void test1(String name){
        System.out.println(name);
        System.out.println(this.name);
        //如何访问父类的name
        //在子类的内部中调用父类的方法和属性是通过super来实现的
        System.out.println(super.name);
    }

    public void print(){
        System.out.println("print out a linn in son");
    }

    public void test2(){
        print();        //调用当前类中的
        this.print();   //调用当前的，有个this更清楚
        super.print();  //调用父类的
    }

    public InheritanceTeacher() {
        //隐藏代码：默认调用父类的无参构造
        //super(); ⬅ 隐藏的代码
        //必须在子类的第一行 相当于初始化
        //先要初始化父类，才能初始化子类
        //super();
        this("hello");
        //上面这个会报错：'this()' 调用必须是构造函数本体中的第一条语句
        System.out.println("子类的无参构造");
    }

    //有参构造
    public InheritanceTeacher(String name) {
        this.name = name;
    }
}

//当子类teacher想用person的是后除了 extends InheritancePerson 还可以使用【组合】
//把people变成teacher的一个属性，只是相当于teacher的里面包含的person的属性
//组合以后再慢慢学 InheritancePerson inheritancePerson; 组合有点像结构体的嵌套

/*
继承是类和类之间的关系
 */

