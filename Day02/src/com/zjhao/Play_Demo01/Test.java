package com.zjhao.Play_Demo01;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:10:19
 */
public class Test {
    public static void main(String[] args) {
        People pStu = new Student();
        People pTea = new Teacher();

        go(pStu);

    }

    public static void go(People p) {//父类引用接受子类对象
        p.run();//编译看左,运行看右
        if (p instanceof Student) {
            Student stu = (Student) p;
            stu.study();
        } else if (p instanceof Teacher tea) {
            tea.tech();
        } else {
            System.out.println("您的类型转换错误");
        }
    }
}
