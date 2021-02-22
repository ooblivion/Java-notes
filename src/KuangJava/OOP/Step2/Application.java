package KuangJava.OOP.Step2;


//一个项目应该只有一个main方法
public class Application {
    public static void main(String[] args) {

        //类相当于一个模板，对象是一个实例
        //学生类是学生的属性(姓名)方法(能干什么)
        //创建的学生对象的一个具体的学生(有头有脸)

        //类，抽象的，实例化
        //类实例化后会返回一个自己的对象
        //student对象是一个Student类的具体实例
        //同一个类能有不同的对象
        //基础类型存值，引用类型存地址
        Student student = new Student();
        Student lbw = new Student();
        Student nb = new Student();

        lbw.name = "lbw";
        lbw.age = 100;

        //空的，返回null
        System.out.println(lbw.name);
        System.out.println(lbw.age);

        nb.name = "sb";
        nb.age=1000;
        System.out.println(nb.name);
        System.out.println(nb.age);
    }
}
//结构体strut默认访问权限public，类class默认访类型private
