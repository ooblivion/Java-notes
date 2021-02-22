package KuangJava.OOP;

//之前new对象没有导包因为在同一个包下面
import KuangJava.OOP.Step3.Pet;

public class Step3Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "wc";
        dog.age = 3;
        dog.shout();
        System.out.println(dog.name);
        System.out.println(dog.age);

        Pet cat = new Pet();

    }
}
//String当作final处理的，所以会在常量池里面
//String底层是被final修饰的

//dog就是一段地址，通过这个地址去找到堆中对应的对象，相当于通过一个人名找到一个人
//dog是一个变量，相当于一个容器，存放pet的对象地址

//对象中的成员先默认初始化，再显示初始化

//这好像是static不能做到的

//先在堆上开辟空间，再引用指向

/*
堆储存对象和数组元素，栈储存系统调用变量（例如引用）
堆：存放new的数组和对象
栈：存放基本变量类型和引用变量

JDK7之前方法区在堆中，8以后移动到本地内存了
 */