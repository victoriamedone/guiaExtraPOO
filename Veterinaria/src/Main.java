import entidades.Mascota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Mascota mascota = new Mascota();
        Scanner input = new Scanner(System.in);
        String fin = "";

        do {
            mascota.crearMascota();

            System.out.println("Si desea ingresar otro animal presione S, de lo contrario," +
                    " cualquier tecla para salir");
            fin = input.next();

        } while (fin.equalsIgnoreCase("s"));

        mascota.verListado();
        mascota.mayores6();
        mascota.menores5();
    }
}