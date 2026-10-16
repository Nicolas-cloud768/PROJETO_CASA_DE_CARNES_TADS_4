/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_casa_de_carnes_tads_4;

/**
 *
 * @author Nicolas
 */

public class Cliente {
    // Atributos
    private int idUsuario;
    private String nome;
    private String usuario;
    private String senha;
    private String perfil;

    // Método Construtor
    public Cliente(String nome, String usuario, String senha, String perfil) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.perfil = perfil;
    }

    // Métodos de encapsulamento
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    // Métodos de Login
    public void login(String usuario, String senha) {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Usuario ou senha incorretos.");
        }
    }

    public void cadastrar() {
        System.out.printf("Usuario %s cadastrado.%n", getNome());
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }
}