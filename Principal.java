import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        List<Produto> produtos = new ArrayList<>();

        do {
            produtos.add(lerDadosProduto(sc));
            System.out.println("Deseja adicionar mais um produto? (S/N) ");
            opcao = sc.next().charAt(0);
        } while (opcao == 'S' || opcao == 's' && opcao != 'N');

        System.out.println("\nProdutos cadastrados:");
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoImportado) {
                System.out.println("Produto Importado:");
            } else if (produto instanceof ProdutoUsado) {
                System.out.println("Produto Usado:");
            } else {
                System.out.println("Produto Comum:");
            }
            System.out.println(produto + "\n");
        }
    }

    public static Produto lerDadosProduto(Scanner sc) {
        System.out.println("Informe o tipo de produto");
        System.out.println("1 - Comum / 2 - Importado / 3 - Usado");
        int tipo = sc.nextInt();

        System.out.println("Insira o nome do produto: ");
        String nome = sc.next();
        System.out.println("Insira o preço do produto:");
        double preco = sc.nextDouble();

        switch (tipo) {
            case 1:
                return new Produto(nome, preco);
            case 2:
                System.out.println("Insira a taxa da alfândega a ser aplicada no produto: ");
                double taxaAlf = sc.nextDouble();
                ProdutoImportado produtoImportado = new ProdutoImportado(nome, preco, taxaAlf);
                produtoImportado.valorTotal();
                return produtoImportado;
            case 3:
                System.out.println("Insira a data de fabricação do produto (DD/MM/YYYY)");
                String data = sc.next();
                return new ProdutoUsado(nome, preco, data);
            default:
                System.out.println("Tipo de produto inválido. Criando produto comum por padrão.");
                return new Produto(nome, preco);
        }
    }
}