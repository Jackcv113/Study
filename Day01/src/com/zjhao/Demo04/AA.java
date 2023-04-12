package com.zjhao.Demo04;

/**
 * Description:饿汉式：拿对象时，对象已经创建好了
 * User:ZJHao
 * Date:2023-04-12
 * TIME:12:14
 */
public class AA {
    //2.定义类变量
    private static AA aa = new AA();

    //1.私有类的构造器
    private AA() {

    }

    //3.定义类方法,返回该对象
    public static AA getInstance() {
        return aa;
    }
}
