import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> catalogo;

    // Construtor
    public Loja() {
        catalogo = new ArrayList<>();
    }

    // Método para adicionar um produto ao catálogo da loja
    public void adicionarProduto(Produto produto) {
        catalogo.add(produto);
    }

    // Método para exibir informações sobre um produto
    public void exibirInformacoesProduto(int codigo) {
        for (Produto produto : catalogo) {
            if (produto.getCodigo() == codigo) {
                produto.exibirInformacoes();
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    // Método para processar um pedido de compra (atualizar estoque)
    public void processarPedidoCompra(int codigo, int quantidade) {
        for (Produto produto : catalogo) {
            if (produto.getCodigo() == codigo) {
                int estoqueAtual = produto.getQuantidadeEmEstoque();
                if (estoqueAtual >= quantidade) {
                    produto.setQuantidadeEmEstoque(estoqueAtual - quantidade);
                    System.out.println("Pedido processado com sucesso.");
                } else {
                    System.out.println("Quantidade insuficiente em estoque.");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    // Método para gerar um relatório com todos os produtos disponíveis
    public void gerarRelatorioProdutos() {
        for (Produto produto : catalogo) {
            produto.exibirInformacoes();
        }
    }
}