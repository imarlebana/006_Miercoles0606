package es.cice;

public class Cuenta {

    private double dinero;

    public Cuenta(){}
    public Cuenta(double dinero){ this.dinero = dinero; }
    public Cuenta(Cuenta cuenta){ this.dinero = cuenta.dinero; }


    public void ingreso(double ingreso){ this.dinero +=ingreso; }

    public void reintrego(double reintrego){ this.dinero -= reintrego; }

    public void transferencia(double transferencia){ this.dinero -= transferencia; }


    public double getDinero() { return dinero; }
    public void setDinero(double dinero) { this.dinero = dinero; }


}
