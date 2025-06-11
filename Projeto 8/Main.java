public class Main {

    public static void main(String[] args) {

        System.out.println("===================================================================");
        System.out.println("USUÁRIO 1: Assinatura Apenas com o serviço básico");
        System.out.println("-------------------------------------------------------------------");

        Assinatura assinaturaUsuario1 = new AssinaturaBase();
        imprimirDetalhes(assinaturaUsuario1);


        System.out.println("\n===================================================================");
        System.out.println("USUÁRIO 2: Assinatura com Frete Grátis e Caixa Surpresa");
        System.out.println("-------------------------------------------------------------------");
        
        // Começa com a base
        Assinatura assinaturaUsuario2 = new AssinaturaBase();
        // Decora com o pacote de Frete Grátis
        assinaturaUsuario2 = new PacoteFreteGratis(assinaturaUsuario2);
        // Decora novamente, agora com a Caixa Surpresa
        assinaturaUsuario2 = new PacoteCaixaSurpresa(assinaturaUsuario2);
        
        imprimirDetalhes(assinaturaUsuario2);


        System.out.println("\n===================================================================");
        System.out.println("USUÁRIO 3: Assinatura completa com todos os pacotes!");
        System.out.println("-------------------------------------------------------------------");

        Assinatura assinaturaUsuario3 = new AssinaturaBase();
        assinaturaUsuario3 = new PacoteMultiplosDispositivos(assinaturaUsuario3);
        assinaturaUsuario3 = new PacoteFreteGratis(assinaturaUsuario3);
        assinaturaUsuario3 = new PacoteCaixaSurpresa(assinaturaUsuario3);
        assinaturaUsuario3 = (Assinatura) new PacoteCartaoPlatinum(assinaturaUsuario3);
        assinaturaUsuario3 = new PacoteCashBack(assinaturaUsuario3);
        
        imprimirDetalhes(assinaturaUsuario3);
    }

    public static void imprimirDetalhes(Assinatura assinatura) {
        System.out.println("SERVIÇOS CONTRATADOS:");
        System.out.println(assinatura.getDescricao());
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("VALOR MENSAL TOTAL: R$ %.2f%n", assinatura.getPreco());
        System.out.println("===================================================================\n");
    }
}