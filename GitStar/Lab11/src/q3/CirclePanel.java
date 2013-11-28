/**
 * 
 */
package q3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * @author Justin
 *
 */
public class CirclePanel extends JPanel{
    private final int WIDTH = 600, HEIGHT = 400;
    private Circle circle;
    /**
     * @param args
     */
    public CirclePanel() {
        addMouseListener (new CirclesListener());
        setPreferredSize (new Dimension(WIDTH, HEIGHT));
    }
    public void paintComponent (Graphics page){
        super.paintComponent(page);
        if (circle != null)
            circle.draw(page);
    }
    
    // Represents the listener for mouse events.
    private class CirclesListener implements MouseListener{
        // Creates a new circle at the current location whenever the
        // mouse button is pressed and repaints.
        public void mousePressed (MouseEvent event){
            if (circle == null){
                circle = new Circle(event.getPoint());
            } else if (circle.isInside(event.getPoint())){
                circle = null;
            } else {
                circle.move(event.getPoint());
            }
            repaint();
        }
        
        // Provide empty definitions for unused event methods.
        public void mouseClicked (MouseEvent event){}
        public void mouseReleased (MouseEvent event){}
        public void mouseEntered (MouseEvent event){
            setBackground(Color.white);
        }
        public void mouseExited (MouseEvent event){
            setBackground(Color.blue);
        }
    }

}
