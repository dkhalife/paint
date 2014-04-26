/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Dany
 */
public class Triangle extends Shape {
    Polygon p;
    
    public Triangle(int startX, int startY){
        super(startX, startY);
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillPolygon(p);
    }

    @Override
    public void update(int endX, int endY, boolean ctrl) {
        p = new Polygon();
        p.addPoint((startX + endX)/2, startY);
        p.addPoint(startX, endY);
        p.addPoint(endX, endY);
    }

    @Override
    public boolean validate() {
        return true;
    }
}
