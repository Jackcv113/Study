package com.zjhao.Demo03_Static;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-12
 * TIME:11:18
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(99);
        System.out.println(stu1.score);
        System.out.println(stu2.score);
    }
}
