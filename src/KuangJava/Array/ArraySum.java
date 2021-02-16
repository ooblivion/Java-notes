package KuangJava.Array;

public class ArraySum {
    public static void main(String[] args) {
        int[] nums1;

        nums1 = new int[10];

        //声明和创建也可以放在一起
        int[] nums2 = new int [10];

        nums1[0] = 1;
        nums1[1] = 10;
        nums1[2] = 20;
        nums1[3] = 30;
        nums1[4] = 40;
        nums1[5] = 50;
        nums1[6] = 60;
        nums1[7] = 70;
        nums1[8] = 80;
        nums1[9] = 90;

        //计算元素所有的和

        int sum = 0;

        //获取数组的长度：arrays.length
        for (int i = 0; i < nums1.length; i++) {
            sum += nums1[i];//sum = sum + nums1[i];
        }
        System.out.println("sum = "+sum);
    }
}
