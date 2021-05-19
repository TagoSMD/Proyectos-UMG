
package Finanzas.dominio;

/**
 * 
 * @author Santiago Martinez Diaz
 */
public class CuentaHabiente {
  private String Codigo_CuentaHabiente;
  private String Nombre_CuentaHabiente;
  private String ApellidoP_CuentaHabiente;       
  private String ApellidoM_CuentaHabiente;
  private String TipoPersona_CuentaHabiente; 
  private String Saldo_Disponible;

    public CuentaHabiente() {
    }

    public CuentaHabiente(String Codigo_CuentaHabiente, String Nombre_CuentaHabiente, String ApellidoP_CuentaHabiente, String ApellidoM_CuentaHabiente, String TipoPersona_CuentaHabiente, String Saldo_Disponible) {
        this.Codigo_CuentaHabiente = Codigo_CuentaHabiente;
        this.Nombre_CuentaHabiente = Nombre_CuentaHabiente;
        this.ApellidoP_CuentaHabiente = ApellidoP_CuentaHabiente;
        this.ApellidoM_CuentaHabiente = ApellidoM_CuentaHabiente;
        this.TipoPersona_CuentaHabiente = TipoPersona_CuentaHabiente;
        this.Saldo_Disponible = Saldo_Disponible;
    }

    public String getCodigo_CuentaHabiente() {
        return Codigo_CuentaHabiente;
    }

    public void setCodigo_CuentaHabiente(String Codigo_CuentaHabiente) {
        this.Codigo_CuentaHabiente = Codigo_CuentaHabiente;
    }

    public String getNombre_CuentaHabiente() {
        return Nombre_CuentaHabiente;
    }

    public void setNombre_CuentaHabiente(String Nombre_CuentaHabiente) {
        this.Nombre_CuentaHabiente = Nombre_CuentaHabiente;
    }

    public String getApellidoP_CuentaHabiente() {
        return ApellidoP_CuentaHabiente;
    }

    public void setApellidoP_CuentaHabiente(String ApellidoP_CuentaHabiente) {
        this.ApellidoP_CuentaHabiente = ApellidoP_CuentaHabiente;
    }

    public String getApellidoM_CuentaHabiente() {
        return ApellidoM_CuentaHabiente;
    }

    public void setApellidoM_CuentaHabiente(String ApellidoM_CuentaHabiente) {
        this.ApellidoM_CuentaHabiente = ApellidoM_CuentaHabiente;
    }

    public String getTipoPersona_CuentaHabiente() {
        return TipoPersona_CuentaHabiente;
    }

    public void setTipoPersona_CuentaHabiente(String TipoPersona_CuentaHabiente) {
        this.TipoPersona_CuentaHabiente = TipoPersona_CuentaHabiente;
    }

    public String getSaldo_Disponible() {
        return Saldo_Disponible;
    }

    public void setSaldo_Disponible(String Saldo_Disponible) {
        this.Saldo_Disponible = Saldo_Disponible;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "Codigo_CuentaHabiente=" + Codigo_CuentaHabiente + ", Nombre_CuentaHabiente=" + Nombre_CuentaHabiente + ", ApellidoP_CuentaHabiente=" + ApellidoP_CuentaHabiente + ", ApellidoM_CuentaHabiente=" + ApellidoM_CuentaHabiente + ", TipoPersona_CuentaHabiente=" + TipoPersona_CuentaHabiente + ", Saldo_Disponible=" + Saldo_Disponible + '}';
    }

  
}
