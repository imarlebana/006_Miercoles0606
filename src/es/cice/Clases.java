package es.cice;

public class Clases {

    public static void main(String[] args) {

        Cuenta c = new Cuenta();
        c.setDinero(100.5);
        System.out.println("Cuenta1 Dinero: " + c.getDinero());
        c.transferencia(50);
        System.out.println("Cuenta1 Dinero: " + c.getDinero());
        c.ingreso(1000);
        System.out.println("Cuenta1 Dinero: " + c.getDinero());

        Cuenta c2 = new Cuenta(15000);
        System.out.println("Cuenta2 Dinero: " + c2.getDinero());

        Cuenta c3 = new Cuenta(c2);
        System.out.println("Cuenta3 Dinero: " + c3.getDinero());
        c3.reintrego(600);
        System.out.println("Cuenta3 Dinero: " + c3.getDinero());



        Contador cuenta = new Contador();
        cuenta.setCuenta(1);
        Contador cuenta2 = new Contador(cuenta);
        Contador cuenta3 = new Contador(5);




    }
}
