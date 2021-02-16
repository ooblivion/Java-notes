package KuangJava.Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        //从键盘接受数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接受：");

        //判断是否有输入
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容位："+str);
        }
        scanner.close();
    }
}
