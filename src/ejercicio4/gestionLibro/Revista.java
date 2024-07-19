package ejercicio4.gestionLibro;

public class Revista extends ItemBiblioteca{

//Atributos
    private int numero;
    private String periocidad;


//Constructor

    public Revista( String titulo, int publicacionYear,int numero,String periocidad) {
        super( titulo, publicacionYear);
        this.numero= numero;
        this.periocidad= periocidad;
    }

//Getters and Setters


    @Override
    public String toString() {
        return
                "numero=" + numero +
                ", periocidad='" + periocidad + '\'' +
                 super.toString();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
    }
}
