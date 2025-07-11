public abstract class Ambiente {
    protected String nome;
    protected double temperaturaAtual;

    public Ambiente(String nome, double temperaturaAtual) {
        this.nome = nome;
        this.temperaturaAtual = temperaturaAtual;
    }

    public boolean estaAcimadoLimite() {
        return temperaturaAtual > getLimiteMaximo();
    }

    public String getResumo() {
        return nome + " - temperatura: " + temperaturaAtual + " ºC (Limite: " + getLimiteMaximo() + "ºC)";
    }

    public abstract double getLimiteMaximo();
    }