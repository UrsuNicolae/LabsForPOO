package Lab5;

public class H extends G{
    protected String h;
    H(String h){
        super("H-GGG");
        this.h = h;
    }
    void print(){
        super.print();
        System.out.println("H " + this.h);
        x.print();
    }
}
