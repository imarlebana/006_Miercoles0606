package es.cice.Ejercicio1;

public class Circulo2 {

    private double radio;

    public Circulo2(double radio) {
        this.radio = radio;
    }

    public double generateArea(){ return radio*radio*3.14; }

    public double generatePerimetro(){ return radio*3.14; }


    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }
}
