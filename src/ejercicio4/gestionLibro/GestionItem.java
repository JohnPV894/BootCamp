package ejercicio4.gestionLibro;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Agregar libros
 *
 * Modificar libros
 *
 * Eliminar libros
 *
 * Buscar libros
 **/

public class GestionItem {
    private ArrayList<ItemBiblioteca> listaItems;
    Scanner sc = new Scanner(System.in);

    public void addArticulo(ItemBiblioteca ItemBiblioteca1){
        ArrayList<ItemBiblioteca> listArt= getListaItems();
        listArt.add(ItemBiblioteca1);
        setListaItems(listArt);
    }
    public void removeArticulo(int id){
        ArrayList<ItemBiblioteca> listArt= getListaItems();
        listArt.remove(id);

    }
    public void showDetails(){
        ArrayList<ItemBiblioteca> listArt=getListaItems();
        for (int i = 0; i < listArt.size(); i++) {
//            System.out.println(listArt.toArray()[i]);
            System.out.println(listArt.get(i));
        }
    }

    @Override
    public String toString() {
        return "GestionItem{" +
                "listaItems=" + listaItems +
                '}';
    }

    public ArrayList<ItemBiblioteca> getListaItems() {
        return listaItems;
    }

    public void setListaItems(ArrayList<ItemBiblioteca> listaItems) {
        this.listaItems = listaItems;
    }

    ////METODOS ////
    public void InterfaceGestionItems() {
//        String genero = null;
        boolean bucle = true;
        while (bucle) {

            System.out.println("\nElija opcion:\n" + "1) Agregar libro \n2) Modificar libro \n3) Eliminar libros \n4) Buscar libro \n5) Mostrar todos los libros \n6)Salir");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Introduzca los siguientes datos que se solicitan");

                        System.out.println("ISBN: ");
                    String ISBN=sc.nextLine();
                        System.out.println("Nombre del autor: ");
                    String nombreAutor=sc.nextLine();
                        System.out.println("Genero del libro: ");
                    String genero1=sc.nextLine();
                        System.out.println("Numero de paginas del libro: ");
                    int numeroPaginas=sc.nextInt();
                        System.out.println("Fecha de publicacion en formato YYYY-MM-DD: ");
                    String fechaPublicacion=sc.nextLine();
                        System.out.println("Titulo del libro: ");
                    String titulo=sc.nextLine();
                        System.out.println("Año de publicacion del libro: ");
                    int PublicacionYear=sc.nextInt();

                    //Nuevo libro ah agregar
                    Libro Libro1=new Libro(  titulo, PublicacionYear, ISBN,  nombreAutor, genero1, numeroPaginas,
                    fechaPublicacion);
                    //Agregar libro al arrayList
                    addArticulo(Libro1);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    //Los libros pueden ser buscados por título, genero o ISBN.
                    System.out.println("Como desear buscar los libros ,introduza " +
                            "'1' para buscar por titulo \n'2' para genero \n '3' para ISBN");

                    String entrada= sc.nextLine();

                    if (entrada.equals("1")){
                        System.out.println("Introduzca el titulo");
                        String entradaTitulo= sc.nextLine();

                    } else if (entrada.equals("2")) {
                        System.out.println("Introduzca el genero");
                        String entradaGenero= sc.nextLine();

                    } else if (entrada.equals("3")) {
                        System.out.println("Introduzca el ISBN");
                        String entradaISBN= sc.nextLine();

                    }else{
                        System.out.println("Su numero no coincide con ninguna opcion");
                    }
                    break;
                case 5:
                    this.showDetails();
                case 6:
                    System.out.println("Hasta luego");
                    bucle=false;
                    break;

            }
        }
    }
}
