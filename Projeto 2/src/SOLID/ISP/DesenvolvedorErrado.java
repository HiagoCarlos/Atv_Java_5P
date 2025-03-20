package src.SOLID.ISP;

class DesenvolvedorErrado implements TrabalhadorErrado {
    public void programar() {
        System.out.println("Programando...");
    }
    
    public void gerenciar() {
        throw new UnsupportedOperationException("Desenvolvedor não gerencia!");
    }
}