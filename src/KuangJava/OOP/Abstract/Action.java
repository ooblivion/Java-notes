package KuangJava.OOP.Abstract;

//在类前面加个abstract就成抽象类了
public abstract class Action {

    //假设这个方法是一个约束，也就是说这个方法不想写，希望别让帮忙实现
    public void doSomething0(){
    }
    //public void doSomething1(); 报错

    //是一个抽象方法，只有方法名字，没有方法的实现
    public abstract void doSomething1();
}
