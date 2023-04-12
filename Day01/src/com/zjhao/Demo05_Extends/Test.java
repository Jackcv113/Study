package com.zjhao.Demo05_Extends;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-12
 * TIME:15:53
 */
public class Test {
    public static void main(String[] args) {
        Teacher tea = new Teacher();
        tea.setName("赵松");
        tea.setSkill("会Java");
        System.out.println(tea.getName() + tea.getSkill());

        Student stu = new Student();
        stu.setName("赵佳豪");
        stu.setSubjects("学Java");
        System.out.println(stu.getName() + stu.getSubjects());
    }

}
