package Lab8;

public class Sphere implements GemetricBody {
    final double Pi = 3.1415926536;
    double r;

    Sphere(double r){
        this.r = r;
    }

    @Override
    public double getSurface() {
        return 4 * Pi * r * r;
    }

    @Override
    public double getVolume() {
        return (4 * Pi * r * r * r)/3 ;
    }

    @Override
    public String toString(){
        return "Sphere{" + "r=" + r + "}";
    }
}
