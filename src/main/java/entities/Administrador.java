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
 * Representa o administrador do sistema.
 * Herda de Usuario e possui acesso total ao sistema.
 */
public class Administrador extends Usuario {
    
    private String email;
    private String telefone;

    public Administrador(String nome, String login, String senha, String email, String telefone) {
        super(nome,login,senha);
        this.email = email;
        this.telefone = telefone;
    }
    
    public Administrador(int id, String nome, String login, String senha, String email, String telefone) {
        super(id,nome,login,senha);
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
            this.email = email;
    }

    public void setTelefone(String telefone) {
            this.telefone = telefone;
    }
    
    
     
@Override
    public String toString(){
        return "Administrador - ID: " + getId() + ", Nome: " + getNome() 
                + ", Login: " + getLogin() + ", Senha: " + getSenha() 
                + ", Telefone: " + getTelefone() + ",Email: " + getEmail();
    }
}