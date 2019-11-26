public class Facade {

    private FrotaBr frota1;

    public Facade(){
        this.frota1 = new FrotaBr();
    }


    public int cadastrarMiniCar( double potencia, double capacidade, double peso){
        return frota1.cadastraMiniCar(potencia, capacidade, peso);
    }

    public String exibirMiniCar(int iD){
        return frota1.exibeMiniCar(iD);
    }

    public int cadastraCCes(int dentes){
        return cadastraCCes(dentes);
    }
    public int cadastraCCar(double largura){
        return frota1.cadastraCCar(largura);
    }
    public int cadastraCGal(double larguraCorte){
        return frota1.cadastraCGal(larguraCorte);
    }

    public void setAcessorio( int iDMiniCar, int iDAcessorio ){
        frota1.setAcessorio(iDMiniCar, iDAcessorio);
    }
    public String consultar(String aplicacao){
        return frota1.consultar(aplicacao);
    }
}
