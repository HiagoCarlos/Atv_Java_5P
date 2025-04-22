import java.util.Scanner;
import model.LoginSystem;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginSystem sistema = LoginSystem.getInstance();

        System.out.println("=== SISTEMA DE CADASTRO E LOGIN ===");
        
        // Cadastro de usuário
        System.out.println("\n[CADASTRO]");
        System.out.print("Digite um nome de usuário: ");
        String novoUsuario = scanner.nextLine();
        
        System.out.print("Digite uma senha: ");
        String novaSenha = scanner.nextLine();
        
        sistema.cadastrarUsuario(novoUsuario, novaSenha);
        System.out.println("✔ Usuário cadastrado com sucesso!\n");

        // Login
        System.out.println("[LOGIN]");
        String codigoGerado = sistema.gerarCodigoVerificacao();
        System.out.println("------------------------------");
        System.out.println("CÓDIGO DE VERIFICAÇÃO: " + codigoGerado);
        System.out.println("------------------------------");

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Repita o código de verificação: ");
        String codigoDigitado = scanner.nextLine();

        if (sistema.autenticar(usuario, senha, codigoDigitado)) {
            System.out.println("\n✅ LOGIN BEM-SUCEDIDO!");
            System.out.println("Bem-vindo, " + usuario + "!");
        } else {
            System.out.println("\n❌ FALHA NO LOGIN");
            System.out.println("Verifique usuário, senha ou código de verificação");
        }

        scanner.close();
    }
}