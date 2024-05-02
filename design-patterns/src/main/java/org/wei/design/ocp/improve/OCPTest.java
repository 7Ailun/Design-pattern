package org.wei.design.ocp.improve;

/**
 * 开闭原则
 */
public class OCPTest {
    public static void main(String[] args) {
        DrawGraphicsEditor drawGraphics = new DrawGraphicsEditor();
        drawGraphics.drawShape(new Cycle());
        drawGraphics.drawShape(new Rectangle());
        drawGraphics.drawShape(new Triangle());
    }
}

/**
 * 绘制图形编辑器
 */
class DrawGraphicsEditor {

    public DrawGraphicsEditor() {
    }

    public void drawShape(Shape shape) {
        shape.draw();
    }

}

/**
 * 图形父类
 */
abstract class Shape {
    public abstract void draw();
}

class Cycle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
