package entities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dênio Mingote
 */
/**
 * Classe abstrata que representa um usuário do sistema (Administrador ou
 * Colaborador).
 */
public abstract class Usuario {

    private static int proximoId;
    private int id;
    private String nome;
    private String login;
    private String senha;

    public Usuario(String nome, String login, String senha) {
        this.id = ++proximoId;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
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

    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public boolean alterarsenha(String antiga, String nova) {
        if (this.senha.equals(antiga)) {
            this.senha = nova;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuário - ID: " + id + ", Nome: " + nome + ", Login: " + login + ", Senha: " + senha;
    }
    
}
