/**
 * Novo Decorator Concreto para o serviço de mensagens via Whatsapp.
 */
public class PacoteMensagemWhatsapp extends AssinaturaDecorator {

    public PacoteMensagemWhatsapp(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        // Adiciona a descrição deste serviço à descrição já existente
        return super.getDescricao() + "\n+ Extra: Mensagem por Whatsapp";
    }

    @Override
    public double getPreco() {
        // Adiciona o preço deste serviço ao preço total
        return super.getPreco() + 2.99;
    }
}