package Lab5;

public class M extends I{
    protected String m;

    M(){
        m = "";
    }

    M(String m){
        this.m = m;
    }

    public void print() {
        System.out.println("Class M");
        System.out.println(this.m);
    }
}
