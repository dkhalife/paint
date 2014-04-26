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
public abstract class Shape {
    protected int startX;
    protected int startY;
    protected Color fill;
    protected Color border;
    
    public Shape(int startX, int startY){
        this.startX = startX;
        this.startY = startY;
    }
    
    public abstract void update(int endX, int endY, boolean ctrl);
    public abstract void paint(Graphics g);
    public abstract boolean validate();
}
