public class Servidor extends Ambiente{
    public Servidor(String nome, double temperaturaAtual) {
        super(nome, temperaturaAtual);
    }
    @Override
    public double getLimiteMaximo() {
        return 30.0;
    }
}
