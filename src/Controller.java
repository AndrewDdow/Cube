
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Controller {
    Cube cube;
    Drawer frame;
    public JSlider pitchSlider;
    public JSlider headingSlider;
    public JButton button;
    static Boolean flag = false;

    public Controller(Cube cube, Drawer frame){

        this.cube = cube;
        this.frame = frame;
        this.pitchSlider = frame.pitchSlider;
        this.headingSlider = frame.headingSlider;
        this.button = frame.button;



        pitchSlider.addChangeListener(new ChangeListener(){
            public void stateChanged (ChangeEvent e){
                int step = pitchSlider.getValue();
                step -=360;
                cube.rotate(step/360, 0, 0);
                frame.repaint();
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag == false) {
                    flag = true;
                }
                else{
                    flag = false;
                }
                frame.repaint();
            }
        });


        headingSlider.addChangeListener(new ChangeListener(){
            public void stateChanged (ChangeEvent e){
                int step = headingSlider.getValue();
                step +=360;
                cube.rotate(0, step/360, 0);
                frame.repaint();
            }
        });
        
    }
}
