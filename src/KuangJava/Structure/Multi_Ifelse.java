package KuangJava.Structure;

import java.util.Scanner;

public class Multi_Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please in put score");
        int score = scanner.nextInt();

        if(score==100){
            System.out.println("nb");
        }else if (score<100 && score>=90){
            System.out.println("A");
        }else if (score<90 && score>0){
            System.out.println("not too bad");
        }else {
            System.out.println("invade");
        }

        scanner.close();
    }
}
