import java.util.List;

public class Categoria {
    //atributos
    String nombre;
    List<Titulo> titulos;
    Categoria supercategoria;

    //metodo constructor
    public Categoria() {

    }
    //sobrecargar de constructor
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
}
