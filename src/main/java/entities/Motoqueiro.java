/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Dênio Mingote
 */
/**
 * Representa um motoqueiro responsável pelas entregas.
 * O sistema mantém no mínimo 5 motoqueiros ativos.
 */
public class Motoqueiro {

    private static int proximoId;

    private int id;
    private String nome;
    private String telefone;
    private int idRegiao;
    private boolean disponivel;

    public Motoqueiro(String nome, String telefone, int idRegiao) {
        this.id = ++proximoId;
        this.nome = nome;
        this.telefone = telefone;
        this.idRegiao = idRegiao;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdRegiao() {
        return idRegiao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean b) {
        this.disponivel = b;
    }

    public void notificarEntregaConcluida(int idPedido) {
        System.out.println("Entrega " + idPedido + " concluída por " + nome);
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return "Motoqueiro - ID: " + id + ", Nome: " + nome + ", Telefone: '" + telefone +  
                ", ID Região: " + idRegiao + ", Disponivel: " + disponivel;
    }
}
