package es.cice.Ejercicio1;

public class Circulo {

    private double radio;
    private double perimetro;
    private double area;


    public Circulo(double radio) {
        this.radio = radio;
        this.area = 3.14*radio*radio;
        this.perimetro = 3.14*radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    public double getPerimetro() { return perimetro; }
    public void setPerimetro(double perimetro) { this.perimetro = perimetro; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }
}
