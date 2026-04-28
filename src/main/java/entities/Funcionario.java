/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Pedro
 */
/**
 * Representa um funcionário do sistema.
 * Herda de Usuario.
 */
public class Funcionario extends Usuario{
       
    private String cargo;
    private String telefone;
    
    public Funcionario(String nome, String login, String senha, String cargo, String telefone) {
        super(nome, login, senha);
        this.cargo = cargo;
        this.telefone = telefone;
    }

    public Funcionario(int id, String nome, String login, String senha, String cargo, String telefone) {
        super(id, nome, login, senha);
        this.cargo = cargo;
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


@Override
    public String toString(){
        return "Funcionario - ID: " + getId() + ", Nome: " + getNome() 
                + ", Login: " + getLogin() + ", Senha: " + getSenha() 
                + ", Telefone: " + getTelefone() + ", Cargo: " + getCargo();
    }
}
