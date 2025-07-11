public class MonitorTemperatura {
    private IMensagem mensagem;

    public MonitorTemperatura(IMensagem mensagem) {
        this.mensagem = mensagem;
    }

    public void verificarAmbiente(Ambiente ambiente) {
        if (ambiente.estaAcimadoLimite()) {
            mensagem.enviar("Alerta! " + ambiente.getResumo());
        }
    }
}
