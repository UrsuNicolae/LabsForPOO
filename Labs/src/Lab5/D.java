package Lab5;

public class D extends C {
    protected String d;

    public X x = new X("dx");

    D(){
        d ="";
    }

    D(String d){
        this.d = d;
    }

    public void print() {
        System.out.println("Class D");
        System.out.println(this.d);
    }
}
