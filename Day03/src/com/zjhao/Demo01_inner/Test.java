package com.zjhao.Demo01_inner;

/**
 * Description:测试类
 * User:ZJHao
 * Date:2023-04-15
 * TIME:10:32
 */
public class Test {
    public static void main(String[] args) {
        /*
            做了两件事：
                1.相当于定义一个子类\实现类
                2.立即再创建出该子类\实现类的对象
         */
        goSwim(new Swimming() {
            @Override
            public void Swim() {
                System.out.println("李海瑞蛙泳+狗刨式");
            }
        });
    }

    public static void goSwim(Swimming swimming) {
        swimming.Swim();
    }
}
