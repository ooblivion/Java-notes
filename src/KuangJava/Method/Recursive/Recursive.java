package KuangJava.Method.Recursive;

public class Recursive {
    public static void main(String[] args) {
        Recursive objet = new Recursive();
        //类型     变量名    变量值
        objet.test();
    }

    public void test(){
        test();
    }
}
//Exception in thread "main" java.lang.StackOverflowError
//栈溢出
