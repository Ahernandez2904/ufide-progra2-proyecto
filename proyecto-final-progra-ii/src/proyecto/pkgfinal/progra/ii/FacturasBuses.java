package proyecto.pkgfinal.progra.ii;


import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

public class FacturasBuses implements Serializable{
    
    private String nombreChofer;
    private String nombrePasajero;
    private String EdadPasajero;
    private int montoPasaje;
    private String IDRuta;
    private String Fecha;
   
    
    public FacturasBuses(String nombreChofer, String IDRuta, String EdadPasajero,int montoPasaje, String Fecha){
      this.nombreChofer = nombreChofer;
      this.EdadPasajero = EdadPasajero;
      this.montoPasaje = montoPasaje;
      this.IDRuta = IDRuta;
      this.Fecha = Fecha;
    }
    
     public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }
    
    public String getNombreChofer() {
        return nombreChofer;
    }

    public void setNombreChofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }

    public String getEdadPasajero() {
        return EdadPasajero;
    }

    public void setEdadPasajero(String EdadPasajero) {
        this.EdadPasajero = EdadPasajero;
    }

    public int getMontoPasaje() {
        return montoPasaje;
    }

    public void setMontoPasaje(int montoPasaje) {
        this.montoPasaje = montoPasaje;
    }

    public String getIDRuta() {
        return IDRuta;
    }

    public void setIDRuta(String IDRuta) {
        this.IDRuta = IDRuta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    

    
  
    
}
