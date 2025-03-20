package src.SOLID.LSP;

class QuadradoErrado extends RetanguloErrado {
    @Override
    public void setLargura(int largura) {
        this.largura = this.altura = largura;
    }
    
    @Override
    public void setAltura(int altura) {
        this.largura = this.altura = altura;
    }
}