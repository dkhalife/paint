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
public class Ellipse extends Shape {
    int endX;
    int endY;
    int width;
    int height;
    
    public Ellipse(int startX, int startY){
        super(startX, startY);
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        
        g.fillOval(Math.min(startX, endX), Math.min(startY, endY), width, height);
    }

    @Override
    public void update(int endX, int endY, boolean ctrl){
        this.endX = endX;
        this.endY = endY;
        
        width = Math.abs(endX - startX);
        height = Math.abs(endY - startY);
    }

    @Override
    public boolean validate() {
        return Math.abs(width) > 3 && Math.abs(height) > 3;
    }
}
