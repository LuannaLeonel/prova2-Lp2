public class CCar extends AcessorioAbstract {

    public CCar(double largura, int id){
        super.aplicacao = "agricultura";
        super.peso = largura * 200.0;
        super.capacidade = largura / 0.004;
        super.id = id;
    }
}
