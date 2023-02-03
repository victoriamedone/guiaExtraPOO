package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Mascota {

    private String nombre;
    private String raza;
    private int edad;

    ArrayList<Mascota> listaMascotas = new ArrayList<>();

    public Mascota() {
        this.listaMascotas = listaMascotas;
    }

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public void crearMascota(){
        Mascota mascota = new Mascota();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tipo de animal por favor");
        raza = input.next();
        mascota.setRaza(raza);

        System.out.println("Ingrese el nombre");
        nombre = input.next();
        mascota.setNombre(nombre);

        System.out.println("Ingrese la edad");
        edad = input.nextInt();
        mascota.setEdad(edad);

        añadirMascota(mascota);
    }

    public void añadirMascota(Mascota mascota){
        this.listaMascotas.add(mascota);
    }

    public void verListado(){
        for (Mascota mascota: listaMascotas) {
            System.out.println(mascota);
        }
    }



    public void mayores6(){
        for (Mascota i : listaMascotas){
            if (i.getEdad() >= 6){
                System.out.println("Los animales ingresados con +6 años son:");
                System.out.println(i);
            }
        }
    }

    public void menores5(){
        for (Mascota i : listaMascotas){
            if (i.getEdad() <= 5){
                System.out.println("Los animales ingresados con -5 años son:");
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Mascota:" + "\n" +
                "nombre= " + nombre + "\n" +
                "raza= " + raza + "\n" +
                "edad= " + edad + "\n" ;
    }


}
