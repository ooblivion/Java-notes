package KuangJava.Method;

public class CommandLine {
    public static void main(String[] args) {
        for (int i=0; i< args.length; i++){
            System.out.println("args["+i+"]"+args[i]);
        }
    }
}
//数组的长度是从0开始的
