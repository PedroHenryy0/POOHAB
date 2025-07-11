public class Escritorio extends Ambiente {
    public Escritorio(String nome, double temperaturaAtual) {
        super(nome, temperaturaAtual);
    }

    @Override
    public double getLimiteMaximo() {
        return 25.0;
    }
}
