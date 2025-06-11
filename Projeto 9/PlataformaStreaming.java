import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class PlataformaStreaming implements Assunto {
    // A estrutura central: um mapa que liga um Gênero a uma lista de Observadores
    private final Map<Genero, List<Observador>> inscritosPorGenero;

    public PlataformaStreaming() {
        this.inscritosPorGenero = new EnumMap<>(Genero.class);
        // Inicializa a lista para cada gênero, evitando NullPointerException
        for (Genero genero : Genero.values()) {
            this.inscritosPorGenero.put(genero, new ArrayList<>());
        }
    }

    @Override
    public void inscrever(Observador observador, Genero genero) {
        inscritosPorGenero.get(genero).add(observador);
        System.out.printf("-> %s se inscreveu para receber notificações de %s.\n",
                ((Usuario) observador).getNome(), genero);
    }

    @Override
    public void desinscrever(Observador observador, Genero genero) {
        inscritosPorGenero.get(genero).remove(observador);
         System.out.printf("-> %s cancelou a inscrição para notificações de %s.\n",
                ((Usuario) observador).getNome(), genero);
    }

    @Override
    public void notificar(Genero genero, String nomeFilme) {
        // Notifica apenas os observadores da lista daquele gênero específico
        for (Observador observador : inscritosPorGenero.get(genero)) {
            observador.atualizar(nomeFilme, genero);
        }
    }

    /**
     * Método principal para adicionar um novo título e iniciar o processo de notificação.
     */
    public void adicionarNovoFilme(String nomeFilme, Genero genero) {
        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("PLATAFORMA: Adicionando novo filme de %s: \"%s\"\n", genero, nomeFilme);
        System.out.println("--------------------------------------------------------------");
        // Ao adicionar o filme, notifica os inscritos daquele gênero
        notificar(genero, nomeFilme);
    }
}