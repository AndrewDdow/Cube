

public class Vector {
    double c = -300;
    public double x, y, z;
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector multiplyByNumber(double a) {
        return new Vector (this.x * a, this.y * a, this.z * a);
    }
    public double dot(Vector vector) {
        return vector.x * x + vector.y * y + vector.z * z;
    }
    public Vector plus(Vector vector) {
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }
    public Vector minus(Vector vector) {
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }
    public Vector cross(Vector vector) {
        return new Vector(/*x*/this.y * vector.z - this.z * vector.y , /*y*/this.z * vector.x - this.x * vector.z, /*z*/this.x * vector.y - this.y * vector.x);
    }
    public Vector rotateByX(double angle) {
        angle = angle * Math.PI / 180;
        return new Vector(this.x, this.y * Math.cos(angle) + this.z * Math.sin(angle), /*z*/-this.y * Math.sin(angle) + this.z * Math.cos(angle));
    }
    public Vector rotateByY(double angle) {
        angle = angle * Math.PI / 180;
        return new Vector(/*x*/this.x * Math.cos(angle) + this.z * Math.sin(angle), this.y , /*z*/-this.x * Math.sin(angle) + this.z * Math.cos(angle));
    }
    public Vector rotateByZ(double angle) {
        angle = angle * Math.PI / 180;
        return new Vector(/*x*/this.x * Math.cos(angle) - this.y * Math.sin(angle), /*y*/this.x * Math.sin(angle) + this.y * Math.cos(angle), this.z);
    }
    public Vector rotate(double angleX, double angleY, double angleZ) {
        Vector a = this.rotateByX(angleX);
        Vector b = a.rotateByY(angleY);
        Vector c = b.rotateByZ(angleZ);
        return c;
    }
    public void printCoordinates() {
        System.out.println(" x = " + this.x + " y = " + this.y + " z = " + this.z);
        System.out.println("");
    }
    public void translate(double x, double y, double z){
        this.x += x;
        this.y += y;
        this.z += z;
    }
//     public Vector Obor() {
//        double x2;
//        double y2;
//        x2 = c/(c-this.z) * this.x;
//        y2 = c/(c-this.z) * this.y;
//        
//        //x2 = c*this.x/this.z;
//        //y2 = c*this.y/this.z;
//        
//        Vector vect = new Vector(x2,y2,0);
//        return vect;
//    }
}