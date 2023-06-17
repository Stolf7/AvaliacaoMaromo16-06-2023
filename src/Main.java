public class Main {
    public static void main(String[] args) {
        // Criar objetos necessários
        Loja loja = new Loja();
        Carrinho carrinho = new Carrinho();

        // Adicionar produtos ao catálogo da loja
        Produto produto1 = new Produto(1, "Camiseta", "Camiseta branca", 29.99, 10);
        ProdutoFisico produtoFisico1 = new ProdutoFisico(2, "Livro", "Livro de ficção", 39.99, 3, 0.8, "20x15cm");
        ProdutoDigital produtoDigital1 = new ProdutoDigital(3, "Música", "Música em formato MP3", 1.99, 100, "MP3", 3.5);

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produtoFisico1);
        loja.adicionarProduto(produtoDigital1);

        // Adicionar produtos ao carrinho
        carrinho.adicionarProduto(produto1);

        carrinho.adicionarProduto(produtoFisico1);
        carrinho.adicionarProduto(produtoDigital1);

        // Exibir informações de um produto da loja
        int codigoProduto = 1;
        loja.exibirInformacoesProduto(codigoProduto);

        // Exibir informações dos produtos no carrinho
        carrinho.exibirProdutos();

        // Calcular o valor total da compra no carrinho
        double valorTotalCompra = carrinho.calcularValorTotal();
        System.out.println("Valor total da compra: R$" + valorTotalCompra);
    }
}