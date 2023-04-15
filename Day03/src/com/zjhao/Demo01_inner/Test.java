package com.zjhao.Demo01_inner;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-15
 * TIME:10:32
 */
public class Test {
    public static void main(String[] args) {
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
