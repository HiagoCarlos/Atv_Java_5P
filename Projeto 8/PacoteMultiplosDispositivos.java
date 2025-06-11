public class PacoteMultiplosDispositivos extends AssinaturaDecorator {

    public PacoteMultiplosDispositivos(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Pacote 1: Assistir vídeos em vários dispositivos";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 19.99;
    }
}