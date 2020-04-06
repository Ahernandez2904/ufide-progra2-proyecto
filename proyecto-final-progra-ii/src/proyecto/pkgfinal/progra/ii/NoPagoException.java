/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.progra.ii;

public class NoPagoException extends Exception {
   
    private int nuevoTotal;
    private int dineroRecaudadoLocal;
    private int pasajeLocal;
    
    public NoPagoException(int dineroRecaudado, int pasaje){
        nuevoTotal = dineroRecaudado - pasaje;
        pasajeLocal = pasaje;
        dineroRecaudadoLocal = dineroRecaudado;
    }
    
    @Override
    public String toString(){
        return "No se le rebajará el dinero al chofér. Nuevo total recaudado: " + nuevoTotal
                + "Total anterior recaudado: " + dineroRecaudadoLocal + "Pasaje:" + pasajeLocal;
    }
    
}
