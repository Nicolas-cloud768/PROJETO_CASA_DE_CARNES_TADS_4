public class Produto {
    // Atributos da classe Produto
    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private BigDecimal precoProduto;
    private boolean ativo;
}

// Construtor da classe Produto
    public Produto(int idProduto, String nomeProduto, String descricaoProduto, BigDecimal precoProduto, boolean ativo) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.ativo = ativo;
    }

// Getters e Setters
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(BigDecimal precoProduto) {
        this.precoProduto = precoProduto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

// Metodo cadastrarProduto
    public void cadastrarProduto() {
        // Lógica para cadastrar o produto no sistema
        System.out.println("Produto cadastrado com sucesso!");
    }

// Metodo atualizarProduto
    public void atualizarProduto() {
        // Lógica para atualizar o produto no sistema
        System.out.println("Produto atualizado com sucesso!");
    }

// Metodo excluirProduto
    public void excluirProduto() {
        // Lógica para excluir o produto do sistema
        System.out.println("Produto excluído com sucesso!");
    }

// Metodo BuscarProduto
    public void buscarProduto() {
        // Lógica para buscar o produto no sistema
        System.out.println("Produto encontrado!");
    }



