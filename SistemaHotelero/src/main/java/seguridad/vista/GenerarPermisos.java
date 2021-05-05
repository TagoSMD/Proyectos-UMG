package seguridad.vista;

import Finanzas.vista.*;
import Comercial.vista.*;
import Hoteleria.vista.*;
import java.net.UnknownHostException;
import seguridad.dominio.Permisos;

/**
 *
 * @author Diego Vásquez
 */
public class GenerarPermisos {

    Permisos ejecutarPermisos = new Permisos();

    public void getPermisos(String modulo, String usuario) {
        try {
            if (modulo == "Seguridad") {

                MDI_Sistema.JMenu_Mantenimientos.setVisible(false);
                MDI_Sistema.JMenuItem_Usuarios.setVisible(false);
                MDI_Sistema.JMenuItem_Aplicaciones.setVisible(false);
                MDI_Sistema.JMenu_Asignaciones.setVisible(false);
                MDI_Sistema.JMenuItem_Perfiles.setVisible(false);
                MDI_Sistema.JMenuItem_Modulos.setVisible(false);
                MDI_Sistema.JMenuItem_AplicacionesUsuario.setVisible(false);
                MDI_Sistema.JMenuItem_Bitacora.setVisible(false);

                ejecutarPermisos.ejecutarBusqueda(usuario);

                for (int i = 0; i < ejecutarPermisos.getAplicaciones().length; i++) {
                    int varApp = Integer.parseInt(ejecutarPermisos.getAplicaciones()[i]);
                    if (varApp >= 10 && varApp <= 99) {
                        MDI_Sistema.JMenu_Mantenimientos.setVisible(true);
                        switch (varApp) {
                            case 10:
                                MDI_Sistema.JMenuItem_Usuarios.setVisible(true);
                                break;
                            case 20:
                                break;
                        }
                    }
                    if (varApp >= 100 && varApp <= 199) {
                        MDI_Sistema.JMenu_Asignaciones.setVisible(true);
                        switch (varApp) {
                            case 100:
                                break;
                            case 200:
                                break;
                        }
                    }

                }
            }
            if (modulo == "Finanzas") {

                MDIFinanzas.JMenuCatalogos.setEnabled(false);
                MDIFinanzas.JMenuProcesos.setEnabled(false);
                MDIFinanzas.JMenuInformes.setEnabled(false);
                MDIFinanzas.JMenuClasificacionCuentas.setEnabled(false);
                MDIFinanzas.JMenuPeriodoFiscal.setEnabled(false);
                MDIFinanzas.JMenuTipoTransaccion.setEnabled(false);
                MDIFinanzas.JMenuCuentasContables.setEnabled(false);
                MDIFinanzas.JMenuTipoAsientoContable.setEnabled(false);
                MDIFinanzas.JMenuDivisas.setEnabled(false);
                MDIFinanzas.JMenuCuentaBancaria.setEnabled(false);
                MDIFinanzas.JMenuPersonaBancaria.setEnabled(false);
                MDIFinanzas.JMenuBancos.setEnabled(false);
                MDIFinanzas.JMenuCuentahabiente.setEnabled(false);

                ejecutarPermisos.ejecutarBusqueda(usuario);

                for (int i = 0; i < ejecutarPermisos.getAplicaciones().length; i++) {

                    int varApp = Integer.parseInt(ejecutarPermisos.getAplicaciones()[i]);

                    if (varApp >= 1000 && varApp <= 1100) {
                        MDIFinanzas.JMenuCatalogos.setEnabled(true);
                        switch (varApp) {
                            case 1000:
                                MDIFinanzas.JMenuClasificacionCuentas.setEnabled(true);
                                break;
                            case 1001:
                                MDIFinanzas.JMenuPeriodoFiscal.setEnabled(true);
                                break;
                            case 1002:
                                MDIFinanzas.JMenuTipoTransaccion.setEnabled(true);
                                break;
                            case 1003:
                                MDIFinanzas.JMenuCuentasContables.setEnabled(true);
                                break;
                            case 1004:
                                MDIFinanzas.JMenuTipoAsientoContable.setEnabled(true);
                                break;
                            case 1005:
                                MDIFinanzas.JMenuDivisas.setEnabled(true);
                                break;
                            case 1006:
                                MDIFinanzas.JMenuCuentaBancaria.setEnabled(true);
                                break;
                            case 1007:
                                MDIFinanzas.JMenuPersonaBancaria.setEnabled(true);
                                break;
                            case 1008:
                                MDIFinanzas.JMenuBancos.setEnabled(true);
                                break;
                            case 1009:
                                MDIFinanzas.JMenuCuentahabiente.setEnabled(true);
                                break;
                        }
                    }
                    if (varApp >= 1101 && varApp <= 1200) {
                        MDIFinanzas.JMenuProcesos.setEnabled(true);
                        //PENDIENTE PARA TRANSACCIONALES
                    }
                    if (varApp >= 1201 && varApp <= 1300) {
                        MDIFinanzas.JMenuInformes.setEnabled(false);
                        //PENDIENTE PARA REPORTERÍA
                    }
                }
            }
            if (modulo == "Hotelero") {
                MDIHoteleria.menu_archivo.setVisible(true);
                MDIHoteleria.menu_ayuda.setVisible(true);
                MDIHoteleria.menu_catalogos.setVisible(true);
                MDIHoteleria.menu_herramientas.setVisible(true);
                MDIHoteleria.menu_informes.setVisible(true);
                MDIHoteleria.menu_procesos.setVisible(true);
                MDIHoteleria.cerrar_sesion.setVisible(true);
                ejecutarPermisos.ejecutarBusqueda(usuario);
                for (int i = 0; i < ejecutarPermisos.getAplicaciones().length; i++) {
                    int varApp = Integer.parseInt(ejecutarPermisos.getAplicaciones()[i]);
                    System.out.println(varApp);
                    if (varApp >= 2001 && varApp <= 2200) {
                        MDIHoteleria.menu_archivo.setVisible(true);
                        MDIHoteleria.menu_catalogos.setVisible(true);
                        MDIHoteleria.submenu_mantenimientos.setVisible(true);
                        switch (varApp) {
                            case 2001:MDIHoteleria.mnt_amadellaves.setVisible(true);break;
                            case 2002:MDIHoteleria.mnt_formasdepago.setVisible(true);break;
                            case 2003:MDIHoteleria.mnt_habitaciones.setVisible(true);break;
                            case 2004:MDIHoteleria.mnt_huespedes.setVisible(true);break;
                            case 2005:MDIHoteleria.mnt_pisos.setVisible(true);break;
                            case 2006:MDIHoteleria.mnt_servicios.setVisible(true);break;
                            default:    
                        }
                    }
                    if (varApp >= 2201 && varApp <= 2400) {
                        MDIHoteleria.menu_procesos.setVisible(true);
                        switch (varApp) {
                            case 2201:
                            case 2300:
                            case 2400:
                                MDIHoteleria.submenu_procesos.setVisible(true);
                                break;
                        }
                    }
                }
            }
            if (modulo == "Comercial") {

            }
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }

    public String[] getAccionesAplicacion(int codigoAplicacion, String usuario) {
        ejecutarPermisos.ejecutarBusqueda(usuario);
        String[] matrixPermisos = new String[5];
        for (int i = 0; i < 5; i++) {
            matrixPermisos[i] = ejecutarPermisos.getPermisosApps(codigoAplicacion)[i];
        }
        return matrixPermisos;
    }
}
