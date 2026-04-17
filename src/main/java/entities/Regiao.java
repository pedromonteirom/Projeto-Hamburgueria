/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Dênio Mingote
 */
public class Regiao {
    private int Id;
    private String nome;

    public Regiao(int Id, String nome) {
        this.Id = Id;
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Regiao{" + "Id=" + Id + ", nome=" + nome + '}';
    }
    
   
}
