public class CCes extends AcessorioAbstract {

    public CCes(int dentes, int id){
        super.aplicacao = "contrucao";
        super.peso = dentes * 15.0;
        super.capacidade = dentes * 10.0;
        super.id = id;
    }
}
