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
public class TipoEvento {
    private Integer idTipoEvento;
    private String nomeTipoEvento;

   

    /**
     * @return the nomeTipoEvento
     */
    public String getNomeTipoEvento() {
        return nomeTipoEvento;
    }

    /**
     * @param nomeTipoEvento the nomeTipoEvento to set
     */
    public void setNomeTipoEvento(String nomeTipoEvento) {
        this.nomeTipoEvento = nomeTipoEvento;
    }

    /**
     * @return the idTipoEvento
     */
    public Integer getIdTipoEvento() {
        return idTipoEvento;
    }

    /**
     * @param idTipoEvento the idTipoEvento to set
     */
    public void setIdTipoEvento(Integer idTipoEvento) {
        this.idTipoEvento = idTipoEvento;
    }
    
}
