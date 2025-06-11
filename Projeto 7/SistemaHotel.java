enum TipoQuarto {
    SIMPLES,
    EXECUTIVO,
    PRESIDENCIAL
}

public class SistemaHotel {
    private static final double DIARIA_BASE_SIMPLES = 200.00;

    public double reservarQuarto(TipoQuarto tipo, int numPessoas, int numDiarias) {
        double precoDiariaPorPessoa = calcularPrecoDiaria(tipo);
        double custoTotal = precoDiariaPorPessoa * numPessoas * numDiarias;

        System.out.printf("   - Reserva de Hotel: %d diária(s) em Quarto %s para %d pessoa(s) | Valor: R$ %.2f\n",
                numDiarias, tipo, numPessoas, custoTotal);
        
        return custoTotal;
    }

    private double calcularPrecoDiaria(TipoQuarto tipo) {
        switch (tipo) {
            case SIMPLES:
                return DIARIA_BASE_SIMPLES;
            case EXECUTIVO:
                
                return DIARIA_BASE_SIMPLES * 1.5;
            case PRESIDENCIAL:
                
                double precoExecutivo = DIARIA_BASE_SIMPLES * 1.5;
                return precoExecutivo * 3.0;
            default:
                return 0.0;
        }
    }
}