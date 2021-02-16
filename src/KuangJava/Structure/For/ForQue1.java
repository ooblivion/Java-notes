package KuangJava.Structure.For;

public class ForQue1 {
    public static void main(String[] args) {
        //0~100 奇数和偶数的和
        int oddsum=0;
        int evensum=0;

        for (int i=0; i<=100; i++){
            if (i%2!=0){
                oddsum+=i;
            }
            if (i%2==0){
                evensum+=i;
            }
        }
        System.out.println("total odd is "+oddsum);
        System.out.println("total even is "+evensum);
    }
}
