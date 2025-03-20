package src.SOLID.OCP;

// Princípio Aberto-Fechado (OCP) - Exemplo de código errado
class CalculadoraSalario {
    public double calcularSalario(String cargo, double salarioBase) {
        if (cargo.equals("DESENVOLVEDOR")) {
            return salarioBase * 1.2;
        } else if (cargo.equals("GERENTE")) {
            return salarioBase * 1.5;
        }
        return salarioBase;
    }
}