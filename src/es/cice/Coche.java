package es.cice;

public class Coche {

    private String color;
    private int potencia;
    private String modelo;
    private String bastidor;
    private String marca;


    public Coche() { }



    public void arrancar(){
        System.out.println("Estoy arrancando...");
    }

    public void acelerar(){
        System.out.println("Acelerandooooo..");
    }

    public void frenar(){
        System.out.println("Estoy frenando.");
    }

    public void parar(){
        System.out.println("Apagando motor");
        System.out.println("Adios.");
    }



    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getBastidor() { return bastidor; }
    public void setBastidor(String bastidor) { this.bastidor = bastidor; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
}
