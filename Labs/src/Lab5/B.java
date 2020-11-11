package Lab5;

public class B extends A{
    protected String b;
    B(String b){
        super("B-AAA");
        this.b = b;
    }
    void print(){
        super.print();
        System.out.println("B " + this.b);
        x.print();
    }
}
