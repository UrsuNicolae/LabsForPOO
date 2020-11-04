package Lab5;

public class H extends G{
    protected String h;

    private X x = new X("hX");

    H(){
        h = "";
    }

    H(String h) {
        this.h = h;
    }

    public void print() {
        System.out.println("Class H");
        System.out.println(this.h);
    }
}
