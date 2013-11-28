/**
 * 
 */
package q4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
        CirclesListener cListener = new CirclesListener();
        addMouseListener(cListener);
        addMouseMotionListener(cListener);
        
    }
    public void paintComponent (Graphics page){
        super.paintComponent(page);
        if (circle != null)
            circle.draw(page);
    }
    
    // Represents the listener for mouse events.
    private class CirclesListener implements MouseListener, MouseMotionListener {
        // Creates a new circle at the current location whenever the
        // mouse button is pressed and repaints.
        public void mousePressed (MouseEvent event){
            circle = new Circle(event.getPoint());
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

        public void mouseDragged(MouseEvent event) {
            circle.move(event.getPoint());
            repaint();
            
        }

        public void mouseMoved(MouseEvent event) {
            // TODO Auto-generated method stub
            
        }
    }

}
