/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Representa um cliente da hamburgueria.
 * Implementa {@link Comparator} para ordenações por diferentes atributos (Q2-13).
 */
public class Cliente implements Comparator<Cliente> {

    private static int proximoId = 1;

    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private List<Integer> historicoIdPedidos;
    private int idUltimoPedido;
    private String dataUltimoPedido;

    public Cliente(String nome, String telefone, String endereco) {
        this.id = proximoId++;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.historicoIdPedidos = new ArrayList<>();
        this.idUltimoPedido = -1;
        this.dataUltimoPedido = "";
    }

    public Cliente(int id, String nome, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.historicoIdPedidos = new ArrayList<>();
        this.idUltimoPedido = -1;
        this.dataUltimoPedido = "";
        if (id >= proximoId) proximoId = id + 1;
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id;
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
    public String getEndereco() { 
        return endereco; 
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco; 
    }
    public List<Integer> getHistoricoIdPedidos() { 
        return historicoIdPedidos; 
    }
    public void setHistoricoIdPedidos(List<Integer> historicoIdPedidos) { 
        this.historicoIdPedidos = historicoIdPedidos; 
    }
    public int getIdUltimoPedido() {
        return idUltimoPedido; 
    }
    public void setIdUltimoPedido(int idUltimoPedido) {
        this.idUltimoPedido = idUltimoPedido; }
    public String getDataUltimoPedido() { 
        return dataUltimoPedido; 
    }
    public void setDataUltimoPedido(String dataUltimoPedido) { 
        this.dataUltimoPedido = dataUltimoPedido; 
    }

    public void registrarPedido(int idPedido, String data) {
        this.historicoIdPedidos.add(idPedido);
        this.idUltimoPedido = idPedido;
        this.dataUltimoPedido = data;
    }

    /** Comparator por nome (ordem alfabética). */
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return c1.getNome().compareToIgnoreCase(c2.getNome());
    }

    public static Comparator<Cliente> porTelefone() {
        return Comparator.comparing(Cliente::getTelefone); }
    public static Comparator<Cliente> porId() { 
        return Comparator.comparingInt(Cliente::getId); }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "', telefone='" + telefone
                + "', endereco='" + endereco + "', totalPedidos=" + historicoIdPedidos.size()
                + ", ultimoPedidoId=" + (idUltimoPedido == -1 ? "nenhum" : idUltimoPedido) + "}";
    }
}
