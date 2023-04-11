/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contur.model;

/**
 *
 * @author aninh
 */
public class Cidade {
    private Integer idCidade;
    private String ufCidade;
    private String nomeCidade;

    /**
     * @return the idCidade
     */
    public Integer getIdCidade() {
        return idCidade;
    }

    /**
     * @param idCidade the idCidade to set
     */
    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    /**
     * @return the ufCidade
     */
    public String getUfCidade() {
        return ufCidade;
    }

    /**
     * @param ufCidade the ufCidade to set
     */
    public void setUfCidade(String ufCidade) {
        this.ufCidade = ufCidade;
    }

    /**
     * @return the nomeCidade
     */
    public String getNomeCidade() {
        return nomeCidade;
    }

    /**
     * @param nomeCidade the nomeCidade to set
     */
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
    

}
