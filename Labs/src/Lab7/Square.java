package Lab7;

public class Square extends Figure {
    double a;

    public Square(int a){
        this.a = a;
    }

    @Override
    double getArea() {
        return a * a;
    }

    @Override
    double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString(){
        return "Square{" + "a=" + a + "}";
    }
}
