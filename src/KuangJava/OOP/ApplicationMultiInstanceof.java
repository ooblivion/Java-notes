package KuangJava.OOP;

import KuangJava.OOP.Multi.Person;
import KuangJava.OOP.Multi.Student;
import KuangJava.OOP.Multi.Teacher;

public class ApplicationMultiInstanceof {
    public static void main(String[] args) {

        //Object > String
        //Object > Person > Teacher
        //Object > Person > Student
        //Object几乎是造物主，谁都是它儿子
        //判断一个对象是否是一个类的实例
        Object object = new Student();

        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);

        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof String);

        System.out.println("===========");

        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);

        System.out.println(person instanceof Teacher);
        //System.out.println(person instanceof String);
        // 编译就报错，由于这两个没有关系

        System.out.println("==================");
        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);

        //System.out.println(student instanceof Teacher);
        // 编译就报错，没有继承关系，student和teacher是同级
        //System.out.println(person instanceof String);
        // 编译就报错，由于这两个没有关系

        //System.out.println(x instanceof y); 判断能不能编译通过
        //编译是否通过和结果对错是两码事
    }
}
/*
instanceof实际上判断一个变量所指向的实例是否是指定类型，或者这个类型的子类

代码的运行分为编译和运行两步，编译的时候只看类型，
所以是先去看的instanceof两边的数据类型是否有父子关系

感觉instanceof就是用来判断往哪种多态方向走的

直接可以理解成是否具有线性父子关系
 */
