package com.zjhao.Demo03_abstract;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:12:19
 */
public abstract class People {
    private String name;

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public final void info() {
        System.out.println("我要自我介绍了");
        introduce();
        System.out.println("我介绍完毕了");
    }

    public abstract void introduce();

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

    public String toString() {
        return "People{name = " + name + "}";
    }
}
