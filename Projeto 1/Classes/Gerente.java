package Classes;

import Interfaces.Fornecedor;
import Interfaces.Departamento;

public class Gerente extends Funcionario implements Fornecedor, Departamento {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    
    @Override
    public void RealizarPedido() {
 
    }

    @Override
    public void CriarDepartamento() {
        
    }

    @Override
    public void ContratarFuncionario() {
      
    }

   
    public boolean Login(String usuario, String senha) {
        
        return true; 
    }
}