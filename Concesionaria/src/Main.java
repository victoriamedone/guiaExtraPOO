import entidades.Vehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String fin ="";

        do {
            vehiculo.crearVehiculo();

            System.out.println("Si quiere ingresar otro vehiculo ingrese S, de caso contrario " +
                    "ingrese cualquier letra");
            fin = input.next();

        } while (fin.equalsIgnoreCase("s"));

        vehiculo.verListado();
        vehiculo.menor3();
        vehiculo.mayor10();
    }
}