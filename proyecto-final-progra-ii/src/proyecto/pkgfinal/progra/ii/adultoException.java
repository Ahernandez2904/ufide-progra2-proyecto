package proyecto.pkgfinal.progra.ii;

public class adultoException extends Exception {

    private int edadAdulto;
    private int precioPasaje = 600;

    public adultoException(int edadAdulto) {
        precioPasaje = precioPasaje-precioPasaje;
    }

    public String toString() {  //mensaje de excepcion, junto con el dato de atributo de clase
        return ("Su pasaje es gratis");
    }

}
