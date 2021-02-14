package Scanner;

import java.util.Scanner;

public class ScannerType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //从键盘接受数据
        int i = 0;
        float f = 0.0f;

        System.out.println("please input int: ");
        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("int date: "+ i);
        }else {
            System.out.println("what you input is not int");
        }

        System.out.println("please input float: ");
        if(scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("float date: "+ f);
        }else {
            System.out.println("what you input is not float");
        }


        scanner.close();
    }
}
