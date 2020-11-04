package Lab5;

public class C extends B {
    protected String c;

    C(){
        c ="";
    }

    C(String c){
        this.c = c;
    }

    public void print() {
        System.out.println("Class C");
        System.out.println(this.c);
    }
}
