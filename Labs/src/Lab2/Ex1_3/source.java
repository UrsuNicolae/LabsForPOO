package Lab2.Ex1_3;

public class source {
    public static void main(String[] args){
        Box box = new Box();
        box.Print();

        Box box1 = new Box(2);
        box1.Print();

        Box box2 = new Box(1,2,3);
        box2.Print();
    }
}
