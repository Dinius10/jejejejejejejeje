import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //INSTANCIAMOS objetos DEL TIPO Autor
        Autor joseBarrientos = new Autor("Jose Barrientos");
        Autor marioBautista = new Autor("Mario Bautista");

        //definiendo una lista de autores
        List<Autor> autores = new ArrayList<>();
        autores.add(joseBarrientos);
        autores.add(marioBautista);

        //instanciamos objetos del tipo Categoria
        Categoria java = new Categoria("Java");
        Categoria programacion = new Categoria("Programacion");

        //DEFINIMOS UNA LISTA DE CATEGORIAS
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(java);
        categorias.add(programacion);

        //INSTANCIAMOS UN OBJETO DE TIPO TITULO
        Titulo titulo = new Titulo();
        titulo.titulo = "Programacion Orientada a Objetos";
        titulo.edicion = "Segunda Edicion";
        titulo.ISBN = "ISB252569";
        titulo.autores = autores;
        titulo.categorias = categorias;

    }
}
