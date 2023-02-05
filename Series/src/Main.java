import entidades.Series;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Series serie = new Series();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String fin = "";

        do {
            serie.crearSerie();

            System.out.println("Si quiere ingresar otra serie ingrese S, de lo contrario," +
                    "ingrese cualquier letra para ver los listados");
            fin = input.next();

        } while (fin.equalsIgnoreCase("s"));

        serie.verListado();
        serie.menor15();
        serie.mayor40();
        serie.catComedia();
        serie.catRomance();
        serie.catDrama();
    }
}