import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Enum para representar os níveis de cliente e a quantidade de itens por caixa
enum NivelCliente {
    BRONZE(3),
    PRATA(5),
    OURO(7),
    PLATINA(10);

    private final int quantidadeItens;

    NivelCliente(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}

// Classe para representar cada item que pode ir na caixa
class Item {
    private final String nome;
    private final double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%s (R$ %.2f)", nome, valor);
    }
}

// Classe principal da Loja de Quadrinhos que gerencia as caixas
class LojaDeQuadrinhos {

    private final List<Item> itensDisponiveis;
    private final Random random;

    public LojaDeQuadrinhos() {
        this.itensDisponiveis = new ArrayList<>();
        this.random = new Random();
        inicializarItens();
    }

    // Inicializa a lista de itens que a loja oferece
    private void inicializarItens() {
        itensDisponiveis.add(new Item("Quadrinho", 15.00));
        itensDisponiveis.add(new Item("Chaveiro", 5.00));
        itensDisponiveis.add(new Item("Busto", 10.00));
        itensDisponiveis.add(new Item("Adesivo", 1.00));
        itensDisponiveis.add(new Item("Poster", 25.00));
        itensDisponiveis.add(new Item("Camiseta", 25.00));
        itensDisponiveis.add(new Item("Caneta", 3.00));
        itensDisponiveis.add(new Item("Miniatura", 20.00));
    }

    // Gera uma caixa de assinatura com itens aleatórios baseada no nível do cliente
    public void gerarCaixaAssinatura(NivelCliente nivel) {
        List<Item> caixa = new ArrayList<>();
        int quantidadeItensNaCaixa = nivel.getQuantidadeItens();
        double valorTotal = 0.0;

        System.out.println("--- Gerando Caixa para Cliente " + nivel + " ---");
        System.out.println("Itens na sua caixa:");

        for (int i = 0; i < quantidadeItensNaCaixa; i++) {
            Item itemAleatorio = itensDisponiveis.get(random.nextInt(itensDisponiveis.size()));
            caixa.add(itemAleatorio);
            valorTotal += itemAleatorio.getValor();
            System.out.println("- " + itemAleatorio);
        }

        System.out.println("----------------------------------------");
        System.out.printf("Valor Total da Caixa: R$ %.2f%n%n", valorTotal);
    }

    public static void main(String[] args) {
        LojaDeQuadrinhos loja = new LojaDeQuadrinhos();

        // Exemplo de como gerar uma caixa para cada nível de cliente
        loja.gerarCaixaAssinatura(NivelCliente.BRONZE);
        loja.gerarCaixaAssinatura(NivelCliente.PRATA);
        loja.gerarCaixaAssinatura(NivelCliente.OURO);
        loja.gerarCaixaAssinatura(NivelCliente.PLATINA);
    }
}