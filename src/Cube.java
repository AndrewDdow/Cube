

import java.awt.*;
import java.awt.geom.Path2D;

public class Cube {
    public Facet[] f;
    private Color color;
    
    public Cube (Facet f1, Facet f2, Facet f3, Facet f4, Facet f5, Facet f6, Color color) {
        f=new Facet[6];
        f[0] = f1;
        f[1] = f2;
        f[2] = f3;
        f[3] = f4;
        f[4] = f5;
        f[5] = f6;
        this.color = color;
    }
    public void rotate(double angleX, double angleY, double angleZ){
       f[0].rotate(angleX, angleY, angleZ);
       f[1].rotate(angleX, angleY, angleZ);
       f[2].rotate(angleX, angleY, angleZ);
       f[3].rotate(angleX, angleY, angleZ);
       f[4].rotate(angleX, angleY, angleZ);
       f[5].rotate(angleX, angleY, angleZ);
    }
    public void draw(Graphics2D g2){
        g2.setColor(color);
        f[0].draw(g2);
        f[1].draw(g2);
        f[2].draw(g2);
        f[3].draw(g2);
        f[4].draw(g2);
        f[5].draw(g2);       
    }
    
    public void translate(double x, double y, double z){
         for (int i = 0; i < 6; i++) {
             this.f[i].translate(x,y,z);
         }
         }
    public void PerspecProekcDraw(Graphics2D g2){
        g2.setColor(this.color);
        for (int i = 0; i < 6; i++) {
            if (f[i].normal().z < 0)
                f[i].draw2(g2);
        }      
    }
}
