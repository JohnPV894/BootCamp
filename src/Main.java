import ejercicio3.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GestorInventario inventario1= new GestorInventario();
        Libro libro1 = new Libro(1,"100 años de soledad",1.25f,"libro","123",20);
        Ropa ropa1 = new Ropa(2,"Camisa",1.25f,"ropa","123",20);
        Electronico electronico1= new Electronico(3,"Licuadora",1.25f,"electronico","123",20);

//Agregar articulos al inventario
      inventario1.addArticulo(libro1);
      inventario1.addArticulo(ropa1);
      inventario1.addArticulo(electronico1);


////ver la clase de un object
//        libro1.getArticleCLass();
//        ropa1.getArticleCLass();
//        electronico1.getArticleCLass();

//Ver la cantidad de articulos en inventario
        inventario1.getlengthArray();
//Buscar por genero
        inventario1.buscarGenero();
//Sobrecarga el método equals para poder comparar Artículos# Pendiente

    }
}