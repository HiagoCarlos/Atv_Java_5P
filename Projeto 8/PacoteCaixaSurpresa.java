public class PacoteCaixaSurpresa extends AssinaturaDecorator {

    public PacoteCaixaSurpresa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Pacote 3: Caixa surpresa com produtos de filmes e séries";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 29.99;
    }
}