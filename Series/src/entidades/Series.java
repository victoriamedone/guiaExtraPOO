package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {

    private String nombre;
    private int duración;
    private String categoría;

    ArrayList<Series> listaSeries = new ArrayList<>();

    public Series() {
        this.listaSeries = listaSeries;
    }

    public Series(String nombre, int duración, String categoría) {
        this.nombre = nombre;
        this.duración = duración;
        this.categoría = categoría;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public ArrayList<Series> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Series> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public void crearSerie (){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Series serie = new Series();

        System.out.println("Ingrese el nombre de la serie");
        nombre = input.next();
        serie.setNombre(nombre);

        System.out.println("Ingrese la categoría de la serie");
        categoría = input.next();
        serie.setCategoría(categoría);

        System.out.println("Ingrese la duración por capítulo en minutos");
        duración = input.nextInt();
        serie.setDuración(duración);

        añadirSerie(serie);
    }

    public void añadirSerie(Series serie){
        this.listaSeries.add(serie);
    }

    public void verListado(){
        for (Series i: listaSeries) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return  "\n" +
                "nombre=" + nombre + "\n" +
                "duración= " + duración + "\n" +
                "categoría= " + categoría + "\n";
    }

    public void menor15(){
        for (Series serie:listaSeries) {
            if (getDuración() <= 15){
                System.out.println("Serie con duracion menor a 15min: ");
                System.out.println(serie);
            }
        }
    }

    public void mayor40(){
        for (Series serie:listaSeries) {
            if (getDuración() >=40 ){
                System.out.println("Serie con duracion mayor a 40min: ");
                System.out.println(serie);
            }
        }
    }

    public void catComedia(){
        for (Series serie:listaSeries) {
            if (serie.getCategoría().equalsIgnoreCase("comedia") ){
                System.out.println("Series de comedia: ");
                System.out.println(serie);
            }
        }
    }

    public void catRomance(){
        for (Series serie:listaSeries) {
            if (serie.getCategoría().equalsIgnoreCase("romance") ){
                System.out.println("Series de romance: ");
                System.out.println(serie);
            }
        }
    }

    public void catDrama(){
        for (Series serie:listaSeries) {
            if (serie.getCategoría().equalsIgnoreCase("drama") ){
                System.out.println("Series de drama: ");
                System.out.println(serie);
            }
        }
    }






}
