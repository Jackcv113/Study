package com.zjhao.Demo03_abstract;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:12:17
 */
public class Student extends People {
    public double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public void introduce() {
        System.out.println("我的名字叫" + getName());
        System.out.println("我是一名学生");
        System.out.println("我的分数为：" + getScore());
    }
}
