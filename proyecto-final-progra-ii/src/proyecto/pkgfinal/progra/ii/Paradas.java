package proyecto.pkgfinal.progra.ii;

import java.util.*;
import javax.swing.JOptionPane;

public class Paradas {

    public static void main(String[] args) {

        boolean edadAdulto = true;     //esto es de la excepcion
        if (edadAdulto) {
            try {
                noCobrar();
            } catch (adultoException e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }

        HashSet<Rutas> bus = new HashSet();   //aqui empieza lo de las rutas

        //Añade a bus cantidad aleatoriaa de 3 a 5 objetos
        int cantidadRutas = Paradas.randomWithRange(3, 5);
        for (int i = 0; i < cantidadRutas; i++) {
            bus.add(new Rutas(getNombre()));  //para el parámetro del constructor de Ruta 
        }    //imprime cada elemento de Hashset
        for (Rutas SanPedro : bus) {
            System.out.println(SanPedro.toString() + "\n");
        }

    }

    public static String getNombre() {  //funcion nombres aleatorios
        String[] pri = {"San", "Santa", "Santo", "Ana", "Maria", "Ice", "Cat", "Dog"};
        String[] mit = {"Leo", "Lila", "Pol", "Bart", "Rin", "Glo", "Thor", "Moca"};
        String[] ult = {"Nidas", "Rom", "Pom", "Dan", "Lego", "Gil", "Car", "Gen"};
        return pri[randomWithRange(0, pri.length - 1)] + mit[randomWithRange(0, mit.length - 1)] + ult[randomWithRange(0, ult.length - 1)];

    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    private static void noCobrar() throws adultoException {  //poner excepcion que creamos
        int opc1;
        int pasaje = 600;
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del pasajero"));//pedir edad
        if (edad >= 65) {
            throw new adultoException(edad);//se lanza la excepcion
        } else if (edad <= 12) {
            JOptionPane.showMessageDialog(null, "Menor de edad, Pasaje: " + pasaje / 2);
        } else {
        
        JOptionPane.showMessageDialog(null, "Pasaje: " + pasaje);
        }
        opc1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "******\n\n"
                + "1.Ver otra edad\n"
                + "2.Menu principal\n"
                + "\n\nDigite su opción:"));
        switch (opc1) {
            case 1:
                noCobrar();
                break;
            case 2:
                PantallaPrincipal pp = new PantallaPrincipal();
                break;
            default: {
                JOptionPane.showMessageDialog(null,
                        "¡Opción incorrecta!");

            }
        }

    }
}
