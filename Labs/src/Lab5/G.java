package Lab5;

public class G extends F{
    protected String g;
    G(String g){
        super("G-FFF");
        this.g = g;
    }
    void print(){
        super.print();
        System.out.println("G " + this.g);
        x.print();
    }
}
