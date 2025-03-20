package src.SOLID.LSP;

class Quadrado_Correto implements Forma {
    private int lado;
    
    public Quadrado_Correto(int lado) {
        this.lado = lado;
    }
    
    public int getArea() {
        return lado * lado;
    }
}