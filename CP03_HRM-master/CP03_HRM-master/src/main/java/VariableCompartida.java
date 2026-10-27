public class VariableCompartida {
    private int i=0;
    VariableCompartida(){
        this.i=0;
    }

   synchronized public int obtener(){
        return i;
    }
 synchronized    public void establezer(int i){
        this.i=i;
    }
  synchronized   public void incrementar(){
        i++;
    }
}
