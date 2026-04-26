package entities;
/**
 *Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
/**
 * Representa um ingrediente utilizado nos lanches.
 * Armazena quantidade atual, unidade de medida e quantidade mínima para alerta de estoque.
 */
public class Ingrediente {
    
    private int id;
    private String nome;
    private double quantidadeAtual;
    private String unidadeDeMedida;
    private double quantidadeMinima;

    public Ingrediente(int id, String nome, double quantidadeAtual, String unidadeDeMedida, double quantidadeMinima) {
        this.id = id;
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.unidadeDeMedida = unidadeDeMedida;
        this.quantidadeMinima = quantidadeMinima;
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

    public double getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(double quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public double getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(double quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
    public boolean estaEmAlerta() { 
        return quantidadeAtual <= quantidadeMinima;
    }
    
    public void consumir(double quantidade) { 
        this.quantidadeAtual = Math.max(0, this.quantidadeAtual - quantidade); 
    }
    
    public void repor(double quantidade) { 
        this.quantidadeAtual += quantidade; 
    }
@Override
public String toString(){
    return "Ingrediente - ID:" + id + ", Nome: "  + nome + ", Quantidade: " + quantidadeAtual +  unidadeDeMedida + ", Minimo:" + quantidadeMinima
                + (estaEmAlerta() ? "ALERTA!!" : "");
}
    
}
