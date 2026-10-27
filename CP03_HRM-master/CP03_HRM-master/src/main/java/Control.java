public class Control {

    synchronized public void eperara() throws InterruptedException {
        wait();
    }
    synchronized public void perdera() throws InterruptedException {
        wait();
    }
    synchronized public void continuar(){
        notifyAll();
    }



}
