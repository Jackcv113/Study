package com.zjhao.Job.Demo01;

/**
 * Description:实现程序员类(Coder)
 * User:ZJHao
 * Date:2023-04-12
 * TIME:19:42
 */
public class Coder extends Poper{
    public Coder() {
    }

    public Coder(String workNumber, String name, int age) {
        super(workNumber, name, age);
    }

    @Override
    public void word(){
        System.out.println("工号为" + getWorkNumber() + "的程序员" + getName() + "根据需求完成代码，" + getAge() + "岁就月薪过万了");
    }
}
