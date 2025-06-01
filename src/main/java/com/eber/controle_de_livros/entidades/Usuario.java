package com.eber.controle_de_livros.entidades;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String  usuario;
    private String  senha;
    private boolean admin = true;
    @OneToOne(mappedBy = "usuario")
    private FuncionarioBiblioteca funcionarioBiblioteca;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public FuncionarioBiblioteca getFuncionarioBiblioteca() {
        return funcionarioBiblioteca;
    }
    public void setFuncionarioBiblioteca(FuncionarioBiblioteca funcionarioBiblioteca) {
        this.funcionarioBiblioteca = funcionarioBiblioteca;
    }

}
