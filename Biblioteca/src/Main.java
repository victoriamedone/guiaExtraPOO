import entidades.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro();
        String fin ="";
        Scanner input = new Scanner(System.in);

        do {
            libro.crearLibro();

            System.out.println("Si quiere crear otro libro ingrese S, de lo contrario ingrese" +
                    "cualquier letra");
            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));

        libro.mayor300();
        libro.menor150();

    }
}