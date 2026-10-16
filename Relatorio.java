public enum tipoRelatorio {
    RESUMO_PEDIDOS,
    ESTOQUE_RESTANTE,
    PEDIDOS_POR_SITUACAO
}

public class Relatorio {
    // Atributos da classe Relatorio
    private int idRelatorio;
    private LocalDateTime dataGeracao;
    private tipoRelatorio tipo;
}

// Constructor
public Relatorio(int idRelatorio, LocalDateTime dataGeracao, tipoRelatorio tipo) {
    this.idRelatorio = idRelatorio;
    this.dataGeracao = dataGeracao;
    this.tipo = tipo;
}

// Getters and Setters
public int getIdRelatorio() {
    return idRelatorio;
}

public void setIdRelatorio(int idRelatorio) {
    this.idRelatorio = idRelatorio;
}

public LocalDateTime getDataGeracao() {
    return dataGeracao;
}

public void setDataGeracao(LocalDateTime dataGeracao) {
    this.dataGeracao = dataGeracao;
}

public tipoRelatorio getTipo() {
    return tipo;
}

public void setTipo(tipoRelatorio tipo) {
    this.tipo = tipo;
}

// Gerar relatório
public void gerarRelatorio() {
    switch (tipo) {
        case RESUMO_PEDIDOS:
            // Lógica para gerar relatório de resumo de pedidos
            System.out.println("Gerando relatório de resumo de pedidos...");
            break;
        case ESTOQUE_RESTANTE:
            // Lógica para gerar relatório de estoque restante
            System.out.println("Gerando relatório de estoque restante...");
            break;
        case PEDIDOS_POR_SITUACAO:
            // Lógica para gerar relatório de pedidos por situação
            System.out.println("Gerando relatório de pedidos por situação...");
            break;
        default:
            throw new IllegalArgumentException("Tipo de relatório inválido: " + tipo);
    }
}