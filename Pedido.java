
public enum SituacaoPedido {
    RESERVADO,
    PENDENTE,
    RETIRADO,
    CANCELADO
}

public class Pedido {
    // Atributos da classe Pedido
    private int idPedido;
    private int numero;
    private LocalDate dataReserva;
    private LocalTime horaRetirada;
    private String observacao;
    private SituacaoPedido situacao;
}

// Construtor
public Pedido(int idPedido, int numero, LocalDate dataReserva, LocalTime horaRetirada, String observacao, SituacaoPedido situacao) {
    this.idPedido = idPedido;
    this.numero = numero;
    this.dataReserva = dataReserva;
    this.horaRetirada = horaRetirada;
    this.observacao = observacao;
    this.situacao = situacao;
}

// Getters e Setters
public int getIdPedido() {
    return idPedido;
}

public void setIdPedido(int idPedido) {
    this.idPedido = idPedido;
}

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public LocalDate getDataReserva() {
    return dataReserva;
}

public void setDataReserva(LocalDate dataReserva) {
    this.dataReserva = dataReserva;
}

public LocalTime getHoraRetirada() {
    return horaRetirada;
}

public void setHoraRetirada(LocalTime horaRetirada) {
    this.horaRetirada = horaRetirada;
}

public String getObservacao() {
    return observacao;
}

public void setObservacao(String observacao) {
    this.observacao = observacao;
}

public SituacaoPedido getSituacao() {
    return situacao;
}

