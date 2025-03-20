package src.SOLID.DIP;

class CarroErrado {
    private Motor motor;
    
    public CarroErrado() {
        this.motor = new Motor(); // Dependência concreta
    }
    
    public void ligarCarro() {
        motor.ligar();
    }
}