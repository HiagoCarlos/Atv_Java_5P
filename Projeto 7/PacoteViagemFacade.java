import java.util.List;

public class PacoteViagemFacade {
    private final SistemaAereo sistemaAereo;
    private final SistemaHotel sistemaHotel;
    private final SistemaAluguelCarro sistemaAluguelCarro;
    private final SistemaPagamento sistemaPagamento;

    public PacoteViagemFacade() {
        this.sistemaAereo = new SistemaAereo();
        this.sistemaHotel = new SistemaHotel();
        this.sistemaAluguelCarro = new SistemaAluguelCarro();
        this.sistemaPagamento = new SistemaPagamento();
    }

    public void comprarPacote(
            List<Cliente> clientes,
            List<String> assentos,
            int numDiarias,
            TipoQuarto tipoQuarto,
            TipoCarro tipoCarro,
            FormaPagamento formaPagamento,
            int parcelasCredito) {
                
        System.out.println("======================================================");
        System.out.println("      INICIANDO RESERVA DE PACOTE DE VIAGEM");
        System.out.println("======================================================\n");

        System.out.println("--- Dados dos Compradores ---");
        for (Cliente cliente : clientes) {
            System.out.printf("   - Nome: %s | CPF: %s\n", cliente.getNome(), cliente.getCpf());
        }

        
        double custoTotal = 0;
        System.out.println("\n--- Detalhes da Compra ---");

        // Voo
        if (clientes.size() != assentos.size()) {
            throw new IllegalArgumentException("O número de clientes deve ser igual ao número de assentos.");
        }
        for (int i = 0; i < clientes.size(); i++) {
             custoTotal += sistemaAereo.reservarVoo(clientes.get(i), assentos.get(i));
        }

        custoTotal += sistemaHotel.reservarQuarto(tipoQuarto, clientes.size(), numDiarias);

        custoTotal += sistemaAluguelCarro.alugarCarro(tipoCarro, numDiarias);
        
        System.out.println("------------------------------------------------------");
        System.out.printf("SUBTOTAL DO PACOTE: R$ %.2f\n", custoTotal);
        System.out.println("------------------------------------------------------");

        ResultadoPagamento resultado = sistemaPagamento.processarPagamento(custoTotal, formaPagamento, parcelasCredito);
        

        System.out.println("\n=================== RESUMO FINAL ===================");
        if (resultado.valorModificador < 0) {
            System.out.printf("Desconto Total Aplicado: R$ %.2f\n", -resultado.valorModificador);
        } else if (resultado.valorModificador > 0) {
            System.out.printf("Acréscimo Total (Juros): R$ %.2f\n", resultado.valorModificador);
        }
        System.out.printf("VALOR FINAL A PAGAR: R$ %.2f\n", resultado.valorFinal);
        System.out.println("======================================================");
    }
}