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
public class Avaliacao {
    private Integer idAvaliacao;
    private String comentarioAvaliacao;
    private Date dataHoraAvaliacao;
    private String notaAvaliacao;
    private Usuario usuario;
    private PontoTuristico pontoTuristico;
}
