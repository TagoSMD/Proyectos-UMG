
package seguridad.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import seguridad.dominio.AsignacionPerfil;


public class AsignacionPerfilDAO {
    
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
    private static final String SQL_QUERY = "SELECT id_persona, nombre, apellido, email, telefono FROM persona WHERE id_persona = ?";
    
    public List<AsignacionPerfil> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AsignacionPerfil AsignacionPerfil = null;
        List<AsignacionPerfil> AsignacionPerfiles = new ArrayList<AsignacionPerfil>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                int id_perfil  = rs.getInt("id_perfil");
                
                AsignacionPerfil = new AsignacionPerfil();
                AsignacionPerfil.setId_usuario(id_usuario);
                AsignacionPerfil.setId_perfil(id_perfil);
                
                AsignacionPerfiles.add(AsignacionPerfil);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return AsignacionPerfiles;
    }
    
    public int insert(AsignacionPerfil AsignacionPerfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, AsignacionPerfil.getId_usuario());
            stmt.setInt(2, AsignacionPerfil.getId_perfil());
            
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int update(AsignacionPerfil AsignacionPerfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, AsignacionPerfil.getId_usuario());
            stmt.setInt(2, AsignacionPerfil.getId_perfil());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int delete(AsignacionPerfil AsignacionPerfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, AsignacionPerfil.getId_usuario());
            stmt.setInt(2, AsignacionPerfil.getId_perfil());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
      public int query(AsignacionPerfil AsignacionPerfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
           stmt.setInt(1, AsignacionPerfil.getId_usuario());
            stmt.setInt(2, AsignacionPerfil.getId_perfil());
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                int id_perfil = rs.getInt("id_perfil");
             
                
                AsignacionPerfil = new AsignacionPerfil();
                AsignacionPerfil.setId_usuario(id_usuario);
                AsignacionPerfil.setId_perfil(id_perfil);
        
                rows++;             
            }
            System.out.println("Registros buscado:" + AsignacionPerfil);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    

}
