package com.zjhao.Demo01_Static;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-12
 * TIME:9:12
 */
public class User {
    //类变量，被所有对象共享
    static int count;

    public User() {
        count++;
    }
}
