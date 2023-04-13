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
        Door door = new ElectricAlarmDoor();
        if (door instanceof ElectricAlarmDoor) {
            ElectricAlarmDoor d = (ElectricAlarmDoor) door;
            d.setWidth(2.1);
            d.setHeight(3.2);
            d.setBrand("牛逼");
        } else if (door instanceof WoodDoor) {
            WoodDoor d = (WoodDoor) door;
            d.setWidth(2.1);
            d.setHeight(3.2);
            d.setBrand("牛逼");
        }
        door.open();
        door.close();
    }
}
