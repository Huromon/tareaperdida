import java.util.logging.Logger;

public class Hebrab implements Runnable{
    private VariableCompartida c1;
    Control control;
    public Hebrab(
            VariableCompartida i
,Control control
    ){

this.control=control;
        this.c1 = i;
    }


   synchronized public VariableCompartida getVC() {
        return c1;
    }
   synchronized void mostrar(){
        System.out.println(getVC().obtener());
        control.continuar();
    }

    @Override
    public void run() {
    for(int j=0;j<100;j++){
        mostrar();


    }

    }
}
