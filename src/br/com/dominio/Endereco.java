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
public class Endereco {
    
    private String tipoLogradouro;
    private String logradouro;
    private String cep;
    private String complemento;

    public Endereco(String tipoLogradouro, String logradouro, String cep, String complemento) {
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.cep = cep;
        this.complemento = complemento;
    }

    public Endereco() {
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public void validarEndereco(){
        
    }
}
