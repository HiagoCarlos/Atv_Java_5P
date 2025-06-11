public class PacoteCashBack extends AssinaturaDecorator {

    public PacoteCashBack(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Pacote 5: Compra com Cash Back";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 19.99;
    }
}