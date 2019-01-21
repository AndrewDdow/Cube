
import java.awt.*;
import java.awt.geom.*;

public class Facet {
    public Vector[] v;
    public Color color;
    double c = -450;
    public Facet(Vector v1, Vector v2, Vector v3, Vector v4, Color color) {
        v = new Vector[4];
        v[0] = v1;
        v[1] = v2;
        v[2] = v3;
        v[3] = v4;
        this.color = color;
    }
    public Facet(Vector v1, Vector v2, Vector v3, Vector v4) {
        v = new Vector[4];
        v[0] = v1;
        v[1] = v2;
        v[2] = v3;
        v[3] = v4;
        this.color = color.red;
    }
    public Vector normal(){
        Vector a = new Vector(v[1].x - v[0].x, v[1].y - v[0].y, v[1].z - v[0].z);
        Vector b = new Vector(v[2].x - v[1].x, v[2].y - v[1].y, v[2].z - v[1].z);
        return a.cross(b);
    }
    public void rotateByX(double angle){
        v[0] = v[0].rotateByX(angle);
        v[1] = v[1].rotateByX(angle);
        v[2] = v[2].rotateByX(angle);
        v[3] = v[3].rotateByX(angle);
    }
    public void rotateByY(double angle){
        v[0] = v[0].rotateByY(angle);
        v[1] = v[1].rotateByY(angle);
        v[2] = v[2].rotateByY(angle);
        v[3] = v[3].rotateByY(angle);
    }
    public void rotateByZ(double angle){
        v[0] = v[0].rotateByZ(angle);
        v[1] = v[1].rotateByZ(angle);
        v[2] = v[2].rotateByZ(angle);
        v[3] = v[3].rotateByZ(angle);
    }
    public Facet rotate(double angleX, double angleY, double angleZ){
        v[0] = v[0].rotate(angleX, angleY, angleZ);
        v[1] = v[1].rotate(angleX, angleY, angleZ);
        v[2] = v[2].rotate(angleX, angleY, angleZ);
        v[3] = v[3].rotate(angleX, angleY, angleZ);
        Facet facet = new Facet(v[0], v[1], v[2], v[3]);
        return facet;
    }
    public void printVectors() {
        for (int i = 0; i < 4; i++) {
            v[i].printCoordinates();
        }
        System.out.println("");
    }
    public void draw(Graphics2D g2){
        g2.setColor(color);
        if(this.normal().z < 0){
        Path2D path = new Path2D.Double();
        
        
        path.moveTo(v[0].x, -v[0].y);
        path.lineTo(v[1].x, -v[1].y);
        path.lineTo(v[2].x, -v[2].y);
        path.lineTo(v[3].x, -v[3].y);
        path.closePath();
        g2.draw(path);
        g2.fill(path);
        
        
       }
    }
    public void draw2(Graphics2D g2){
         g2.setColor(this.color);
            Path2D path = new Path2D.Double();
            path.moveTo(v[0].x*c/(c-v[0].z), -v[0].y*c/(c-v[0].z));
            path.lineTo(v[1].x*c/(c-v[1].z), -v[1].y*c/(c-v[1].z));
            path.lineTo(v[2].x*c/(c-v[2].z), -v[2].y*c/(c-v[2].z));
            path.lineTo(v[3].x*c/(c-v[3].z), -v[3].y*c/(c-v[3].z));
            path.closePath();
            g2.fill(path);
    }
    public void translate(double x, double y, double z){
         for (int i = 0; i < 4; i++) {
             this.v[i].translate(x,y,z);
         }
         }
    
}