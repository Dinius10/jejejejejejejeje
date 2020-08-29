import java.util.List;

public class Autor {
    //ATRIBUTOS
    String nombre;
    List<Titulo> titulos;

    //metodo constructor por defecto
    public Autor(){

    }

    //sobrecarga de constructores
    public Autor(String nombre) {
        this.nombre = nombre;
    }

    //sobrecarga de constructor
    public Autor(String nombre, List<Titulo> titulos) {
        this.nombre = nombre;
        this.titulos = titulos;

    }
}
