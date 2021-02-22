package KuangJava.OOP.Static;

//static
public class Student {

    //分配内存时机不同
    private static  int age;    //静态变量 多线程
    private double score;       //非静态变量

    public void run(){
        go();
    }

    public static void go(){

    }

    public static void main(String[] args) {
        new Student().run();    //通过 new 对象.方法 来调用非静态方法
        Student.go();           //不用new，可以直接调用静态方法 static可以扩大使用范围
        go();                   //由于go在当前这个类里，可以直接调用

//        Student sss = new Student();
//        sss.run();
//        sss.go();


//        Student s1 = new Student();
//
//        System.out.println(Student.age);
//        //System.out.println(Student.score); 无法直接调用score
//
//        //下面的两个和对象有关
//        System.out.println(s1.age);
//        System.out.println(s1.score);
//
//        //如果是静态变量，推荐使用类名访问


    }
}

//非静态的方法可以直接去访问类中的静态方法
// 就像这个main方法，他也是个方法，但是也只能在本类用
//静态一直存在，非静态的需要打开了才能用，静态的东西都能直接用
/*
static和类一起加载，所以main方法里面可以直接调用外面的static方法，而run()是非静态的所以不能直接

Static这里说的意思是 原本Java文件编译成class文件，如果有static关键字，就会一起加载进去初始化
没有static的话，你就需要new了才能加载，jvm是条懒狗，不会全部加载

在加载类之前static已被申请

类加载顺序的问题
以后在 类加载机制 也就是 注解和反射的时候会讲
 */

//有其他的语言基础看新语言就是熟悉语法和ide
