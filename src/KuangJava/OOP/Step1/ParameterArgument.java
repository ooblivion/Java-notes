package KuangJava.OOP.Step1;

import java.util.Scanner;

public class ParameterArgument {
    //parameter 形参
    //argument  实参
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("put number: ");
        int a = input.nextInt();
        int b = input.nextInt();


        ParameterArgument argument = new ParameterArgument();
        int result = argument.add(a,b);
        System.out.println(result);
        input.close();

    }

    public int add(int a,int b){
        return a+b;
    }
}
