package Classes;

public class Secretario extends Funcionario {
   
    public Secretario(String nome, double salario) {
        super(nome, salario);
    }

   
    @Override
    public double calcSalario() {
        return getSalario();
    }
}