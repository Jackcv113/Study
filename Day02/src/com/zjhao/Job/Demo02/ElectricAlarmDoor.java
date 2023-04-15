package com.zjhao.Job.Demo02;

import java.util.Scanner;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:18:53
 */
public class ElectricAlarmDoor extends Door implements Alarm {
    Scanner sc = new Scanner(System.in);

    public ElectricAlarmDoor() {
    }

    public ElectricAlarmDoor(double width, double height, String brand) {
        super(width, height, brand);
    }

    @Override
    public void open() {
        login();
        System.out.println("您成功打开了宽为" + getWidth() + "米，高为" + getHeight() + "米的" + getBrand() + "牌的电子门");
    }

    @Override
    public void close() {
        System.out.println("您成功关闭了宽为" + getWidth() + "米，高为" + getHeight() + "米的" + getBrand() + "牌的电子门");

    }

    @Override
    public void login() {
        for (int i = 2; i >= 0; i--) {
            System.out.println("请输入密码");
            if ("123".equals(sc.next())) {
                return;
            }
            System.out.println("密码错误，您当前还有" + i + "次机会");
        }
        System.out.println("报警了~~~~");
        System.exit(0);

    }
//    设计子类ElectricAlarmDoor，继承门Door，重写open、close方法，实现Alarm接口

}
