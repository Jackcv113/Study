package com.zjhao.Demo03_abstract;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:12:18
 */
public class Teacher extends People{
    public String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void introduce() {
        System.out.println("我的名字叫" + getName());
        System.out.println("我是一名老师");
        System.out.println("我会讲" + getSkill());
    }
}
