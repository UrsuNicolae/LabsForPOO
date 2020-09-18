import java.awt.*;

public class source {
    public static boolean Compare(monitor a, monitor b)
    {
        return a == b;
    }

    public static void main(String[] args){
        monitor A = new monitor();
        A.color = Color.black;
        A.dimension = "1024*720";
        A.resolution = "HD";

        monitor B = new monitor();
        B.color = Color.RED;
        A.dimension = "2048*1024";
        A.resolution = "4K";

        if(!Compare(A, B)) System.out.println("Monitors differ");
        else System.out.println("Monitors are equal");
    }
}
