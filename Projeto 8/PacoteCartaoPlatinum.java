public class PacoteCartaoPlatinum extends AssinaturaDecorator {

    public PacoteCartaoPlatinum(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Pacote 4: Cartão de crédito Platinum";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 49.99;
    }
}