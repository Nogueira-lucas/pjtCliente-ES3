/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dominio;

/**
 *
 * @author lucas
 */
public class Cliente{

    private Integer id;
    private String nome;
    private String cpf;
    private String credito;
    
    private Dependente dependente;
    private Dependente dependente_op;
    
    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cpf, String credito) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.credito = credito;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
    
    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public Dependente getDependente_op() {
        return dependente_op;
    }

    public void setDependente_op(Dependente dependente_op) {
        this.dependente_op = dependente_op;
    }

    public void salvar(){
        
    }
    
    public void validarNome(){
        
    }
    
    public void validarCPF(){
        
    }
    
    public void validarEndereco(){
        
    }
    
    public void validarDependente(){
        
    }
}
