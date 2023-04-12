package com.zjhao.Job.Demo01;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-12
 * TIME:19:42
 */
public class Test {
    public static void main(String[] args) {
//测试类中创建程序员、项目经理对象，分别调用work方法，要求打印结果如图所示
        Manager manager = new Manager("001", "老张", 38, 20000);
        Coder coder = new Coder("9527", "小李", 26);
        coder.word();
        manager.word();
    }
}
