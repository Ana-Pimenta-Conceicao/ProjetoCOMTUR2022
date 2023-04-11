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
public class Parceiro {
    private Integer idParceiro;
    private String nomeParceiro;
    private String descricaoParceiro;
    private String LogoParceiro;
    private Cidade cidade;
    private String Telefone;

    /**
     * @return the idParceiro
     */
    public Integer getIdParceiro() {
        return idParceiro;
    }

    /**
     * @param idParceiro the idParceiro to set
     */
    public void setIdParceiro(Integer idParceiro) {
        this.idParceiro = idParceiro;
    }

    /**
     * @return the nomeParceiro
     */
    public String getNomeParceiro() {
        return nomeParceiro;
    }

    /**
     * @param nomeParceiro the nomeParceiro to set
     */
    public void setNomeParceiro(String nomeParceiro) {
        this.nomeParceiro = nomeParceiro;
    }

    /**
     * @return the descricaoParceiro
     */
    public String getDescricaoParceiro() {
        return descricaoParceiro;
    }

    /**
     * @param descricaoParceiro the descricaoParceiro to set
     */
    public void setDescricaoParceiro(String descricaoParceiro) {
        this.descricaoParceiro = descricaoParceiro;
    }

    /**
     * @return the LogoParceiro
     */
    public String getLogoParceiro() {
        return LogoParceiro;
    }

    /**
     * @param LogoParceiro the LogoParceiro to set
     */
    public void setLogoParceiro(String LogoParceiro) {
        this.LogoParceiro = LogoParceiro;
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

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
}
