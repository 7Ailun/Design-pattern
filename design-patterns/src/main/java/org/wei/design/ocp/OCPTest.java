package org.wei.design.ocp;

/**
 * 问题案例
 */
public class OCPTest {
    public static void main(String[] args) {
        DrawGraphicsEditor drawGraphics = new DrawGraphicsEditor();
        drawGraphics.drawShape(new Cycle());
        drawGraphics.drawShape(new Rectangle());
    }
}

/**
 * 绘制图形编辑器
 */
class DrawGraphicsEditor {

    public DrawGraphicsEditor() {
    }

    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawCycle();
        } else if (shape.m_type == 2) {
            drawRectangle();
        }
    }

    public void drawCycle() {
        System.out.println("绘制圆形");
    }

    public void drawRectangle() {
        System.out.println("绘制矩形");
    }


}

/**
 * 图形父类
 */
class Shape {
    public int m_type;

    public Shape(int type) {
        m_type = type;
    }
}

class Cycle extends Shape {
    public Cycle() {
        super(1);
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        super(2);
    }
}
