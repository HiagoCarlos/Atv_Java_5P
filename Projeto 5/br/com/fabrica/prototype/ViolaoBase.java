package br.com.fabrica.prototype;

public class ViolaoBase implements Violao {
    private String nome;
    private String cordas;
    private String corpo;
    private String timbre;
    private boolean eletro;

    public ViolaoBase(String nome, String cordas, String corpo,
                      String timbre, boolean eletro) {
        this.nome   = nome;
        this.cordas = cordas;
        this.corpo  = corpo;
        this.timbre = timbre;
        this.eletro = eletro;
    }

    @Override
    public Violao clone() {
        try { return (Violao) super.clone(); }
        catch (CloneNotSupportedException e) { throw new AssertionError(e); }
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.printf("""
            === %s ===
            Cordas : %s
            Corpo  : %s
            Timbre : %s
            Eletro : %s%n%n""",
            nome, cordas, corpo, timbre, eletro ? "Sim" : "Não");
    }
}
