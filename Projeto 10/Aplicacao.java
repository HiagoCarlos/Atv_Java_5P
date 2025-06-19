public class Aplicacao {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        
        minhaBiblioteca.adicionarLivro(new Livro("A Divina Comédia", "Dante Alighieri"));
        minhaBiblioteca.adicionarLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        minhaBiblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        minhaBiblioteca.adicionarLivro(new Livro("1984", "George Orwell"));

        
        System.out.println("--- Percorrendo o catálogo da biblioteca usando o Iterator ---");
        Iterador<Livro> iterador = minhaBiblioteca.criarIterador();

        
        while (iterador.hasNext()) {
            Livro livro = iterador.next();
            System.out.println(livro);
        }
        try {
            iterador.next();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("\nFim do catálogo. Tentativa de chamar next() novamente resultou em: " + e.getMessage());
        }
    }
}