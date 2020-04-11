package proyecto.pkgfinal.progra.ii;

import java.util.*;

public class Rutas {

    private String ID;
    private ArrayDeque<Bus> buses;

    public Rutas(String ID) {
        this.ID = ID;
        buses = new ArrayDeque<>(); //Instanciar el ArrayDeque

        int cantidadBuses = Paradas.randomWithRange(1, 3);

        for (int i = 0; i < cantidadBuses; i++) {  //llenado buses*
            String nombre = ID + i;
            String parada1 = Paradas.getNombre(); //funcion publica getNombre para realizar nombres aleatorios 
            String parada2 = Paradas.getNombre();
            String parada3 = Paradas.getNombre();
            Bus numeroBus = new Bus(nombre, parada1);
            buses.add(numeroBus);
        }

    }

    @Override                    //estado del objeto segun el valor de los atributos de clase
    public String toString() {
        return "Rutas{" + "ID=" + ID + ", buses=" + buses + '}';
    }

}
