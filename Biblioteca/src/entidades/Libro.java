package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private int nroPaginas;

    ArrayList<Libro> listaLibro = new ArrayList<>();

    public Libro() {
        this.listaLibro = listaLibro;
    }

    public Libro(String titulo, String autor, int nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public ArrayList<Libro> getListaLibro() {
        return listaLibro;
    }

    public void setListaLibro(ArrayList<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

    public void crearLibro(){
        Libro libro = new Libro();
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el titulo del libro");
        titulo = input.next();
        libro.setTitulo(titulo);

        System.out.println("Ingrese el nombre de lx autorx");
        autor = input.next();
        libro.setAutor(autor);

        System.out.println("Ingrese la cantidad de paginas");
        nroPaginas = input.nextInt();
        libro.setNroPaginas(nroPaginas);

        añadirLibro(libro);
    }

    public void añadirLibro(Libro libro){
        this.listaLibro.add(libro);
    }

    @Override
    public String toString() {
        return "Libro:" + "\n" +
                "titulo= " + titulo + "\n" +
                "autor= " + autor + "\n" +
                "numero de páginas=" + nroPaginas + "\n";
    }

    public void mayor300(){
        for (Libro i : listaLibro) {
            if (i.getNroPaginas() >= 300){
                System.out.println("Los libros con +300 paginas son: ");
                System.out.println(i);
            }
        }
    }

    public void menor150(){
        for (Libro i : listaLibro) {
            if (i.getNroPaginas() <= 150){
                System.out.println("Los libros con -150 paginas son: ");
                System.out.println(i);
            }
        }
    }

}
