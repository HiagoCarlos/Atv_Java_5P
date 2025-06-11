public interface Assunto {
    void inscrever(Observador observador, Genero genero);
    void desinscrever(Observador observador, Genero genero);
    void notificar(Genero genero, String nomeFilme);
}