package src.SOLID.OCP;

class Desenvolvedor implements Cargo {
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.2;
    }
}