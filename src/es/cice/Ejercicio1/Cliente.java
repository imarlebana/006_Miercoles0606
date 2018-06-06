package es.cice.Ejercicio1;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();

        Circulo c = new Circulo(radio);
        System.out.println("El area el circulo es" + c.getArea());
        System.out.println("El area el perimetro es" + c.getPerimetro());


        Circulo2 c1 = new Circulo2(radio);
        double perimetroc1 = c1.generatePerimetro();
        double areac1 = c1.generateArea();

    }
}
