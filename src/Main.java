
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cliente perez = new Cliente(111,"Perez",111,123);
        System.out.println(perez.getApellido());

        CajaAhorro cajaAhorroPerez = new CajaAhorro(1000.0, perez, 1.0);

        System.out.println(cajaAhorroPerez.getSaldo());

        cajaAhorroPerez.depositarEfectivo(500.0);
        System.out.println(cajaAhorroPerez.getSaldo());

        Boolean seEfectuo = cajaAhorroPerez.extraerEfectivo(600.0);
        if (seEfectuo) {
            System.out.println("Operación exitosa");
        } else {
            System.out.println("No tiene saldos suficiente");
        }

    }
}