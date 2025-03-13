package Classes;

import Interfaces.Fornecedor;
import Interfaces.Departamento;

public class Diretor extends Funcionario implements Fornecedor, Departamento {
    
    public Diretor(String nome, double salario) {
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