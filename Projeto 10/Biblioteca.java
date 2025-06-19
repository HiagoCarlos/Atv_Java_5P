import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Agregado {
    private List<Livro> catalogoDeLivros;

    public Biblioteca() {
        this.catalogoDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.catalogoDeLivros.add(livro);
    }

    public List<Livro> getCatalogoDeLivros() {
        return catalogoDeLivros;
    }
    
    @Override
    public Iterador<Livro> criarIterador() {
        return new IteradorBiblioteca(this);
    }
}