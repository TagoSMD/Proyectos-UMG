
package seguridad.vista;

import java.util.List;
import seguridad.datos.AsignacionPerfilDAO;
import seguridad.dominio.AsignacionPerfil;

public class AsignacionPerfilUsuario {
    
public static void main(String[] args) {
        AsignacionPerfil AsignacionPerfilDAO = new AsignacionPerfil();
        List<Usuario> usuarios = AsignacionPerfilDAO.select();
        for(Usuario usuario: usuarios){
            System.out.println("Usuario:" + usuario);
        }
        
        //nsertamos un nuevo usuario
      Usuario usuario = new Usuario("Santiago", "122342342343");
      usuarioDAO.insert(usuario);

        usuarioDAO.delete(new Usuario(3));
    }
}