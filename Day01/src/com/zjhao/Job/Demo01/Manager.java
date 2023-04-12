package com.zjhao.Job.Demo01;

/**
 * Description:项目经理类(Manager)
 * User:ZJHao
 * Date:2023-04-12
 * TIME:19:43
 */
public class Manager extends Poper {
    //    项目经理类有一个特有属性：奖金(bonus)
    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String workNumber, String name, int age, double bonus) {
        super(workNumber, name, age);
        this.bonus = bonus;
    }

    @Override
    public void word() {
        System.out.println("工号为" + getWorkNumber() + "的项目经理" + getName() + "在和客户谈需求，项目奖金" + bonus + "但是" + getAge() + "岁还没结婚");
    }
}
