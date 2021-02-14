package Structure.For;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {12,11,23,43,12};

        for(int i = 0; i<5; i++){
            System.out.print(numbers[i]+"\t");
        }
        System.out.println("\n");

        for(int x:numbers){
            System.out.print(x+"\t");
        }
    }
}
