package com.zjhao.Demo03_abstract;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:12:17
 */
public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        Teacher tea = new Teacher();
        stu.setName("赵员外");
        stu.setScore(100);
        tea.setName("赵老师");
        tea.setSkill("Java");
        stu.info();
        System.out.println("=======================");
        tea.info();
    }
}
