package ejercicio4.gestionLibro;

public class Libro extends ItemBiblioteca{

//Atributos
    private String ISBN;//ID DE LIBRO
    private String nombre;
    private String genero ;
    private int numeroPaginas;
    private String fechaPublicacion;
    private boolean disponible  ;
//Constructor
    public Libro( String titulo, int publicacionYear,String ISBN, String nombre, String genero, int numeroPaginas,
                 String fechaPublicacion) {
        super( titulo, publicacionYear);
        this.ISBN=ISBN;
        this.nombre=nombre;
        this.genero=genero;
        this.numeroPaginas=numeroPaginas;
        this.fechaPublicacion=fechaPublicacion;
        this.disponible=true;
    }


//Getters and Setters

    @Override
    public String toString() {
        return
                "ISBN='" + ISBN + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", disponible=" + disponible +
                 super.toString();
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
