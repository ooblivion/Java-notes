package KuangJava.OOP.Multi;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("student run");
    }

    public void eat(){
        System.out.println("student eat");
    }

    public void go(){
        System.out.println("go Student");
    }
}
