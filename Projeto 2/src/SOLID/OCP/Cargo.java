package src.SOLID.OCP;

// Viola OCP pois precisa ser modificada toda vez que um novo cargo for adicionado.

// Código corrigido conforme OCP
interface Cargo {
    double calcularSalario(double salarioBase);
}