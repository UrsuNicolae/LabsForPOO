package Lab5;

public class A {
    protected String a;

    protected  X x = new X("aX");

    A(){
        a = "";
    }

    A(String a) {
        this.a = a;
    }

    public void print() {
        System.out.println("Class A");
        System.out.println(this.a);
        System.out.println(this.x.getX());
    }
}
