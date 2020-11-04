package Lab5;

public class I extends H {
    protected String i;

    I(){
        i = "";
    }

    I(String i){
        this.i = i;
    }

    public void print() {
        System.out.println("Class I");
        System.out.println(this.i);
    }
}
