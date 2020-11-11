package Lab5;

public class E extends D {
    protected String e;
    E(String e){
        super("E-DDD");
        this.e = e;
    }
    void print(){
        super.print();
        System.out.println("E " + this.e);
        x.print();
    }
}
