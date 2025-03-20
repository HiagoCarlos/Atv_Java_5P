package src.SOLID.LSP;

// Princípio da Substituição de Liskov (LSP) - Exemplo de código errado
class RetanguloErrado {
    protected int largura, altura;
    
    public void setLargura(int largura) {
        this.largura = largura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea() {
        return largura * altura;
    }
}