/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contur.controller;

import br.com.contur.DAO.NoticiaDAOImpl;
import br.com.contur.DAO.GenericDAO;
import br.com.contur.model.Cidade;
import br.com.contur.model.Noticia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "SalvarNoticia", urlPatterns = {"/SalvarNoticia"})
public class SalvarNoticia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=ISO-8859-1");
        String mensagem = "Problemas ao cadastrar Noticia!";
        Noticia noticia = new Noticia(); 
        noticia.setConteudoNoticia(request.getParameter("conteudonoticia"));
        noticia.setSubtituloNoticia(request.getParameter("subtitulonoticia"));
        noticia.setTituloNoticia(request.getParameter("titulonoticia"));
        noticia.setDataNoticia(request.getParameter("datanoticia"));
        noticia.setFotoNoticia(request.getParameter("fotonoticia"));
        noticia.setCidade(new Cidade(Integer.parseInt(request.getParameter("idcidade"))));
        try {
            GenericDAO dao = new NoticiaDAOImpl();
           if (request.getParameter("idnoticia").equals("")) {
           if (dao.cadastrar(noticia)) {
            mensagem = "Noticia cadastrado com sucesso!";
            } else {
            mensagem = "Problemas ao cadastrar Noticia!";
            }
            } else {
            noticia.setIdNoticia(Integer.parseInt(request.getParameter("idnoticia")));
            if (dao.alterar(noticia)) {
            mensagem = "Noticia alterado com sucesso!";
            } else {
            mensagem = "Problemas ao alterar Noticia!";
            }
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Noticia! Erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            request.setAttribute("resposta",mensagem);
            request.getRequestDispatcher("noticia/salvar.jsp").forward(request, response);
        }
    }
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
