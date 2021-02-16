package KuangJava.Structure.For;

public class ForQue3While {
    public static void main(String[] args) {
        int j = 1;
        while(j<=9){
            int i = 1;
            while(i<=j){
                System.out.print(j+"x"+i+"="+(i*j)+"\t");
                i++;
            }
            System.out.println("\n");
            j++;
        }
    }
}
