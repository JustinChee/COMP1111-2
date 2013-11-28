/**
 * 
 */
package q2;

import javax.swing.JFrame;

/**
 * @author Justin
 *
 */
public class ColorOptions {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame colorFrame = new JFrame ("Color Options");
        colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorOptionsPanel panel = new ColorOptionsPanel();
        colorFrame.getContentPane().add(panel);
        
        colorFrame.pack();
        colorFrame.setVisible(true);

    }

}
