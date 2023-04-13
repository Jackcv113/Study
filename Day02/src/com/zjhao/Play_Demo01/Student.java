package com.zjhao.Play_Demo01;

import javax.swing.*;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:10:20
 */
public class Student extends People {
    String name = "学生名称";

    @Override
    public void run() {
        System.out.println("学生跑的飞快");
    }

    public void study() {
        System.out.println("学习~");
    }
}
