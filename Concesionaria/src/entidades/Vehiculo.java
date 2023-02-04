package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo {

    private String marca;
    private int stock;

    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    public Vehiculo() {
        this.listaVehiculos = listaVehiculos;
    }

    public Vehiculo(String marca, int stock) {
        this.marca = marca;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void crearVehiculo(){
        Vehiculo vehiculo = new Vehiculo();
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la marca");
        marca = input.next();
        vehiculo.setMarca(marca);

        System.out.println("Ingrese el stock disponible");
        stock = input.nextInt();
        vehiculo.setStock(stock);

        añadirVehiculo(vehiculo);
    }

    public void añadirVehiculo(Vehiculo vehiculo){
        this.listaVehiculos.add(vehiculo);
    }

    public void verListado(){
        for (Vehiculo vehiculo: listaVehiculos) {
            System.out.println(vehiculo);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo:" + "\n" +
                "marca= " + marca + "\n" +
                "stock=" + stock + "\n" ;
    }

    public void menor3(){
        for (Vehiculo i : listaVehiculos){
            if (i.getStock() <= 3){
                System.out.println("Los vehiculos con menos de 3 unidades en stock son: ");
                System.out.println(i);
            }
        }
    }

    public void mayor10(){
        for (Vehiculo i : listaVehiculos){
            if (i.getStock() >= 10){
                System.out.println("Los vehiculos con mas de 10 unidades en stock son: ");
                System.out.println(i);
            }
        }
    }
}
