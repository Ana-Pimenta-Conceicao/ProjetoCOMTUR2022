/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contur.DAO;

import br.com.contur.model.Cidade;
import br.com.contur.model.PontoTuristico;
import br.com.contur.model.TipoEvento;
import br.com.contur.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aninh
 */
public class PontoTuristicoDAOImpl implements GenericDAO {
    private Connection conn;
    
    public PontoTuristicoDAOImpl () throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    @Override
    public Boolean cadastrar(Object object) {
         PontoTuristico pontoTuristico = (PontoTuristico) object;
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO pontoTuristico(nome_pontoTuristico, dado_pontoTuristico, descricao_PontoTuristico, id_cidadePontoTuristico) VALUES (?, ?, ?, ?);";
        
        try {   
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pontoTuristico.getNomePontoTuristico());
            stmt.setString(2, pontoTuristico.getDadoPontoTuristico());
            stmt.setString(3, pontoTuristico.getDescricaoPontoTuristico());
            stmt.setInt(6, pontoTuristico.getIdCidadePontoTuristico().getIdCidade());
            stmt.executeUpdate();
            return true;            
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar PontoTuristico! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally{
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
     List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql ="SELECT t.* FROM tipoEvento t ORDER BY c.tipoEvento;";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                TipoEvento tipoEvento = new TipoEvento();
                tipoEvento.setIdTipoEvento(rs.getInt("id_tipoEvento"));
                tipoEvento.setNomeTipoEvento(rs.getString("nome_tipoEvento"));
                
                resultado.add(tipoEvento);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar TipoEvento! Erro: " + ex.getMessage());
            ex.printStackTrace();
            
        }finally{
            try {
                ConnectionFactory.closeConnection(conn,stmt,rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;  
    }

    @Override
    public void excluir(int idObject) {
  PreparedStatement stmt = null;
        String sql = "DELETE FROM tipoEvento WHERE id_tipoEvento=?";
     try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
     }catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar TipoEvento! Erro: " + ex.getMessage());
            ex.printStackTrace();
     }finally{
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
     }      }

    @Override
    public Object carregar(int idObject) {
        TipoEvento tipoEvento = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT t.* FROM tipoEvento t WHERE t.id_tipoEvento = ?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()){
                tipoEvento = new TipoEvento();
                tipoEvento.setIdTipoEvento(rs.getInt("id_tipoEvento"));
                tipoEvento.setNomeTipoEvento(rs.getString("nome_tipoEvento"));
                
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar tipoEvento! Erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return tipoEvento;    }

    @Override
    public Boolean alterar(Object object) {
TipoEvento tipoEvento = (TipoEvento) object;
        PreparedStatement stmt = null;
        
    String sql = "UPDATE tipoEvento SET nome_tipoEvento=? WHERE id_tipoEvento=?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, tipoEvento.getNomeTipoEvento());
            stmt.setInt(2, tipoEvento.getIdTipoEvento());
            stmt.executeUpdate();
            return true;    
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao Alterar tipoEvento! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally{
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }     }
    
}
