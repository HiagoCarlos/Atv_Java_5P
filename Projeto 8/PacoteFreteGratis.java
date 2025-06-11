public class PacoteFreteGratis extends AssinaturaDecorator {

    public PacoteFreteGratis(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Pacote 2: Frete Grátis em produtos";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 9.99;
    }
}