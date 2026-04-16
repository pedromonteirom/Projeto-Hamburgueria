/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetohamburgueria;

/**
 *
 * @author Pedro
 */
public class Adicional {

    private int id;
    private String nome;
    private double valor;

    public Adicional(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
@Override
public String toString(){
    return "Adicional - ID: " + id + ", Nome: " + nome +", Valor: " + String.format("%.2f", valor) + "R$";
}
}
