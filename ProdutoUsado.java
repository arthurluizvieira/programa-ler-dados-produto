public class ProdutoUsado extends Produto {

    private String dataFabricacao;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData de fabricação: " + dataFabricacao;
    }
}