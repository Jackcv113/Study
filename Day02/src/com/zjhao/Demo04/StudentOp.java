package com.zjhao.Demo04;

import java.util.ArrayList;

/**
 * Description:接口类
 * User:ZJHao
 * Date:2023-04-13
 * TIME:16:35
 */
public interface StudentOp {
    //打印全部学生信息
    void printAllStudent(ArrayList<Student> list);

    //打印平均分
    void printAvgStudent(ArrayList<Student> list);
}
