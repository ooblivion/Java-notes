package Operator;

public class IncrementDecrement {
    public static void main(String[] args) {
        //自增++ 自减--
        int s = 12;
        int d = s++;            //先将s赋给d然后s+1=13
        int f = ++s;            //先是s(13)+1=14然后赋给f
        System.out.println(s);
        System.out.println(d);
        System.out.println(f);
    }
}
