package src.SOLID.DIP;

class CarroCorreto {
    private IMotor motor;
    
    public CarroCorreto(IMotor motor) {
        this.motor = motor; // Dependência injetada
    }
    
    public void ligarCarro() {
        motor.ligar();
    }
}
