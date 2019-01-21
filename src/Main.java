

//import java.util.Scanner;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Четыре вектора квадрата");
        
        Vector v0 = new Vector(0, 0, 0);
        Vector v1 = new Vector(100, 0, 0);
        Vector v2 = new Vector(100, 100, 0);
        Vector v3 = new Vector(0, 100, 0);
        Vector v4 = new Vector(0, 0, 100);
        Vector v5 = new Vector(100, 0, 100);
        Vector v6 = new Vector(100, 100, 100);
        Vector v7 = new Vector(0, 100, 100);
        Color color = new Color(0, 0, 0);
        
//        Facet face = new Facet(v[0], v[1], v[2], v[3]);
//        face.printVectors();
        
        Facet f1 = new Facet(v0, v3, v2, v1, color.white);
        Facet f2 = new Facet(v5, v1, v2, v6, color.yellow);
        Facet f3 = new Facet(v6, v2, v3, v7, color.blue);
        Facet f4 = new Facet(v0, v4, v7, v3, color.yellow);
        Facet f5 = new Facet(v0, v1, v5, v4, color.green);
        Facet f6 = new Facet(v4, v5, v6, v7, color.pink);

        Cube cube = new Cube(f1, f2, f3, f4, f5, f6, color);        
        cube.rotate(0, 0, 0);
        cube.translate(-50, -50, -50);
        JFrame frame = new Drawer(cube);
        Controller ctrl = new Controller(cube, (Drawer) frame);
        
//        System.out.println("Вращение плоскости относительно x");
//        face.rotateByX(90);
//        face.printVectors();
//        
//        System.out.println("Вращение плоскости относительно y");
//        face.rotateByY(90);
//        face.printVectors();
//        
//        System.out.println("Вращение плоскости относительно z");
//        face.rotateByZ(90);
//        face.printVectors();
//        
//        System.out.println("Вращение плоскости относительно x, y, z");
//        face.rotate(90, 90, 90);
//        face.printVectors();
//        
//        System.out.println("Почти нормаль");
//        Vector normal = face.normal();
//        normal.printCoordinates();
//        
//        System.out.println("Два вектора");
//        Vector a = new Vector(0, 10 ,0);
//        Vector b = new Vector(20 ,0 ,0);
//        a.printCoordinates();
//        b.printCoordinates();
//        
//        System.out.println("Скалярное произведение векторов а и b");
//        double test = a.dot(b);
//        System.out.println(test);
//        System.out.println("");
//        
//        System.out.println("Сложение векторов");
//        Vector p = a.plus(b);
//        p.printCoordinates();
//        
//        System.out.println("Вычитаниие векторов");
//        Vector m = b.minus(a);
//        m.printCoordinates();
//        
//        System.out.println("Векторное произведение");
//        Vector c = b.cross(a);
//        c.printCoordinates();
//        
////        System.out.println("Поворот относительно х");
////        Vector rx = p.rotateByX(90);
////        rx.printCoordinates();
////        
////        System.out.println("Поворот относительно y");
////        Vector ry = p.rotateByY(90);
////        ry.printCoordinates();
////        
////        System.out.println("Поворот относительно z");
////        Vector rz = p.rotateByZ(90);
////        rz.printCoordinates();
//        
//        System.out.println("Поворот относительно x, y, z");
//        Vector r = p.rotate(90, 90, 90);
//        r.printCoordinates();

//        for(int i=0; i<1; i++){
//            System.out.println("Hello meh");
//        }
//        Vector v = new Vector(1, 1, 1);
//            while(true){
//                Scanner in = new Scanner(System.in);
//                System.out.print("\nType equation: ");
//                String str = in.nextLine();
//            }
    }
}