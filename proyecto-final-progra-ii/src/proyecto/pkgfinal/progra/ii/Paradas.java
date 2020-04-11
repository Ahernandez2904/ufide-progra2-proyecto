package proyecto.pkgfinal.progra.ii;

import java.util.*;

public class Paradas {

    public static void main(String[] args) {
        boolean esAdulto = true;     //esto es de la excepcion
        if (esAdulto) {
            try {
                noCobrar();
            } catch (adultoException e) {
                System.out.println(e);

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
        Scanner scanner = new Scanner(System.in);  //escaner para pedir edad
        System.out.println("Digite la edad del pasajero");
        int edad = Integer.parseInt(scanner.nextLine());
        if (edad >= 65) {
            System.out.println("Su pasaje es gratis");
        } else {
            throw new adultoException(edad);  //se lanza la excepcion

        }

    }

}
