
package seguridad.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import seguridad.dominio.AsignacionPerfil;


    
public class AsignacionPerfilDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    AsignacionPerfil p = new AsignacionPerfil();

    public List listar() {
        List<AsignacionPerfil> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from persona");
            rs = ps.executeQuery();
            while (rs.next()) {
                AsignacionPerfil p = new AsignacionPerfil();

                p.setId_perfil(rs.getInt(1));
                p.setId_usuario(rs.getInt(2));

                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    public int agregar(AsignacionPerfil per) {  
        int r=0;
        String sql="insert into persona(Nombres,Correo,Telefono)values(?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setInt(1,per.getId_perfil());
            ps.setInt(2,per.getId_usuario());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r;
    }
    public int Actualizar(AsignacionPerfil per) {  
        int r=0;
        String sql="update persona set Nombres=?,Correo=?,Telefono=? where Id=?";        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
           ps.setInt(1,per.getId_perfil());
            ps.setInt(2,per.getId_usuario());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r;
    }
    public int Delete(int id){
        int r=0;
        String sql="delete from boleta where Id="+id;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}

