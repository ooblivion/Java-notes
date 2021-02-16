package KuangJava.Structure;

public class SwitchString {
    public static void main(String[] args) {
        String name = "爷";
        //JDK7新特性，表达式结果可以是字符串
        //字符串本质还是数据

        //反编译 java -- class(字节码文件) -- 反编译(IDEA)

        //通过hashCode()生成一个特定的值
        //哈希是通过特点算法给每一个东西一个唯一的值

        switch (name){
            case "爷":
                System.out.println("👴");
                break;
            default:
                System.out.println("gck");
        }
    }
}
/*
public class SwitchString {
    public SwitchString() {
    }

    public static void main(String[] args) {
        String name = "爷";
        byte var3 = -1;
        switch(name.hashCode()) {
        case 29239:
            if (name.equals("爷")) {
                var3 = 0;
            }
        default:
            switch(var3) {
            case 0:
                System.out.println("\ud83d\udc74");
                break;
            default:
                System.out.println("gck");
            }

        }
    }
}
 */