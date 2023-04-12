package com.zjhao.Demo04;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-12
 * TIME:12:13
 */
public class Test {
    public static void main(String[] args) {
        //获取对象时，永远是同一个对象
        System.out.println(AA.getInstance());
        System.out.println(AA.getInstance());

        System.out.println(BB.getInstance());
        System.out.println(BB.getInstance());
    }
}
