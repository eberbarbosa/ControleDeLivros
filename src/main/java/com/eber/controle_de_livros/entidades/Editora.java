package com.eber.controle_de_livros.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  nome;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_editora")
    private List<Telefone> telefones = new ArrayList<Telefone>();
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    private String  site;
    private String  email;



    public List<Telefone> getTelefones() {
        return telefones;
    }
    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
