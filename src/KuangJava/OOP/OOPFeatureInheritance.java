package KuangJava.OOP;

import KuangJava.OOP.OOPFeature.InheritancePerson;
import KuangJava.OOP.OOPFeature.InheritanceTeacher;

public class OOPFeatureInheritance {
    public static void main(String[] args) {
        InheritanceTeacher inheritanceTeacher = new InheritanceTeacher();
        inheritanceTeacher.say();

        System.out.println(inheritanceTeacher.money);
        System.out.println(inheritanceTeacher.getMoney());

        InheritancePerson inheritancePerson = new InheritancePerson();
        //inheritancePerson.

        inheritancePerson.getClass();//类加载器，这个getClass就是Object里面的



        //============================
        //super
        System.out.println("===========");
        inheritanceTeacher.test1("ttt");

        System.out.println("================");
        inheritanceTeacher.test2();

        System.out.println("=====================");

        InheritanceTeacher inheritanceTeacher1 = new InheritanceTeacher();
    }

}
