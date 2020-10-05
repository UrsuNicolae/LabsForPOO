package Lab2.Ex2_3;

public class source {
    public static void main(String[] args){
        genericQueueImplementation queue = new genericQueueImplementation( 4);
        queue.push(1);

        System.out.println(queue.state());

        queue.pop();

        System.out.println(queue.state());
    }
}
