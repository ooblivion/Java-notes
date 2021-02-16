package KuangJava.Structure;

public class WhileCirculation {
    public static void main(String[] args) {

        //output 1~100

        int i = 0;
        long sum = 0;
        while (i<100){
            i++;
            sum = sum + i;
            //System.out.println(i);
            //System.out.println(sum);
        }
        if (i==100){
            System.out.println(sum);
        }

    }
}

/*
while no stop
//死循环
while(true)
    //等待客户端连接
    //定时检查
    //....
 */
