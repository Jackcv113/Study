package com.zjhao.Demo02_Final;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:11:15
 */
public class Test {

    public static void main(String[] args) {
        //用到了大量字符串
        /*
            好处：
                1.阅读性高、可维护性高
                2.可以被宏替换，将常量编译成字面量，不会影响程序性能
         */

        System.out.println(Final.SCHOOL_NAME);
        System.out.println(Final.SCHOOL_NAME);
        System.out.println(Final.SCHOOL_NAME);
        System.out.println(Final.DI_ZHI);
        System.out.println(Final.DI_ZHI);
        System.out.println(Final.DI_ZHI);
    }
}
