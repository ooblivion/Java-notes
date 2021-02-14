package Scanner;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        //输入多个数字，求总和和平均数，每输入一个数字用回车确认，通过输入非数字结束输入并输出执行结果

        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入多少数字
        int n = 0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            n = n + 1;//n++
            sum = sum + x;
            System.out.println("你输入了第"+n+"个数据，然后当前结果sum="+sum);
        }

        System.out.println(n + "个数的和为" + sum);
        System.out.println(n + "个数的平均数是" + (sum / n));

        scanner.close();
    }
}
