package Structure.RevievExercise;

public class PrintTriangle2For {
    public static void main(String[] args) {
        int line = 11;

        for (int i = 1; i<=line; i++){
            for (int j = line; j>=i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
