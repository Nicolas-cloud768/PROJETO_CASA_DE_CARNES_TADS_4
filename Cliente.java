import java.util.List;

public class Cliente {

    // Atributos
    private int idCliente;
    private String nome;
    private String telefone;

    // Método construtor
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos de encapsulamento
    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Metodo de listar pedidos do cliente
    public List<Pedido> pesquisarPedidos() {
        return Pedido.buscarPorCliente(this.nome);
    }
}
