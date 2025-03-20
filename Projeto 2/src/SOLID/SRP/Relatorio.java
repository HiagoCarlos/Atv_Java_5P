
// Princípio da Responsabilidade Única (SRP) - Exemplo de código errado
class Relatorio {
    public void gerarRelatorio() {
        System.out.println("Gerando relatório...");
    }
    
    public void salvarNoBanco() {
        System.out.println("Salvando relatório no banco de dados...");
    }
}