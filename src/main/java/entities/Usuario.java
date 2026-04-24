package entities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dênio Mingote
 */
public class Usuario {
    private static int proximoId;
    private int Id;
    private String nome;
    private String login;
    private String senha;
    
    public Usuario(String nome, String login, String senha){
        this.Id = ++proximoId;
        this.login = login;
        this.nome = nome;
        this.senha = senha;       
           
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean autenticar(String login, String senha){
        return this.login.equals(login) && this.senha.equals(senha);
    }
    public boolean alterarsenha(String antiga, String nova){
        if (this.senha.equals(antiga)){
            this.senha = nova;
            return true;
        }
        return false;
    }  

    @Override
    public String toString() {
        return "Usuario {" + "Id=" + Id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + '}';
    }
     
}
