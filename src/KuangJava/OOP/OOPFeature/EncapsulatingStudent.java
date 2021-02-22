package KuangJava.OOP.OOPFeature;

//类 封装的核心 私有 private
public class EncapsulatingStudent {
    //属性 名字 学号 性别
    //方法 学习() 睡觉() Student会做的一些事情

    //封装大多数时候是对于属性而言，对方法用的比较少


    //属性私有
    private String name;    //名字
    private int id;         //学号
    private int age;        //年龄
    private char gender;    //性别
    public boolean Test;    //public测试

    //get/set 提供一些可以操作属性的方法
    //提供一些public的get/set方法 get：获得属性 set：给获得的属性赋值
    //封装将属性私有化提供公共的访问方法get/set，这个get/set是自定义方法
    //重写的概念是子类覆盖父类的方法，与这个没有关系，重写的前提是要继承

    //get 获得这个数据 lbw.getName+alt enter
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }

    //set 给这个数据设置值
    //首先括号里面一定要有一个形式参数
    public void setName(String name){
        this.name = name;
    }

    //alt + insert 可以自动生成get/set方法

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //可以做一些数据的安全性检查
        if (age>100 || age<0){//不合法
            this.age = 3;
        }else {
            this.age = age;
        }
    }
}
//多用于数据库表实体类

//为了减少另一方的代码量，或者是更安全？
/*
封装的意义
1. 提高程序的安全性，保护数据
2. 隐藏代码的实现细节，作为一个调用者，不清楚类里面干了什么
3. 统一接口，所有的方法都是get/set，形成了规范
4. 提高了系统的可维护性

良好的封装便于修改内部代码，可提高程序的可维护性
 */

/*
思考：为什么println可以输出任何东西？
用到的方法的重载
 */