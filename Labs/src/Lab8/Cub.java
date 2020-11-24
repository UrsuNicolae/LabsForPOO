package Lab8;

public class Cub implements GemetricBody {
    double a;

    Cub(double a){
        this.a = a;
    }

    public double getSurface() {
        return 6 * a * a;
    }

    public double getVolume() {
        return a * a * a;
    }

    @Override
    public String toString(){
        return "Cub{" + "a=" + a + "}";
    }
}
