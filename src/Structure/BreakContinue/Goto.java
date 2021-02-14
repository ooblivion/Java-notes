package Structure.BreakContinue;

public class Goto {
    public static void main(String[] args) {
        //打印101~150之间的所以质数

        //指数就是找不到可以除的数的数

        //一个数如果不能以它本身的一半以内的数乘上另一个数得到，那么它就是质数

        int count = 0;

        outer: for(int i=101; i<=150; i++){
            for (int j = 2; j<i/2; j++){        //一个合格的因数，除了它本身外可能有最大的因数是它的1/2，所以j<i/2
                if (i % j ==0){
                    continue outer;
                }
            }
            System.out.print(i+"\t");
        }
    }
}
