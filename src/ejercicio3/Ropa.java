package ejercicio3;

public class Ropa extends Articulo{

    //Atributos
    private String talla;
    private String color;

    public Ropa(int id, String nombre, float precio, String talla,String color,int cantidadStock) {
        super(id, nombre, precio,cantidadStock);
        this.talla=talla;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }

    //metodos
    @Override
    void aplicarDescuento(){
        float precio = super.get_precio();
        super.set_precio(precio-(precio*0.01f));
    };
    @Override
    void mostrarDetalles(){
        System.out.printf(toString());
    };
}
