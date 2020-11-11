package Lab5;

public class C extends B {
    protected String c;
    C(String c){
        super("C-BBB");
        this.c = c;
    }
    void print(){
        super.print();
        System.out.println("C " + this.c);
        x.print();
    }
}
