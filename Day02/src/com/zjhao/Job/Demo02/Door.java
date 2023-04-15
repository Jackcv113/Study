package com.zjhao.Job.Demo02;

/**
 * Description:
 * User:ZJHao
 * Date:2023-04-13
 * TIME:18:52
 */
public abstract class Door {
    //    设计抽象类Door，成员变量包含width、height、brand，抽象方法包含open、close
    private double width;//宽度
    private double height;//高度
    private String brand;//品牌

    public Door() {
    }

    public Door(double width, double height, String brand) {
        this.width = width;
        this.height = height;
        this.brand = brand;
    }

    public abstract void open();//开门

    public abstract void close();//关门

    /**
     * 获取
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Door{width = " + width + ", height = " + height + ", brand = " + brand + "}";
    }
}
