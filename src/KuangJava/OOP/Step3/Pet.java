package KuangJava.OOP.Step3;

public class Pet {
    //public 的权限比较高
    //public 是给权限，成员变量和局部变量会讲到
    public String name;
    public  int age;

    //无参构造 默认存在
    //shout不是构造方法，注释只是说明这个类默认有隐式的构造方法，构造方法必须和类名一致
    public void shout(){
        System.out.println("叫了一声");
    }
}
