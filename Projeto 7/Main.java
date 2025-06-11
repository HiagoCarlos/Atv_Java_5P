import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        PacoteViagemFacade facade = new PacoteViagemFacade();

        Cliente cliente1 = new Cliente("João Silva", "111.222.333-44");
        Cliente cliente2 = new Cliente("Maria Silva", "555.666.777-88");

        facade.comprarPacote(
                Arrays.asList(cliente1, cliente2),  
                Arrays.asList("1A", "1B"),         
                5,                                 
                TipoQuarto.EXECUTIVO,                
                TipoCarro.LUXO,                        
                FormaPagamento.PIX,                    
                1                                    
        );

        Cliente cliente3 = new Cliente("Carlos Pereira", "999.888.777-66");

        facade.comprarPacote(
                Collections.singletonList(cliente3),   
                Collections.singletonList("25C"),      
                7,                                     
                TipoQuarto.SIMPLES,                  
                TipoCarro.ECONOMICO,                   
                FormaPagamento.CREDITO,                
                4                                      
        );
    }
}