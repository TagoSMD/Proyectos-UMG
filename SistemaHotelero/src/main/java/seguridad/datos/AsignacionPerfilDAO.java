
package seguridad.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import seguridad.dominio.AsignacionPerfil;


    
public class AsignacionPerfilDAO {
        private static final String SQL_SELECT = "SELECT PK_id_usuario, nombre_usuario, apellido_usuarios, estado_usuario FROM tbl_usuario";  
    private static final String SQL_QUERY = "SELECT * FROM Pk_id_perfil";
    
    public List<AsignacionPerfil> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AsignacionPerfil usuarios = null;
        List<AsignacionPerfil> usuario = new ArrayList<AsignacionPerfil>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                String PK_id_usuario = rs.getString("PK_id_usuario");
             
                int Pk_id_perfil = rs.getInt("Pk_id_perfil");
                
                usuarios = new AsignacionPerfil();
                usuarios.setId_perfil(Pk_id_perfil);
                usuarios.setId_usuario(PK_id_usuario);
          
                
                
                usuario.add(usuarios);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return usuario;
        
    }
    
    

}
