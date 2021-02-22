package KuangJava.OOP.Abstract;

//抽象类的所有方法，继承了它的子类，都必须要实现它的方法，除非子类也是抽象的
//注意，是必须实现它的抽象方法，普通方法不用
public class A extends Action{
//    //ctrl+i 实现方法
//    @Override
//    public void doSomething1() {
//
//    }

    @Override
    public void doSomething1() {

    }

    //new Action(); 抽象类不能new出来

}
/*
抽象类的本质是类，需要去继承，但是摆脱不了extents的单继承局限性

单继承无法继承多个类

由于Java里面没有多继承，所以有了接口

接口可以多继承，打个比方，接口像插头，可以只要符合插头口标准的都可以插

开发中接口用的多，继承用的少。大佬设计好整体架构，用抽象类，手底下人继承具体实现

总结 类单继承 接口多实现
 */

/*
抽象类特点
1.不能new出来，只能靠子类去实现它，也就是不能实例化
2.抽象类里面可以有一些正常的方法
 */