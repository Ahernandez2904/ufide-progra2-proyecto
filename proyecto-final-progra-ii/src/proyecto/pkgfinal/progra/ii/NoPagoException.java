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
    
    public NoPagoException(int pasaje){
        pasajeLocal = pasaje;
        dineroRecaudadoLocal = 0;
    }

    NoPagoException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "No se le rebajará el dinero al chofér. \n\nNuevo total recaudado: " + dineroRecaudadoLocal
                 + "\nPasaje:" + pasajeLocal;
    }
    
}
