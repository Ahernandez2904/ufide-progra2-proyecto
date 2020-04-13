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
  
    private int precioPasaje = 0;
    
    public NinoPequenoException(int pasaje){
        precioPasaje = (pasaje/2);
    }
    
    @Override
    public String toString(){
        return "NinoPequenoException "
                + "Debido a la edad del pasajero se aplicara un descuento del 50%, siendo el precio del pasaje de "+ precioPasaje;
    }
       
}




