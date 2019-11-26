public abstract class AcessorioAbstract implements Acessorio{

    protected double peso;
    protected double capacidade;
    protected int id;
    protected String aplicacao;

    public int getId() {
        return id;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public double getPeso() {
        return peso;
    }

    public String getAplicacao() {
        return aplicacao;
    }
}
