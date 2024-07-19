package ejercicio3;

public class Electronico extends Articulo{

    //Atributos
    private String marca;
    private String modelo;

    public Electronico(int id, String nombre, float precio,String marca,String modelo ,int cantidadStock) {
        super(id, nombre, precio,cantidadStock);
        this.marca=marca;
        this.modelo=modelo;
    }


    //metodos
    @Override
    void aplicarDescuento(){
        float precio = super.get_precio();
        super.set_precio(precio-(precio*0.10f));
    };
    @Override
    void mostrarDetalles(){
        System.out.println(toString());
    };

    @Override
    public String toString() {
        return "Electronico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                "} " + super.toString();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
