public class ItemPedido {
    // Atributos da classe ItemPedido
    private int idItem;
    private int quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal precoTotal;
}

// Construtor da classe ItemPedido
    public ItemPedido(int idItem, int quantidade, BigDecimal precoUnitario) {
        this.idItem = idItem;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.precoTotal = precoUnitario.multiply(new BigDecimal(quantidade));
    }

// Getters e Setters
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.precoTotal = precoUnitario.multiply(new BigDecimal(quantidade));
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
        this.precoTotal = precoUnitario.multiply(new BigDecimal(quantidade));
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(BigDecimal precoTotal) {
        this.precoTotal = precoTotal;
    }

// Método para calcular o preço total do item
    public void calcularPrecoTotal() {
        this.precoTotal = precoUnitario.multiply(new BigDecimal(quantidade));
    }

