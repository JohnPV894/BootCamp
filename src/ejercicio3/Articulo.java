package ejercicio3;

import java.util.ArrayList;

public abstract class Articulo {
    private int id;
    private String nombre;
    private float precio;
    private int cantidadStock;
    private float precioLanzamiento;


    public Articulo(int id, String nombre, float precio,int cantidadStock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock=cantidadStock;
        this.precioLanzamiento=precio;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock;

    }

    public void precioInicial(){
        set_precio(getPrecioLanzamiento());
    }

    abstract void aplicarDescuento();
    abstract void mostrarDetalles();

    public ArrayList<Articulo> sumarArticulo(){
        return null;
    }

    public String getArticleCLass(){
        String className = this.getClass().getName();
        return className.substring((className.lastIndexOf('.')+1));
    }


    public Class<? extends Articulo> getArticleCLassClass(){
        Articulo a = new Libro(1,"asdf", 1.2f, "yoyo", "qwerty123", 7);
        boolean asdf = a.equals(this);
        return this.getClass();
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public int get_id() {
        return id;
    }

    public void set_id(int _id) {
        this.id = _id;
    }

    public String get_nombre() {
        return nombre;
    }

    public void set_nombre(String _nombre) {
        this.nombre = _nombre;
    }

    public float get_precio() {
        return precio;
    }

    public void set_precio(float _precio) {
        this.precio = _precio;
    }

    public float getPrecioLanzamiento() {
        return precioLanzamiento;
    }


    public void categoria(Libro libro){
        System.out.println("libro");
    }
    public void categoria(Electronico electronico){
        System.out.println("electronico");
    }
    public void categoria(Ropa ropa){
        System.out.println("Ropa");
    }

}
