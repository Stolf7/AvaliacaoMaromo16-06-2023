public class ProdutoDigital extends Produto {
    private String formato;
    private double tamanhoArquivo;

    // Construtor
    public ProdutoDigital(int codigo, String nome, String descricao, double preco, int quantidadeEmEstoque, String formato, double tamanhoArquivo) {
        super(codigo, nome, descricao, preco, quantidadeEmEstoque);
        this.formato = formato;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    // Getters e Setters específicos
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    // Sobrescrita do método exibirInformacoes
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe pai (Produto)
        System.out.println("Formato: " + formato);
        System.out.println("Tamanho do Arquivo: " + tamanhoArquivo + " MB");
    }
}