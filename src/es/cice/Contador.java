package es.cice;

public class Contador {

    private int cuenta;

    public Contador(){};
    public Contador(int incremento){ this.cuenta +=incremento; }
    public Contador(Contador c){this.cuenta = c.cuenta; }


    public void incrementar(int incremento){ this.cuenta+=incremento; }

    public void decrementar(int decrementar){ this.cuenta-=decrementar; }


    public int getCuenta() { return cuenta; }
    public void setCuenta(int cuenta) { this.cuenta = cuenta; }
}
