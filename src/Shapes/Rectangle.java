/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dany
 */
public class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle(int startX, int startY){
        super(startX, startY);
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(startX, startY, width, height);
    }

    @Override
    public void update(int endX, int endY, boolean ctrl){
        width = endX - startX;
        height = endY - startY;
    }

    @Override
    public boolean validate() {
        return Math.abs(width) > 3 && Math.abs(height) > 3;
    }
}
