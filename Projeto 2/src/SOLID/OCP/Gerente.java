package src.SOLID.OCP;

class Gerente implements Cargo {
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.5;
    }
}
