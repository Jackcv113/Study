package com.zjhao.Demo03_Static;

import java.util.ArrayList;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-12
 * TIME:11:18
 */
public class Student {
    static int age = 19;
    static ArrayList<String> list;
    double score;

    //静态代码块：特点：跟随类的加载而执行一次
    //作用：如果类变量值比较复杂，建议用static代码块完成初始化赋值
    static {
        System.out.println("静态代码执行了");
        list = new ArrayList<>();
        list.add("Hello Word");
        list.add("ZJHAO233");
    }

    //实例代码块：特点：每次创建对象，执行一次，优先于构造方法执行
    //作用：如果创建对象时，存在一些共性操作，将共性操作写在实例代码块中
    {
        System.out.println("实例代码块执行了");
        score = 99.9;
        System.out.println("记录日志：一个对象创建了" + this);
    }

    public Student() {
        System.out.println("无参构造器执行了");
    }

    public Student(double score) {
        System.out.println("无参构造器执行了");
        this.score = score;
    }
}
