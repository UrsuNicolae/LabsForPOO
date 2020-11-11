package Lab5;

public class I extends H {
    protected String i;
    private X x;
    I(String i){
        super("I-HHH");
        this.i = i;
        this.x = new X("I's private X");
    }
    void print(){
        super.print();
        System.out.println("I " + this.i);
        x.print();
    }
}
