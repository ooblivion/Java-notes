package KuangJava.OOP.Step1;

public class PassByValue {
    //Pass By Value
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        //出来的结果仍然为1，因为Java是值传递，外层作用域会被内层作用域覆盖
        //形式参数里的a就是一个临时变量，它不等于主函数里的a，和C语言的区别就是不能传地址
        //实参和形参开辟了不同的内存空间，操作其中一个不会影响另一个
        PassByValue.change(a);
        System.out.println(a);
        //仍然打印不出来
        //System.out.println(PassByValue.change(a));
        a = PassByValue.intchange(a);
        System.out.println(a);
    }

    //返回值为空
    public static void change(int a){
        a = 10;
        //没有return，调用这个方法只是走以下这个方法，并没有操作具体的东西
    }

    //返回值为int
    public static int intchange(int a){
        return a = 100;
    }
    //这个值传递的两个a实际上指的不是同一个a，只是名字相同，就像人与人之间的重名，两个相同名字的人不是一个人
    //引用传递的name就相当于自己身上的某个属性，两个地方的name都是指的同一个
    //就是指向的不一样，一个指向内存，一个是指向的对象
    //值传递：实参和形参在内存上是独立的两个变量
    //引用传递：实参和形参在内存上指向的是同一个地址
}