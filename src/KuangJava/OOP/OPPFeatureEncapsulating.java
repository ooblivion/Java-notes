package KuangJava.OOP;

import KuangJava.OOP.OOPFeature.EncapsulatingStudent;

public class OPPFeatureEncapsulating {
    public static void main(String[] args) {
        EncapsulatingStudent lbw = new EncapsulatingStudent();
        //lbw.name;                        //由于name是封装私有的，所以不能操作
        boolean flag = lbw.Test;           //这个是public所以可以调用

        //get 获得这个数据 lbw.getName+alt enter
        String lbwName = lbw.getName();
        int lbwId = lbw.getId();

        //set 给这个数据设置值
        lbw.setName("lbw");

        //没有直接操作属性name，通过外部的方法进行操作，set设置，get获取
        //这种做法可以方便修改bug，不仅仅是权限，还关乎接口，更安全，尤其是对开发方面
        System.out.println(lbw.getName());

        lbw.setAge(70);
        System.out.println(lbw.getAge());
    }
}
