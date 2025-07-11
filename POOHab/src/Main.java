//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ambiente sala1 = new Room("Sala de Reunião", 27.5);
        Ambiente escritorio1 = new Escritorio("Escritório Inovação", 24.0);
        Ambiente servidor1 = new Servidor("Servidor DataBase", 31.2);

        IMensagem mensagem = new MensagemConsole();
        MonitorTemperatura monitor  = new MonitorTemperatura(mensagem);

        Ambiente[] ambientes = {sala1, escritorio1, servidor1};

        for (Ambiente alpha : ambientes) {
            monitor.verificarAmbiente(alpha);
        }
    }
}