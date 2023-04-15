package com.zjhao.Job.Demo01;

/**
 * Description:父类
 * User:ZJHao
 * Date:2023-04-12
 * TIME:19:43
 */
public class Poper {
    //共同属性有：工号、姓名、年龄
    private String workNumber;
    private String name;
    private int age;

    public Poper() {
    }

    public Poper(String workNumber, String name, int age) {
        this.workNumber = workNumber;
        this.name = name;
        this.age = age;
    }

    //公共方法有：工作word()
    public void word() {
        System.out.println("工作");
    }

    /**
     * 获取
     * @return workNumber
     */
    public String getWorkNumber() {
        return workNumber;
    }

    /**
     * 设置
     * @param workNumber
     */
    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Poper{workNumber = " + workNumber + ", name = " + name + ", age = " + age + "}";
    }
}
