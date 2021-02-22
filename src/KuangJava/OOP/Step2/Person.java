package KuangJava.OOP.Step2;

//java-->class
//一个类即使什么都不写，也存在一个方法，也叫构造方法
//显示的定义构造器
//无参构造
public class Person {

    String name;
    /*
    无参构造
    必须和类的名字相同
    必须没有返回类型，也不能写void
    【默认构造器】
     */
    //实例化初始值
    public Person(){
        //new这个的java文件的对象的时侯会进这个方法
        this.name="lbwnb";
    }

    /*
    有参构造
    一旦定义了有参构造，无参构造就必须显示定义，否则无效
    只要有一个有参构造，默认构造函数就不在生效了
    【方法重载】
    若不定义有参构造，会赠送你一个无参，如果定义了有参构造，就不会赠送你无参构造。
    就必须显示定义无参构造
     */
    public Person(String name1){
        //左边的name代表对象本身的name，右边的name是以定义参数传递来的
        this.name = name1;
    }

}
//无参也要写，要不就一定要传参数
//重写是子类与父类的多态性