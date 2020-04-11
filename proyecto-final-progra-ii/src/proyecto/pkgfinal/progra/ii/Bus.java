/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.progra.ii;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Bus {
    
    protected String placa, marca, choferAsignado;
    
    public Bus(String placaCons, String marcaCons, String choferAsignadoCons){
        //Cons = Constructor o del constructor
        placa = placaCons;
        marca = marcaCons;
        choferAsignado = choferAsignadoCons;
    }
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList getChofer() {
        return chofer;
    }

    public void setChofer(LinkedList chofer) {
        this.chofer = chofer;
    }

    private String nombre;

    private LinkedList chofer = new LinkedList();

    public Bus(String nombre, String p1) {
        this.nombre = nombre;
        chofer.add(p1);

    }

    public boolean agregar(String personal) {   //Agregar chofer
        return chofer.add(personal);

    }

    public boolean remover(String personal) {  //Remover personal
        return chofer.add(personal);

    }

    public void vaciar(String personal) {     //Vaciar lista
        chofer.clear();

    }

    @Override
    public String toString() {
        return "Bus{" + "Ruta=" + nombre + ", chofer=" + chofer + '}';
    }

}
