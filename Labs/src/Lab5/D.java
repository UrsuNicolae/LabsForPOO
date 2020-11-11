package Lab5;

public class D extends C {
    protected String d;
    protected X x;
    D(String d){
        super("D-CCC");
        this.d = d;
        this.x = new X("D's X");
    }
    void print(){
        super.print();
        System.out.println("D " + this.d);
        x.print();
    }
}
