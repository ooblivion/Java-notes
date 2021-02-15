package Array;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6};
        //查找最大元素    遍历用for循环
        int max =arrays[0];
        //由于0已经用了，所以循环从1开始
        for (int i = 1; i < arrays.length; i++) {
            if(arrays[i]>max){
                max=arrays[i];
            }
        }
        System.out.println("max: "+max);
    }
}
