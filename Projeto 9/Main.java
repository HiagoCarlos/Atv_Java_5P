public class Main {
    public static void main(String[] args) {

        PlataformaStreaming netflix = new PlataformaStreaming();

   
        Usuario ana = new Usuario("Ana");
        Usuario bruno = new Usuario("Bruno");
        Usuario carla = new Usuario("Carla");
        Usuario davi = new Usuario("Davi");
        Usuario elisa = new Usuario("Elisa");

        System.out.println("### FASE DE INSCRIÇÕES ###");
        netflix.inscrever(ana, Genero.FICCAO_CIENTIFICA);
        netflix.inscrever(ana, Genero.ANIME);
        netflix.inscrever(bruno, Genero.ACAO);
        netflix.inscrever(carla, Genero.TERROR);
        netflix.inscrever(davi, Genero.FICCAO_CIENTIFICA);
        netflix.inscrever(davi, Genero.ACAO);
        netflix.inscrever(elisa, Genero.COMEDIA);
        netflix.inscrever(elisa, Genero.ANIME);

        netflix.adicionarNovoFilme("Blade Runner 2049", Genero.FICCAO_CIENTIFICA);
      

        netflix.adicionarNovoFilme("Hereditário", Genero.TERROR);
        

        netflix.adicionarNovoFilme("Demon Slayer: Mugen Train", Genero.ANIME);
       

        
        System.out.println("\n### FASE DE CANCELAMENTO ###");
        netflix.desinscrever(ana, Genero.FICCAO_CIENTIFICA);

        
         netflix.adicionarNovoFilme("Interestelar", Genero.FICCAO_CIENTIFICA);
       
    }
} 