/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contur.model;

/**
 *
 * @author Alunos
 */
public class PontoTuristico {
    private Integer idPontoTuristico;
    private String dadoPontoTuristico;
    private String nomePontoTuristico;
    private String descricaoPontoTuristico;
    private Cidade idCidadePontoTuristico;

    /**
     * @return the idPontoTuristico
     */
    public Integer getIdPontoTuristico() {
        return idPontoTuristico;
    }

    /**
     * @param idPontoTuristico the idPontoTuristico to set
     */
    public void setIdPontoTuristico(Integer idPontoTuristico) {
        this.idPontoTuristico = idPontoTuristico;
    }

    /**
     * @return the dadoPontoTuristico
     */
    public String getDadoPontoTuristico() {
        return dadoPontoTuristico;
    }

    /**
     * @param dadoPontoTuristico the dadoPontoTuristico to set
     */
    public void setDadoPontoTuristico(String dadoPontoTuristico) {
        this.dadoPontoTuristico = dadoPontoTuristico;
    }

    /**
     * @return the nomePontoTuristico
     */
    public String getNomePontoTuristico() {
        return nomePontoTuristico;
    }

    /**
     * @param nomePontoTuristico the nomePontoTuristico to set
     */
    public void setNomePontoTuristico(String nomePontoTuristico) {
        this.nomePontoTuristico = nomePontoTuristico;
    }

    /**
     * @return the descricaoPontoTuristico
     */
    public String getDescricaoPontoTuristico() {
        return descricaoPontoTuristico;
    }

    /**
     * @param descricaoPontoTuristico the descricaoPontoTuristico to set
     */
    public void setDescricaoPontoTuristico(String descricaoPontoTuristico) {
        this.descricaoPontoTuristico = descricaoPontoTuristico;
    }

    /**
     * @return the idCidadePontoTuristico
     */
    public Cidade getIdCidadePontoTuristico() {
        return idCidadePontoTuristico;
    }

    /**
     * @param idCidadePontoTuristico the idCidadePontoTuristico to set
     */
    public void setIdCidadePontoTuristico(Cidade idCidadePontoTuristico) {
        this.idCidadePontoTuristico = idCidadePontoTuristico;
    }


}
