
import Shapes.Shape;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 */
public class Panel extends JPanel {
    private Main w;
    
    public Panel(Main w){
        this.w = w;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Shape s : w.getShapes()){
            s.paint(g);
        }

        Shape s = w.getCurrentShape();
        if(s != null)
            s.paint(g);
    }
}
