public class Usuario implements Observador {
    private final String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeFilme, Genero genero) {
        System.out.printf(">> Notificação para %s: Novo filme de %s disponível -> %s\n",
                this.nome, genero, nomeFilme);
    }

    public String getNome() {
        return nome;
    }
}