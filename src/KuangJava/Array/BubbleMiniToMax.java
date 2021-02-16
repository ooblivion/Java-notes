package KuangJava.Array;

import java.util.Arrays;

public class BubbleMiniToMax {
    public static void main(String[] args) {
        int[] test = {12,43,54,23,64,23,577,345,234,11};
        wdnmd(test);
        System.out.println(Arrays.toString(test));
    }
    public static int[] wdnmd(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j+1]<arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }

            }
            if (flag == false) {
                break;
            }

        }

        return arr;
    }
}