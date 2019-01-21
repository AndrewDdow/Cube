

import java.awt.Dimension;
import javax.swing.AbstractButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Drawer extends JFrame{
    static public JButton changeView;
    static JSlider headingSlider = new JSlider(0, 360, 0);;
    static JSlider pitchSlider = new JSlider(SwingConstants.VERTICAL, -360, 0, 0);;
    public JTextField textField = new JTextField();
    public JButton button;
    public Cube cube;
    double c = -300; //our view point (0,0,-200)
    
    public Drawer (Cube cube){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = this.getContentPane();
        
        pane.setLayout(new BorderLayout());

        pane.add(headingSlider, BorderLayout.SOUTH);

        pane.add(pitchSlider, BorderLayout.EAST);
        
        pane.add(textField);

        pane.setFocusable(true);


        JPanel renderPanel = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(Color.black);
                g2.fillRect(0, 0, getWidth(), getHeight());
                g2.translate(getWidth()/2, getHeight()/2);
                Setka(g);

                if (Controller.flag) {
                    g2.setPaint(Color.blue);
                    g.fillRect(-getWidth() / 2, getHeight() / 2 - 40, getWidth(), 40);
                    g2.setPaint(Color.white);
                    g2.drawString("Перспективный вид, view point "+c, -95, getHeight() / 2 - 20);
                    cube.PerspecProekcDraw(g2);
                }
                else  {
                    g2.setPaint(Color.blue);
                    g.fillRect(-getWidth() / 2, getHeight() / 2 - 40, getWidth(), 40);
                    g2.setPaint(Color.white);
                    g2.drawString("Ортогональный вид", -55, getHeight() / 2 - 20);
                    cube.draw(g2);
                }
            }
        };

        pane.add(renderPanel, BorderLayout.CENTER);


        //РљРЅРѕРїРєР° РґР»СЏ СЃРјРµРЅС‹ РІРёРґР°
        this.button = new JButton();
        button.setText("Change view");
        pane.add(button, BorderLayout.NORTH);
        this.setSize(800, 800);
        this.setVisible(true);
    }
    public void Setka(Graphics g){
        g.setColor(Color.white);
        g.drawLine(0,getHeight()/2, 0,-getHeight()/2);
        g.drawLine(getWidth()/2, 0, -getWidth()/2, 0);
        g.drawOval(-getWidth()/4, -getHeight()/4, getWidth()/2, getHeight()/2);
    }
    
}
