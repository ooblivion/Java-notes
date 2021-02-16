package KuangJava.Operator;

public class TernaryOperator {
    public static void main(String[] args) {
        //x ? y : z
        //爷 ? 成功人 : 失败废物
        //有点像简化的if，有点偷懒
        //流程控制还是用if比较好

        int score = 30;
        String type = score < 60 ? "你挂科了" : "过了";
        //String type 是定义变量
        System.out.println(type);
    }
}
