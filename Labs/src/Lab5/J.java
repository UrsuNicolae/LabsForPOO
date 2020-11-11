package Lab5;

public class J extends I {
    protected String j;
    protected X x;
    J(String j){
        super("J-III");
        this.j = j;
        this.x = new X("J's protected x");
    }
    public void print(){
        super.print();
        System.out.println("J " + this.j);
        x.print();
    }
}
