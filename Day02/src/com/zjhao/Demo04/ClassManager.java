package com.zjhao.Demo04;

import java.util.ArrayList;

/**
 * Description:操作类
 * User:ZJHao
 * Date:2023-04-13
 * TIME:16:35
 */
public class ClassManager {
    private static ArrayList<Student> list;
    private StudentOp so = new StudentOp1();//接口多态

    static {
        list = new ArrayList<>();
        list.add(new Student("坤坤1", '女', 56));
        list.add(new Student("坤坤2", '男', 56));
        list.add(new Student("坤坤3", '男', 78));
        list.add(new Student("坤坤4", '女', 26));
        list.add(new Student("坤坤5", '女', 34));
    }

    public void printAllStudent() {
        so.printAllStudent(list);
    }

    public void printAvgStudent() {
        so.printAvgStudent(list);
    }
}
