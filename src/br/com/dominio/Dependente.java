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
public class Dependente {
    private String nome;

    private Parentesco parentesco;
    
    public Dependente(String nome) {
        this.nome = nome;
    }

    public Dependente() {
    }

    public String getNome() {
        return nome;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }
    
    public void validarDependente(){
        
    }
}
