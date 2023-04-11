/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.contur.controller;

import br.com.contur.DAO.GenericDAO;
import br.com.contur.DAO.PontoTuristicoDAOImpl;
import br.com.contur.model.Cidade;
import br.com.contur.model.PontoTuristico;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriela Cristina
 */
@WebServlet(name = "SalvarPontoTuristico", urlPatterns = {"/SalvarPontoTuristico"})
public class SalvarPontoTuristico extends HttpServlet {

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
        
        String mensagem = "Problemas ao cadastrar Ponto Turistico!";
        Cidade cidade = new Cidade();
        
        PontoTuristico pontoTuristico = new PontoTuristico(); 
        pontoTuristico.setNomePontoTuristico(request.getParameter("nomepontoTuristico"));
        pontoTuristico.setDadoPontoTuristico(request.getParameter("dadopontoTuristico"));
        pontoTuristico.setDescricaoPontoTuristico(request.getParameter("descricaoPontoTuristico"));
        cidade.setIdCidade(Integer.parseInt(request.getParameter("cidade")));
        pontoTuristico.setIdCidadePontoTuristico(cidade);
        
        try {
            GenericDAO dao = new PontoTuristicoDAOImpl();
           if (request.getParameter("idpontoTuristico").equals("")) {
           if (dao.cadastrar(pontoTuristico)) {
            mensagem = "PontoTuristico cadastrado com sucesso!";
            } else {
            mensagem = "Problemas ao cadastrar PontoTuristico!";
            }
            } else {
            pontoTuristico.setIdPontoTuristico(Integer.parseInt(request.getParameter("idpontoTuristico")));
            if (dao.alterar(pontoTuristico)) {
            mensagem = "PontoTuristico alterado com sucesso!";
            } else {
            mensagem = "Problemas ao alterar PontoTuristico!";
            }
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar PontoTuristico! Erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            request.setAttribute("resposta",mensagem);
            request.getRequestDispatcher("pontoTuristico/salvar.jsp").forward(request, response);
       
       
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
