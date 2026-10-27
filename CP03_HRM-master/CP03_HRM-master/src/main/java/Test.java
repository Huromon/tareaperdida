import java.util.concurrent.Callable;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        VariableCompartida c = new VariableCompartida();
        Control control = new Control();

        Hebra h1 = new Hebra(c,control);

        Hebrab h2 = new Hebrab(c,control);
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("fin");




    }
}
