package Structure.For;

public class ForQue2 {
    public static void main(String[] args) {
        //用while或for循环输出1~1000之间能被5整除的数，并且每行输出三个
        int sum = 0;

        for(int i=1; i<=1000; i++){         //能被5整除的数
            if(i%5==0){
                System.out.print(i+"\t");   //table 换行转义符
            }
            if(i%(5*3)==0){                 //并且每行输出三个
                System.out.print("\n");
            }
        }
    }
}
/*
print和println的区别
println 输出完会换行
print   输出完不会换行
 */

