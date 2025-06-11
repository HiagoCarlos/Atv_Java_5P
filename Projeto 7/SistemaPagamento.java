enum FormaPagamento {
    PIX,
    BOLETO,
    DEBITO,
    CREDITO
}

class ResultadoPagamento {
    final double valorFinal;
    final double valorModificador; 

    public ResultadoPagamento(double valorFinal, double valorModificador) {
        this.valorFinal = valorFinal;
        this.valorModificador = valorModificador;
    }
}

public class SistemaPagamento {
    
    public ResultadoPagamento processarPagamento(double valorTotal, FormaPagamento forma, int parcelas) {
        double valorFinal = valorTotal;
        double modificador = 0.0;

        System.out.println("\n--- Processando Pagamento ---");
        System.out.printf("   - Forma de Pagamento: %s\n", forma);

        switch (forma) {
            case PIX:
                modificador = valorTotal * 0.10;
                valorFinal = valorTotal - modificador;
                System.out.printf("   - Desconto de 10%% aplicado: -R$ %.2f\n", modificador);
                break;
            case BOLETO:
                modificador = valorTotal * 0.05;
                valorFinal = valorTotal - modificador;
                System.out.printf("   - Desconto de 5%% aplicado: -R$ %.2f\n", modificador);
                break;
            case DEBITO:
            
                System.out.println("   - Sem desconto ou acréscimo.");
                break;
            case CREDITO:
                if (parcelas < 1 || parcelas > 6) {
                    throw new IllegalArgumentException("Número de parcelas inválido para crédito (1 a 6).");
                }
                if (parcelas > 1) {
                    
                    double jurosTotalPercentual = (parcelas -1) * 0.0399;
                    modificador = valorTotal * jurosTotalPercentual;
                    valorFinal = valorTotal + modificador;
                    System.out.printf("   - Acréscimo de juros para %d parcelas: +R$ %.2f\n", parcelas, modificador);
                } else {
                     System.out.println("   - Sem juros para 1x no crédito.");
                }
                break;
        }
        return new ResultadoPagamento(valorFinal, -modificador); 
    }
}