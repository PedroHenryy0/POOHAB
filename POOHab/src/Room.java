public class Room extends Ambiente {
    public Room(String nome, double temperaturalAtual) {
        super(nome, temperaturalAtual);
    }
    @Override
    public double getLimiteMaximo(){
        return 26.0;
    }
}
