package KuangJava.Scanner;

import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        //创建一个扫描对象，用于接受键盘数据
        //new KuangJava.Scanner(System.in)    alt+enter
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接受：");

        //判断用户有没有输入字符
        if (scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next();
            System.out.println("输出的内容位："+str);
        }

        //io流的用完后要关闭，不然会占用资源
        scanner.close();
    }
}
