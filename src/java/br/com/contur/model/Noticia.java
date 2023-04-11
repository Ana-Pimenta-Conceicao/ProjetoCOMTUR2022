/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contur.model;

import java.util.Date;

/**
 *
 * @author Alunos
 */
public class Noticia {

    private Integer idNoticia;
    private String tituloNoticia;
    private String dataNoticia;
    private String subtituloNoticia;
    private String fotoNoticia;
    private String conteudoNoticia;
    private Cidade cidade;

    /**
     * @return the idNoticia
     */
    public Integer getIdNoticia() {
        return idNoticia;
    }

    /**
     * @param idNoticia the idNoticia to set
     */
    public void setIdNoticia(Integer idNoticia) {
        this.idNoticia = idNoticia;
    }

    /**
     * @return the tituloNoticia
     */
    public String getTituloNoticia() {
        return tituloNoticia;
    }

    /**
     * @param tituloNoticia the tituloNoticia to set
     */
    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    /**
     * @return the dataNoticia
     */
    public String getDataNoticia() {
        return dataNoticia;
    }

    /**
     * @param dataNoticia the dataNoticia to set
     */
    public void setDataNoticia(String dataNoticia) {
        this.dataNoticia = dataNoticia;
    }

    /**
     * @return the subtituloNoticia
     */
    public String getSubtituloNoticia() {
        return subtituloNoticia;
    }

    /**
     * @param subtituloNoticia the subtituloNoticia to set
     */
    public void setSubtituloNoticia(String subtituloNoticia) {
        this.subtituloNoticia = subtituloNoticia;
    }

    /**
     * @return the fotoNoticia
     */
    public String getFotoNoticia() {
        return fotoNoticia;
    }

    /**
     * @param fotoNoticia the fotoNoticia to set
     */
    public void setFotoNoticia(String fotoNoticia) {
        this.fotoNoticia = fotoNoticia;
    }

    /**
     * @return the conteudoNoticia
     */
    public String getConteudoNoticia() {
        return conteudoNoticia;
    }

    /**
     * @param conteudoNoticia the conteudoNoticia to set
     */
    public void setConteudoNoticia(String conteudoNoticia) {
        this.conteudoNoticia = conteudoNoticia;
    }

    /**
     * @return the cidade
     */
    public Cidade getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

 
    
    
    

    


}
