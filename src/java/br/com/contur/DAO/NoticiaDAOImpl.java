/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contur.DAO;

import br.com.contur.model.Noticia;
import br.com.contur.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aninh
 */
public class NoticiaDAOImpl implements GenericDAO {
    private Connection conn;
    
    public NoticiaDAOImpl () throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    @Override
    public Boolean cadastrar(Object object) {
        /**private Integer idNoticia;
    private String ufNoticia;
    private String nomeNoticia;**/
        
    Noticia noticia = (Noticia) object;
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO noticia(conteudo_noticia, subtitulo_noticia, titulo_noticia, data_noticia, foto_noticia, id_cidade) VALUES (?, ?, ?, ?, ?, ?);";
           
  
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, noticia.getConteudoNoticia());
            stmt.setString(2, noticia.getSubtituloNoticia());
            stmt.setString(3, noticia.getTituloNoticia());
            stmt.setDate(4, (Date) noticia.getDataNoticia());
            stmt.setString(5, noticia.getFotoNoticia());
            stmt.setInt(6, noticia.getCidade().getIdCidade());
            stmt.executeUpdate();
            return true;            
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Noticia! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally{
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }      }

    @Override
    public List<Object> listar() {
     List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql ="SELECT c.* FROM noticia c ORDER BY c.nome_noticia;";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Noticia noticia = new Noticia();
                noticia.setIdNoticia(rs.getInt("id_noticia"));
                noticia.setNomeNoticia(rs.getString("nome_noticia"));
                noticia.setUfNoticia(rs.getString("uf_noticia"));
                resultado.add(noticia);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Noticias! Erro: " + ex.getMessage());
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
        String sql = "DELETE FROM noticia WHERE id_noticia=?";
     try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
     }catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Noticia! Erro: " + ex.getMessage());
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
        Noticia noticia = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT c.* FROM noticia c WHERE c.id_noticia = ?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()){
                noticia = new Noticia();
                noticia.setIdNoticia(rs.getInt("id_genero"));
                noticia.setConteudoNoticia(rs.getString("conteudo_noticia"));
                noticia.setSubtituloNoticia(rs.getString("subtitulo_noticia"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Noticia! Erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally{
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return noticia;    }

    @Override
    public Boolean alterar(Object object) {
Noticia noticia = (Noticia) object;
        PreparedStatement stmt = null;
        
    String sql = "UPDATE noticia SET nome_noticia=?, uf_noticia=? WHERE id_noticia=?;";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, noticia.getConteudoNoticia());
            stmt.setString(2, noticia.getSubtituloNoticia());
            stmt.setString(3, noticia.getTituloNoticia());
            stmt.setDate(4, (Date) noticia.getDataNoticia());
            stmt.setString(5, noticia.getFotoNoticia());
            stmt.setInt(6, noticia.getCidade().getIdCidade());
            stmt.executeUpdate();
            return true;    
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao Alterar Noticia! Erro: " + ex.getMessage());
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
