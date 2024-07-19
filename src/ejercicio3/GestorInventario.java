package ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorInventario {
    private ArrayList<Articulo> listaArticulos;
    Scanner sc = new Scanner(System.in);
    public GestorInventario() {
        this.listaArticulos = new ArrayList<>();
    }


    public void addArticulo(Articulo articulo){
        ArrayList<Articulo> listArt=getListaArticulos();
        listArt.add(articulo);
        setListaArticulos(listArt);
    }
    public void removeArticulo(int id){
        ArrayList<Articulo> listArt=getListaArticulos();
        listArt.remove(id);

    }
    public void showDetails(){
        ArrayList<Articulo> listArt=getListaArticulos();
        for (int i = 0; i < listArt.size(); i++) {
//            System.out.println(listArt.toArray()[i]);
            System.out.println(listArt.get(i));
        }
    }
    @Override
    public String toString() {
        return "GestorInventario{" +
                "listaArticulos=" + listaArticulos +
                '}';
    }


    public void buscarGenero() {
        String genero = null;
        boolean bucle = true;
        while (bucle) {

            System.out.println("\nElija opcion:\n" + "1 nombre \n2 genero \n3 salir");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Ingrese el nombre del articulo que desea buscar");
                    String input2= sc.nextLine();
                    for (Articulo articulo : getListaArticulos()) {
                        if (articulo.get_nombre().equalsIgnoreCase(input2)){
                            System.out.println(articulo.toString());
                        } else if (articulo.get_nombre().contains(input2)) {
                            System.out.println(articulo.toString());
                        } else {
                            System.out.println("No existe, cappisco?");
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nElija un genero\n 1 libro \n 2 Electronico \n 3 ropa");
                    int entrada = sc.nextInt();

                    if (entrada == 1) {
                        genero = "Libro";
                    } else if (entrada == 2) {
                        genero = "Electronico";
                    } else if (entrada == 3) {
                        genero = "Ropa";
                    } else {
                        System.out.println("incorrecto");
                        break;
                    }
                    for (Articulo articulo : getListaArticulos()) {
                            if (articulo.getArticleCLass().equals(genero)){
                                System.out.print(articulo.toString());
                            }

                    }

                    break;

                case 3:
                    bucle = false;
                    break;
            }
        }
    }
    public void getlengthArray(){
        System.out.println("\nEn el inventario hay:"+getListaArticulos().size()+" Articulos");
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

}
