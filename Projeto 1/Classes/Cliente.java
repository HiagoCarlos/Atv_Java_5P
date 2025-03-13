package Classes;

public class Cliente extends Pessoa {
    public Cliente(String nome, int idade, String endereco, String telefone, String email) {
        super(nome, idade, endereco, telefone, email);
    }


    @Override
    public String exibirInformacoes() {
        return "Cliente: " + getNome() + ", Idade: " + getIdade() + ", Endereço: " + getEndereco() +
               ", Telefone: " + getTelefone() + ", Email: " + getEmail();
    }

    @Override
    public void atualizarInformacoes(String nome, int idade, String endereco, String telefone, String email) {
        setNome(nome);
        setIdade(idade);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }
}