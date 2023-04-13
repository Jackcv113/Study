package com.zjhao.Demo04;

import java.util.ArrayList;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:16:36
 */
public class StudentOp2 implements StudentOp{
    @Override
    public void printAllStudent(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName()
                    + "\t性别：" + stu.getGender()
                    + "\t成绩：" + stu.getScore());
        }
    }

    @Override
    public void printAvgStudent(ArrayList<Student> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getScore();
        }
        System.out.println("平均成绩为：" + (sum / list.size()));
    }
}
