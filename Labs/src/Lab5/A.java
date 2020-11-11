package Lab5;

public class A {
    protected String a;
    protected X x;
    A(){
        this.a = "";
    }
    A(String a){
        this.a = a;
        this.x = new X("A's X");
    }
    A(String a, X x){
        this.a = a;
        this.x = x;
    }
    void print(){
        System.out.println("A " + this.a);
        x.print();
    }
}
