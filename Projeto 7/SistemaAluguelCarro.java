enum TipoCarro {
    ECONOMICO,
    EXECUTIVO,
    LUXO
}

public class SistemaAluguelCarro {
    private static final double DIARIA_BASE_ECONOMICO = 150.00;

    public double alugarCarro(TipoCarro tipo, int numDiarias) {
        double precoDiaria = calcularPrecoDiaria(tipo);
        double custoTotal = precoDiaria * numDiarias;

        System.out.printf("   - Aluguel de Carro: %d diária(s) de Carro %s | Valor: R$ %.2f\n",
                numDiarias, tipo, custoTotal);

        return custoTotal;
    }

    private double calcularPrecoDiaria(TipoCarro tipo) {
        switch (tipo) {
            case ECONOMICO:
                return DIARIA_BASE_ECONOMICO;
            case EXECUTIVO:
            
                return DIARIA_BASE_ECONOMICO * 2.0;
            case LUXO:
                
                double precoExecutivo = DIARIA_BASE_ECONOMICO * 2.0;
                return precoExecutivo * 2.0;
            default:
                return 0.0;
        }
    }
}