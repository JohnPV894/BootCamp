package ejercicio4.gestionLibro;

public class ItemBiblioteca {

    static int contador=1;
//Atributos
    private int Id;
    private String titulo;
    private int PublicacionYear;

//Constructor

    public ItemBiblioteca( String titulo, int publicacionYear) {
        this.Id = contador++;
        this.titulo = titulo;
        this.PublicacionYear = publicacionYear;
    }


//Getters and Setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPublicacionYear() {
        return PublicacionYear;
    }

    public void setPublicacionYear(int publicacionYear) {
        PublicacionYear = publicacionYear;
    }

    @Override
    public String toString() {
        return
                "Id=" + Id +
                ", titulo='" + titulo + '\'' +
                ", PublicacionYear=" + PublicacionYear
                ;
    }
}
