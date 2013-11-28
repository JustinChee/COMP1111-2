/**
 * 
 */
package q2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * @author Justin
 *
 */
public class ColorOptionsPanel extends JPanel {
    
    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private Color[] color = new Color[NUM_COLORS];
    private JLabel heading;
    
    private JRadioButton[] colorButton = new JRadioButton[NUM_COLORS];
    
    public ColorOptionsPanel(){
        // Set up heading and colors
        heading = new JLabel ("Choose the background color!");
        heading.setFont (new Font("Helvetica", Font.BOLD, FONT_SIZE));
        
        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;
        

        colorButton[0] = new JRadioButton("Yellow", true);
        colorButton[1] = new JRadioButton("Cyan", false);
        colorButton[2] = new JRadioButton("Red", false);
        colorButton[3] = new JRadioButton("Green", false);
        colorButton[4] = new JRadioButton("Magenta", false);
        
        // Instantiate a Button Group object and a ColorListener object
        ButtonGroup bGroup = new ButtonGroup();
        ColorListener cListener = new ColorListener();
        
        // Set up the panel
        add (heading);
        setBackground(Color.yellow);
        setPreferredSize (new Dimension (WIDTH, HEIGHT));
        
        //Group the radio buttons, add a ColorListener to each,
        for (JRadioButton i : colorButton){
            i.addActionListener(cListener);
            bGroup.add(i);
            i.setBackground(Color.white);
            add(i);
        }
        
        /*
        colorButton[0].addActionListener(cListener);
        colorButton[1].addActionListener(cListener);
        colorButton[2].addActionListener(cListener);
        colorButton[3].addActionListener(cListener);
        colorButton[4].addActionListener(cListener);
        
        bGroup.add(colorButton[0]);
        bGroup.add(colorButton[1]);
        bGroup.add(colorButton[2]);
        bGroup.add(colorButton[3]);
        bGroup.add(colorButton[4]);
        */
        
        // set the background color of each and add each to the panel.
        
    }
    
    // Represents the listener for the radio buttons.
    private class ColorListener implements ActionListener{
        // Updates the background color of the panel based on
        // which radio button is selected.
        public void actionPerformed (ActionEvent event){
            for (int i = 0; i < colorButton.length; i++){
                if (colorButton[i].isSelected()){
                    setBackground(color[i]);
                }
            }
        }
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
