package com.zjhao.Demo04;

import java.util.ArrayList;

/**
 * Description:接口实现类1
 * User:ZJHao
 * Date:2023-04-13
 * TIME:16:36
 */
public class StudentOp1 implements StudentOp {
    @Override
    public void printAllStudent(ArrayList<Student> list) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName()
                    + "\t性别：" + stu.getGender()
                    + "\t成绩：" + stu.getScore());
            if (stu.getGender() == '男') {
                count1++;
            } else if (stu.getGender() == '女') {
                count2++;
            }
        }
        System.out.println("男生的人数为" + count1 + "女生的人数为：" + count2);

    }

    @Override
    public void printAvgStudent(ArrayList<Student> list) {
        double sum = 0;//总成绩
        double max = list.get(0).getScore();
        double min = list.get(0).getScore();
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getScore();
            if (max > list.get(i).getScore()) {
                max = list.get(i).getScore();
            } else if (min < list.get(i).getScore()) {
                min = list.get(i).getScore();
            }
        }
        System.out.println("去掉最高分和最低分的平均分为：" + ((sum - max - min) / (list.size() - 2)));
    }
}
