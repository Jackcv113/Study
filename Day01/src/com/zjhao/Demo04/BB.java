package com.zjhao.Demo04;

/**
 * Description:懒汉式
 * User:ZJHao
 * Date:2023-04-12
 * TIME:12:14
 */
public class BB {
    //2.定义类变量
    private static BB bb;

    //1.私有类的构造器
    private BB() {
    }

    //3.定义类方法,返回该对象
    public static BB getInstance() {
        if (bb == null) {
            bb = new BB();
        }
        return bb;
    }
}
