package com.zjhao.Demo01_Play;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:10:20
 */
public class Teacher extends People {
    String name = "老师名称";

    @Override
    public void run() {
        System.out.println("老师跑的很慢");
    }

    public void tech() {
        System.out.println("讲课~");
    }
}