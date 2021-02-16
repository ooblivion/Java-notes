package KuangJava.Scanner;

import java.util.Scanner;

public class WithoutIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter date");

        String str = scanner.nextLine();

        System.out.println("you input: "+str);

        scanner.close();
    }
}
