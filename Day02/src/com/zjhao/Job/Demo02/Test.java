package com.zjhao.Job.Demo02;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:18:36
 */
public class Test {
    public static void main(String[] args) {
//		请采用面向对象的思想，实现木门和报警门的案例，并在测试类中测试
//      测试类使用多态创建对象，调用方法查看结果
        Door door1 = new ElectricAlarmDoor();
        Door door2 = new WoodDoor();
        if (door1 instanceof ElectricAlarmDoor) {
            ElectricAlarmDoor d = (ElectricAlarmDoor) door1;
            d.setWidth(2.1);
            d.setHeight(3.2);
            d.setBrand("牛逼电子门");
        }
        if (door2 instanceof WoodDoor) {
            WoodDoor d = (WoodDoor) door2;
            d.setWidth(2.1);
            d.setHeight(3.2);
            d.setBrand("牛逼");
        }
        door1.open();
        door1.close();
        door2.open();
        door2.close();
    }
}
