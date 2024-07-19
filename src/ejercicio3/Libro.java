package ejercicio3;

public class Libro extends Articulo{

    //Atributos
    private String autor;
    private String ISBN;


    public Libro(int id, String nombre, float precio,String autor,String ISBN,int cantidadStock) {
        super(id, nombre, precio,cantidadStock);
        this.autor=autor;
        this.ISBN=ISBN;
    }

    @Override
    public void aplicarDescuento(){
        //aplicar descuento %5 siempre
        float precio = super.get_precio();
        super.set_precio(precio-(precio*0.05f));
    };
    @Override
    void mostrarDetalles(){
        System.out.println(toString());
    };

    @Override
    public String toString() {
        return
                "autor='" + autor + '\'' +
                ", ISBN='" + ISBN + "\' ,"
                +super.toString();
    }
}
