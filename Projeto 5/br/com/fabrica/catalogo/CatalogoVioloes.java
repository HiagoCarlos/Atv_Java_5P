package br.com.fabrica.catalogo;

import br.com.fabrica.prototype.*;
import java.util.EnumMap;
import java.util.Map;

public class CatalogoVioloes {
    private final Map<TipoViolao, Violao> prototipos = new EnumMap<>(TipoViolao.class);

    public CatalogoVioloes() {
        prototipos.put(TipoViolao.CLASSICO,
            new ViolaoBase("Violão Clássico", "6 nylon", "Caixa média", "Suave", false));
        prototipos.put(TipoViolao.FOLK,
            new ViolaoBase("Violão Folk", "6 aço", "Corpo acinturado", "Encorpado", true));
        prototipos.put(TipoViolao.FLET,
            new ViolaoBase("Violão Flet", "6 nylon", "Caixa fina", "Suave", true));
        prototipos.put(TipoViolao.JUMBO,
            new ViolaoBase("Violão Jumbo", "6 aço", "Corpo largo", "Grave", true));
        prototipos.put(TipoViolao.SETE_CORDAS,
            new ViolaoBase("Violão 7 Cordas", "7 nylon", "Caixa média", "Grave extra", false));
        prototipos.put(TipoViolao.DOZE_CORDAS,
            new ViolaoBase("Violão 12 Cordas", "12 aço", "Caixa média", "Ressonante", false));
        prototipos.put(TipoViolao.ZERO,
            new ViolaoBase("Violão Zero", "6 nylon", "Parlor pequeno", "Equilibrado", false));
        prototipos.put(TipoViolao.DUPLO_ZERO,
            new ViolaoBase("Violão 00", "6 nylon", "Parlor médio", "Fingerstyle", false));
        prototipos.put(TipoViolao.TRIPLO_ZERO,
            new ViolaoBase("Violão 000", "6 nylon", "Parlor grande", "Peculiar", false));
    }

    public Violao criarViolao(TipoViolao tipo) {
        return prototipos.get(tipo).clone();
    }
}
