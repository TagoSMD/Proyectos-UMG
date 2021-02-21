
package seguridad.dominio;

public class AsignacionPerfil {
    
    private String id_usuario;
    private int id_perfil;

    public AsignacionPerfil() {
    }

    public AsignacionPerfil(String id_usuario, int id_perfil) {
        this.id_usuario = id_usuario;
        this.id_perfil = id_perfil;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
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
