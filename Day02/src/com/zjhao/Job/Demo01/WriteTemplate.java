package com.zjhao.Job.Demo01;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:18:37
 */
public abstract class WriteTemplate {
//    设计抽象类WriteTemplate，提供模板方法write，使用final修饰，防止被重写
//    模板方法中，需要让子类自己实现的地方，定义为抽象方法body，其余内容写死
    public final void write(){
        System.out.println("《我的爸爸》");
        body();
        System.out.println("啊~ 这就是我的爸爸");
    }

    protected abstract void body();
}
