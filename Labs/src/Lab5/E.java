package Lab5;

public class E extends D {
    protected String e;

    E(){
        e ="";
    }

    E(String e){
        this.e = e;
    }

    public void print() {
        System.out.println("Class E");
        System.out.println(this.e);
    }
}
