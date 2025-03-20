package src.SOLID.LSP;

// Viola LSP pois Quadrado não se comporta como um Retângulo esperado.

// Código corrigido conforme LSP
class Retangulo_Correto implements Forma {
    protected int largura, altura;
    
    public Retangulo_Correto(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public int getArea() {
        return largura * altura;
    }
}