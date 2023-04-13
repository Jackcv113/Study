package com.zjhao.Job.Demo02;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:18:52
 */
public class WoodDoor extends Door {
//    设计子类WoodDoor，继承Door，重写open、close方法


    public WoodDoor() {
    }

    public WoodDoor(double width, double height, String brand) {
        super(width, height, brand);
    }

    @Override
    public void open() {
        System.out.println("您成功打开了宽为" + getWidth() + "米，高为" + getHeight() +"米的"+ getBrand() + "牌门");
    }

    @Override
    public void close() {
        System.out.println("您成功关闭了宽为" + getWidth() + "米，高为" + getHeight() +"米的"+ getBrand() + "牌门");
    }

}
