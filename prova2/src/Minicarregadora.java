import java.util.Objects;

public class Minicarregadora {

    private Double potencia;
    private double capacidade;
    private double peso;
    private int id;
    private String aplicacao;
    private Acessorio acessorio;
    private Estrategia e;


    public Minicarregadora(Double potencia, double capacidade, double peso, int id ){
        this.potencia = potencia;
        this.peso = peso;
        this.capacidade = capacidade;
        this.id = id;
        this.aplicacao = "geral";
        this.acessorio = null;
    }

    @Override
    public String toString() {
        return "MiniCar " + " " + id + "[" +
                "potencia=" + potencia +
                ", capacidade=" + capacidade +
                ", peso=" + peso +
                ", aplicacao='" + aplicacao + '\'' +
                ']';
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
        this.aplicacao = acessorio.getAplicacao();
        this.capacidade += acessorio.getCapacidade();
        this.peso += acessorio.getPeso();
        switch (acessorio.getAplicacao()){
            case "construcao":
                this.e = Estrategia.CONSTRUCAO;
            case "agricultura":
                this.e = Estrategia.AGRICULTURA;
            case "paisagismo":
                this.e = Estrategia.PAISAGISMO;
                break;
        }
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minicarregadora that = (Minicarregadora) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getAplicacao() {
        return this.aplicacao;
    }
}
