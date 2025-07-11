public class MensagemEmail implements IMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }
}
