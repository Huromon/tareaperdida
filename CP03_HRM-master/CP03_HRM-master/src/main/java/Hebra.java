public class Hebra implements Runnable{
    private VariableCompartida c1;
    Control control;
    public Hebra(VariableCompartida i, Control c){
        this.c1 = i; this.control = c;
    }

    public VariableCompartida getVC() {
            return c1;
    }
    public void setVC(int i) {
     this.c1.establezer(i);
    }

    @Override
    public void run() {
        for(int j=0;j<100;j++){
            setVC(j);
            try {
            control.eperara();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }


        }

}
