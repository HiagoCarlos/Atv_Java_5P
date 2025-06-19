import java.util.List;
import java.util.NoSuchElementException;

public class IteradorBiblioteca implements Iterador<Livro> {
    private Biblioteca biblioteca;
    private int posicaoAtual = 0;
    private List<Livro> catalogo;

    public IteradorBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.catalogo = biblioteca.getCatalogoDeLivros();
    }

    @Override
    public boolean hasNext() {
        return posicaoAtual < catalogo.size();
    }

    @Override
    public Livro next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Não há mais livros no catálogo.");
        }
        Livro livro = catalogo.get(posicaoAtual);
        posicaoAtual++;
        return livro;
    }
}