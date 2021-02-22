package KuangJava.Array.Sparse;

public class SparseArray {
    public static void main(String[] args) {
        //稀疏数组 时间换空间
        //1. 创建一个二维素组11*11  没有棋子0    黑棋1   白棋2
        int[][] chess = new int[11][11];
        chess[1][2]=1;
        chess[2][3]=2;
        //2. 输出原始数组
        System.out.println("output original array");
        for (int[] ints : chess) {                  //chess.for
            for (int i : ints) {                    //ints.for
                System.out.print(i+"\t");
            }
            System.out.println();                   //换行
        }
        //for.each循环 遍历数组的简单写法 由于是二维数组一个for只能一层

        System.out.println("=====================================");

        //转换为稀疏数组
        //1. 获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chess[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("the number of effective value: "+sum);
        //2. 创建一个稀疏数组的数组 第一行
        int[][] spray = new int[sum+1][3];       //[row][col] row=sum+1 col=3(final)
        spray[0][0]=11;                          //存了多少行
        spray[0][1]=11;                          //存了多少列
        spray[0][2]=sum;                         //有效值个数

        //3. 遍历二维数组，将非0的值存放到稀疏数组中
        int count=0;                                        //子数组从0开始
        for (int i = 0; i < chess.length; i++) {            //一共有几行
            for (int j = 0; j < chess[i].length; j++) {     //每一行里面的长度，也就是列
                if (chess[i][j]!=0){                        //如果不为0，则记录到稀疏数组中
                    count++;                                //存了多少个数字
                    spray[count][0]=i;                      //横坐标
                    spray[count][1]=j;                      //纵坐标
                    spray[count][2]=chess[i][j];
                }
            }
        }
        //4. 输出稀疏数组
        System.out.println("out put spray array");

        for (int i = 0; i < spray.length; i++) {
            System.out.println(spray[i][0]+"\t"
                    +spray[i][1]+"\t"
                    +spray[i][2]+"\t");
        }
        System.out.println("another way to print out");
        for (int[] ints : spray) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("===============================");
        System.out.println("根据稀疏数组还原数组");
        //1. 读取稀疏数组
        int[][] reduction = new int[spray[0][0]][spray[0][1]];
        //2. 给其中元素还原
        for (int i = 1; i < spray.length; i++) {
            reduction[spray[i][0]][spray[i][1]] = spray[i][2];
        }
        //3. 打印
        for (int[] ints : reduction) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
