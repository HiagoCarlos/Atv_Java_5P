import java.util.HashSet;
import java.util.Set;


enum ClasseVoo {
    ECONOMICA(1, 9, 32),
    EXECUTIVA(2.5, 4, 8),
    PRIMEIRA_CLASSE(1, 1, 3); 

    final double multiplicadorPreco;
    final int fileiraInicio;
    final int fileiraFim;

    ClasseVoo(double multiplicador, int inicio, int fim) {
        this.multiplicadorPreco = multiplicador;
        this.fileiraInicio = inicio;
        this.fileiraFim = fim;
    }
}

public class SistemaAereo {
    private final Set<String> assentosOcupados = new HashSet<>();
    private static final double PRECO_BASE_ECONOMICA = 500.00;

    public double reservarVoo(Cliente cliente, String assento) {
        if (assentosOcupados.contains(assento)) {
            System.out.println("ERRO: Assento " + assento + " já está ocupado.");
            throw new RuntimeException("Assento indisponível.");
        }

        int fileira = Integer.parseInt(assento.substring(0, assento.length() - 1));
        ClasseVoo classe = determinarClasse(fileira);
        double precoPassagem = calcularPreco(classe);
        
        assentosOcupados.add(assento);

        System.out.printf("   - Passagem para %s (CPF: %s) no assento %s (%s - %s) | Valor: R$ %.2f\n",
                cliente.getNome(), cliente.getCpf(), assento, classe, getTipoAssento(assento), precoPassagem);

        return precoPassagem;
    }

    private ClasseVoo determinarClasse(int fileira) {
        if (fileira >= ClasseVoo.PRIMEIRA_CLASSE.fileiraInicio && fileira <= ClasseVoo.PRIMEIRA_CLASSE.fileiraFim) {
            return ClasseVoo.PRIMEIRA_CLASSE;
        } else if (fileira >= ClasseVoo.EXECUTIVA.fileiraInicio && fileira <= ClasseVoo.EXECUTIVA.fileiraFim) {
            return ClasseVoo.EXECUTIVA;
        } else if (fileira >= ClasseVoo.ECONOMICA.fileiraInicio && fileira <= ClasseVoo.ECONOMICA.fileiraFim) {
            return ClasseVoo.ECONOMICA;
        } else {
            throw new IllegalArgumentException("Fileira inválida: " + fileira);
        }
    }

    private double calcularPreco(ClasseVoo classe) {
        switch (classe) {
            case ECONOMICA:
                return PRECO_BASE_ECONOMICA;
            case EXECUTIVA:
                
                return PRECO_BASE_ECONOMICA * 3.5; 
            case PRIMEIRA_CLASSE:
               
                double precoExecutiva = PRECO_BASE_ECONOMICA * 3.5;
                return precoExecutiva * 2.5; 
            default:
                return 0.0;
        }
    }
    
    private String getTipoAssento(String assento) {
        char letra = assento.charAt(assento.length() - 1);
        switch (Character.toUpperCase(letra)) {
            case 'A': case 'F': return "Janela";
            case 'B': case 'E': return "Meio";
            case 'C': case 'D': return "Corredor";
            default: return "Desconhecido";
        }
    }
}