
package seguridad.dominio;

public class AsignacionPerfil {
    
    private int id_usuario;
    private int id_perfil;

    public AsignacionPerfil(int id_usuario, int id_perfil) {
        this.id_usuario = id_usuario;
        this.id_perfil = id_perfil;
    }

    public AsignacionPerfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

        @Override
    public String toString() {
        return "AsignacionPerfil{" + "id_usuario=" + id_usuario + ", id_perfil=" + id_perfil  + '}';
    }
    
   
}
