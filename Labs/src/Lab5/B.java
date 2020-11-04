package Lab5;

public class B extends A{
    protected String b;

    B(){
        b= "";
    }

    B(String b){
        this.b = b;
    }

    public void print() {
        System.out.println("Class B");
        System.out.println(this.b);
    }
}
