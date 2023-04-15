package com.zjhao.Demo02_Emun;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-15
 * TIME:11:46
 */
public class Test {
    public static void main(String[] args) {
        TuiJian(Constant.GIRL);

    }
    public static void TuiJian(Constant sex){
        switch (sex){
            case BOY:
                System.out.println("我和我的性感女上司");
                break;
            case GIRL:
                System.out.println("霸道总裁爱上我");
                break;
            default:
                System.out.println("弄怂呢，这都能输错");
                break;
        }
    }
}
