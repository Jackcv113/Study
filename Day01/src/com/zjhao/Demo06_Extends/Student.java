package com.zjhao.Demo06_Extends;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-12
 * TIME:17:23
 */
public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
