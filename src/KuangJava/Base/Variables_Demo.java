package KuangJava.Base;

public class Variables_Demo {
    //属性：实例变量
    String name;
    int age;

    //全局变量，可以直接引用
    //加了static关键字的，可以通过类型：：变量直接访问，其实在这个默认有一个this指针一样的的东西
    static double wages = 3000;

    //实例变量：从属于对象 ↑ 如果不自行初始化，会变成这个类型的默认值
    //数值类型初始化都是0 0.0
    //布尔值默认是false
    //除了基本类型以外的其余都是null，对象类型都是null，比如引用类型String初始化是null

    //实例变量也叫成员变量（定义在方法之外），加了static就变成全局变量了，也叫类变量
    //成员变量就是全局变量 也就是属性
    //局部变量是所属方法特有的
    //只是声明在方法之外，肯定在方法里 不然都没有意义了

    //static用于提升作用域，常用于单例模式，学完了mybatis回来复习一下基础


    //main 方法
    public static void main(String[] args) {

        //在这儿的是局部变量
        //仅存在与这个括号里面，在别的方法里面无法引用
        //使用之前必须声明和初始化值

        int i = 10;
        System.out.println(i);

        //变量类型 变量名字 = new KuangJava.Base.Variables_Demo();
        //捷键是alt+enter

        Variables_Demo variables_demo = new Variables_Demo();
        //实例变量
        System.out.println(variables_demo.age);
        System.out.println(variables_demo.name);

        //全局变量
        //没有Variables_Demo variables_demo = new KuangJava.Base.Variables_Demo();也可以使用
        System.out.println(wages);


    }

    //其他方法 举例：add
    public void add(){

    }
}

//单词
//常量 constant
//初始化 initialize