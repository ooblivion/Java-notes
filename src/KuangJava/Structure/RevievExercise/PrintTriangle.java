package KuangJava.Structure.RevievExercise;

import java.util.Scanner;

public class PrintTriangle {
    //打印5行的三角形

    //思路：一个大三角分成两个小三角，循环颠倒着来

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please input a number: ");
        int in = scanner.nextInt();

        for (int i = 1; i <= in; i++){
            for (int j =in; j>=i; j--){
                System.out.print(" ");      //part 1
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");      //part 2
            }
            for (int j = 1; j<i; j++){
                System.out.print("*");      //part 3
            }
            System.out.println();
        }
        scanner.close();
    }
}

//这个属实有点意思

    /*

     ··············
     ·     *      ·
     · 1  ** *    ·
     ·   *** **   ·
     ·  **** ***  ·
     · ***** *****·
     ··············
        ↑2     ↑3

     */