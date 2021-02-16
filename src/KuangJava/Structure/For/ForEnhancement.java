package KuangJava.Structure.For;

public class ForEnhancement {
    public static void main(String[] args) {
        int[] numbers ={10,20,30,40,50};//定义了一个数组

        for (int i = 0; i<5; i++){
            System.out.print(numbers[i]+"\t");
        }

        System.out.println("\n");

        //遍历数组的元素
        //有点像c++的范围遍历
        //number.length
        for(int x:numbers)
            System.out.print(x+"\t");
    }
}
