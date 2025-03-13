import Classes.Cliente;
import Classes.Diretor;
import Classes.Examinar;
import Classes.Funcionario;
import Classes.Gerente;
import Classes.Secretario;

public class Main {
    public static void main(String[] args) {
       
        System.out.println("=== Testando a Classe Cliente ===");
        Cliente cliente = new Cliente("João", 25, "Rua A", "1234-5678", "joao@email.com");
        System.out.println("Informações iniciais do Cliente:");
        System.out.println(cliente.exibirInformacoes()); 

        
        cliente.atualizarInformacoes("João Silva", 30, "Avenida Central", "8765-4321", "joao.silva@email.com");
        System.out.println("\nInformações do Cliente após atualização:");
        System.out.println(cliente.exibirInformacoes()); 

      
        System.out.println("\n=== Testando a Classe Diretor ===");
        Diretor diretor = new Diretor("Carlos", 15000.0);
        System.out.println("Salário do Diretor: " + diretor.calcSalario());
        System.out.println("Comissão do Diretor: " + diretor.comissao());
        diretor.RealizarPedido();
        diretor.CriarDepartamento(); 
        diretor.ContratarFuncionario(); 
        System.out.println("Login do Diretor: " + diretor.Login("carlos", "senha123")); 

     
        System.out.println("\n=== Testando a Classe Gerente ===");
        Gerente gerente = new Gerente("Ana", 10000.0);
        System.out.println("Salário do Gerente: " + gerente.calcSalario());
        System.out.println("Comissão do Gerente: " + gerente.comissao());
        gerente.RealizarPedido(); 
        gerente.CriarDepartamento(); 
        gerente.ContratarFuncionario(); 
        System.out.println("Login do Gerente: " + gerente.Login("ana", "senha456"));

     
        System.out.println("\n=== Testando a Classe Secretario ===");
        Secretario secretario = new Secretario("Pedro", 5000.0);
        System.out.println("Salário do Secretário: " + secretario.calcSalario());

       
        System.out.println("\n=== Testando a Classe Examinar ===");
        Examinar examinar = new Examinar();
        examinar.RealizarPedido(); 

       
        System.out.println("\n=== Testando a Classe Funcionario ===");
        Funcionario funcionario = new Funcionario("José", 3000.0);
        System.out.println("Salário do Funcionário: " + funcionario.calcSalario());
        System.out.println("Comissão do Funcionário: " + funcionario.comissao());
    }
}