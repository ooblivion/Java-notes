package KuangJava.Method;

public class SortingAlgorithm {
    public static void main(String[] args) {
        printMax(22,323,44,21,34.5,345.2);
        printMax(new double[]{1,2,3});
    }
    public static void printMax(double... numbers){
        if(numbers.length==0){
            System.out.println("no argument passed");
            return;
            //此处的return是方法终止
        }

        double result = numbers[0];

        //排序，也算不算排序在，只是遍历了一下数组，属于冒泡排序的一部分
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("The max value is "+ result);
    }
}
