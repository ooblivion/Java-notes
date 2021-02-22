package KuangJava.OOP.Step1;

//引用传递：对象，本质还是值传递

//对象 内存

public class PassByReference {
    //Pass By Reference
    public static void main(String[] args) {
        //实例化的过程 也就是创建一个对象
        Person person = new Person();

        //返回一个内存地址
        System.out.println(person);
        //null
        System.out.println(person.name);

        //这是一个静态的方法不用new
        PassByReference.change(person);
        //ヨルシカ
        System.out.println(person.name);
    }

    //person是一个引用，指向的是堆里面的对象
    public static void change(Person person){
        //person是一个对象，指向的 ---> People person = new Person(); 这是一个具体的人，可以改变属性
        //这儿应该打印person内存地址，传递的是对象引用地址
        //类似C的指针传递
        //之前传递的是一个int属性，然而这传递的是person的类，改变类的属性当然可以接受到
        person.name = "ヨルシカ";
    }
}

//一个类里面只能有一个public
//变量名对应的内存地址不一样
//值传递，传递后的值被改了不影响原值

//这是内部类了

//定义了一个person的类，有一个属性name
class Person{
    //如果不修改，String的默认值是null
    String name;
}
