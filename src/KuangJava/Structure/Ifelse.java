package KuangJava.Structure;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        //大于60及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("please inpue score: ");

        int s = scanner.nextInt();

        if(s > 60){
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }

        scanner.close();
    }
}
