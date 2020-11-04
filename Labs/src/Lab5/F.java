package Lab5;

public class F extends E{
    protected String f;

    F(){
        f = "";
    }

    F(String f){
        this.f = f;
    }

    public void print() {
        System.out.println("Class F");
        System.out.println(this.f);
    }
}
