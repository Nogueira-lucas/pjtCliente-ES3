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
    private Cidade cidade;

    public Endereco(String tipoLogradouro, String logradouro, String cep, String complemento, Cidade cidade) {
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void validarEndereco(){
        
    }
}
