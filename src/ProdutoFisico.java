public class ProdutoFisico extends Produto {
    private double peso;
    private String dimensoes;

    // Construtor
    public ProdutoFisico(int codigo, String nome, String descricao, double preco, int quantidadeEmEstoque, double peso, String dimensoes) {
        super(codigo, nome, descricao, preco, quantidadeEmEstoque);
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    // Getter e Setter específicos
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    // Sobrescrita do método exibirInformacoes
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe pai (Produto)
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dimensões: " + dimensoes);
    }
}