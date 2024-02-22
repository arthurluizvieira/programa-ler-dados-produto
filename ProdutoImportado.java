public class ProdutoImportado extends Produto {

    private double taxaAlfandega;
    private double valor;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public void valorTotal(){
        valor = preco + taxaAlfandega;
    }

    @Override
    public String toString(){
        return super.toString()
                + "\nTaxa da alfândega: " + taxaAlfandega
                + "\n Valor total: "
                + String.format("%.2f", valor);
    }
}
