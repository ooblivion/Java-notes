package KuangJava.Structure.BreakContinue;

public class Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            if(i%10==0){
                System.out.println();
                continue;
            }
            System.out.print(i+"\t");
        }
    }
}
//一个是退出整个循环，一个是跳过本次操作
