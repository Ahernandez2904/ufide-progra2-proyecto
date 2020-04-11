package proyecto.pkgfinal.progra.ii;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E1287240
 */
public class NinoPequenoException extends Exception{
  
    private int EdadNino;
    private int precioPasaje = 600;
    
    public NinoPequenoException(int EdadNino){
        precioPasaje = (precioPasaje/2);
    }
    
    @Override
    public String toString(){
        return "NinoPequenoException "
                + "Debido a la edad del pasajero se aplicara un descuento del 50%, siendo el precio del pasaje de "+ precioPasaje;
    }
       
}




