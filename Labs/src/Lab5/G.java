package Lab5;

public class G extends F{
    protected String g;

    G(){
        g ="";
    }

    G(String g){
        this.g = g;
    }

    public void print() {
        System.out.println("Class G");
        System.out.println(this.g);
    }

}
