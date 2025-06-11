public abstract class AssinaturaDecorator implements Assinatura {

    protected Assinatura assinaturaDecorada;

    public AssinaturaDecorator(Assinatura assinatura) {
        this.assinaturaDecorada = assinatura;
    }

    @Override
    public String getDescricao() {
        return assinaturaDecorada.getDescricao();
    }

    @Override
    public double getPreco() {
        return assinaturaDecorada.getPreco();
    }
}