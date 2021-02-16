package KuangJava.Operator;

public class Choose {
    public static void main(String[] args) {
        //? :

        int a = 10;
        int b = 20;
        int c = 33;
        int d = 44;

        a+=b;       //a=a+b
        a-=b;       //a=a-b

        System.out.println(a);

        //字符串连接符    +   在+左侧出现String，就会把另外一边也变成String
        //+的运算顺序是自左到右 ->
        System.out.println(c+d);
        System.out.println(""+c+d);
        System.out.println(c+d+"");
    }
}
