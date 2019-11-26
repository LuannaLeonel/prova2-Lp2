import java.util.*;

public class FrotaBr {

    private Map<Integer, Minicarregadora> frota;
    private int qtdMiniCar;
    private Map<Integer, Acessorio> acessorios;
    private int qtdAcessorios;

    public FrotaBr(){
        frota = new HashMap<>();
        qtdMiniCar = 0;
        acessorios = new HashMap<>();
        qtdAcessorios = 0;
    }

    public int cadastraMiniCar( double potencia, double capacidade, double peso){
        Validador.validaDouble(potencia);
        Validador.validaDouble(capacidade);
        Validador.validaDouble(peso);

        qtdMiniCar ++;
        Minicarregadora miniCar = new Minicarregadora(potencia,capacidade,peso,qtdMiniCar);
        frota.put(qtdMiniCar,miniCar);
        return qtdMiniCar;
    }

    public String exibeMiniCar(int id){
        if (frota.containsKey(id)){
            return frota.get(id).toString();
        } else {
            throw new IndexOutOfBoundsException("Minicarregadeira nao encontrada.");
        }
    }
    public int cadastraCCes(int dentes){
        qtdAcessorios ++;
        Acessorio acessorio = new CCes(dentes,qtdMiniCar);
        acessorios.put(qtdAcessorios,acessorio);
        return qtdAcessorios;
    }
    public int cadastraCCar(double largura){
        qtdAcessorios ++;
        Acessorio acessorio = new CCar(largura,qtdMiniCar);
        acessorios.put(qtdAcessorios,acessorio);
        return qtdAcessorios;
    }
    public int cadastraCGal(double largura){
        qtdAcessorios ++;
        Acessorio acessorio = new CGal(largura,qtdMiniCar);
        acessorios.put(qtdAcessorios,acessorio);
        return qtdAcessorios;
    }

    public void setAcessorio(int idMiniCar,int idAcess){
        Validador.validaInt(idMiniCar);
        Validador.validaInt(idAcess);
        if (frota.containsKey(idMiniCar)){
            if (acessorios.containsKey(idAcess)){
                frota.get(idMiniCar).setAcessorio(acessorios.get(idAcess));
            } else {
                throw new IllegalArgumentException("Acessorio nao encontrado");
            }
        }else {
            throw new IllegalArgumentException("Minicarregadeira nao encontrada.");
        }
    }
    public String consultar(String aplicacao){
        Validador.valida(aplicacao);
        List<Minicarregadora> miniCars = new ArrayList<>();
        String res = "";
        switch (aplicacao){
            case "paisagismo":
                for (Minicarregadora m : frota.values()){
                    if (m.getAplicacao().equals("paisagismo")){
                        miniCars.add(m);
                    }
                }
            case "agricultura":
                for (Minicarregadora m : frota.values()) {
                    if (m.getAplicacao().equals("agricultura")) {
                        miniCars.add(m);
                    }
                }
            case "construção":
                for (Minicarregadora m : frota.values()) {
                    if (m.getAplicacao().equals("construção")) {
                        miniCars.add(m);
                    }
                }
                break;
        }
        Collections.sort(miniCars, new OrdenaMiniCar());
        for (Minicarregadora m : miniCars){
            res += m.toString() + '\n';
        }
        return res;

    }

}
