package Lab5;

public class F extends E{
    protected String f;
    F(String f){
        super("F-EEE");
        this.f = f;
    }
    void print(){
        super.print();
        System.out.println("F " + this.f);
        x.print();
    }
}
