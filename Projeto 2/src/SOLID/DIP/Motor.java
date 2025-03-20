package src.SOLID.DIP;

// Princípio da Inversão de Dependência (DIP) - Exemplo de código errado
class Motor {
    public void ligar() {
        System.out.println("Motor ligado!");
    }
}

class CarroErrado {
    private Motor motor;
    
    public CarroErrado() {
        this.motor = new Motor(); // Dependência concreta
    }
    
    public void ligarCarro() {
        motor.ligar();
    }
}

// Viola DIP pois depende diretamente da implementação concreta de Motor.

// Código corrigido conforme DIP
interface IMotor {
    void ligar();
}

class MotorCorreto implements IMotor {
    public void ligar() {
        System.out.println("Motor ligado!");
    }
}

class CarroCorreto {
    private IMotor motor;
    
    public CarroCorreto(IMotor motor) {
        this.motor = motor; // Dependência injetada
    }
    
    public void ligarCarro() {
        motor.ligar();
    }
}
