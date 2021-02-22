package KuangJava.Array.Sparse;

public class Test {
    public static void main(String[] args) {
        int row = 15;
        int col = 15;
        int[][] arr = new int[row][col];
        arr[1][5] = 14;
        arr[0][9] = 23;
        arr[4][0] = 54;
        System.out.println("out arr");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("become sparse arrays");
        //1.sum
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]!=0)
                    sum++;
            }
        }
        //2.sparse
        int[][] test = new int[sum+1][3];
        test[0][0]=row;
        test[0][1]=col;
        test[0][2]=sum;
        //3.storage
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]!=0){
                    count++;
                    test[count][0]=i;
                    test[count][1]=j;
                    test[count][2]=arr[i][j];
                }
            }
        }
        System.out.println("spare array");
        for (int[] ints : test) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

    }
}
