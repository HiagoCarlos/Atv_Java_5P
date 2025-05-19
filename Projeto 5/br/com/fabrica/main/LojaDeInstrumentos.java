package br.com.fabrica.main;

import br.com.fabrica.catalogo.CatalogoVioloes;
import br.com.fabrica.prototype.TipoViolao;
import br.com.fabrica.prototype.Violao;
import java.util.Scanner;

public class LojaDeInstrumentos {
    public static void main(String[] args) {
        CatalogoVioloes catalogo = new CatalogoVioloes();
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("=== Fábrica de Violões ===");
            for (TipoViolao t : TipoViolao.values()) System.out.println("- " + t);

            System.out.print("\nEscolha um tipo: ");
            String escolha = in.nextLine().trim().toUpperCase();

            try {
                Violao v = catalogo.criarViolao(TipoViolao.valueOf(escolha));
                System.out.println("\nInstrumento criado com sucesso!\n");
                v.exibirFichaTecnica();
            } catch (Exception e) {
                System.out.println("Tipo inválido!");
            }
        }
    }
}
