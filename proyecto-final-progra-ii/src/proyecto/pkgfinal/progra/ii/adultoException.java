package proyecto.pkgfinal.progra.ii;

public class adultoException extends Exception {

    private int edadAdulto;
    private int precioPasaje = 600;

    public adultoException(int edadAdulto) {
        precioPasaje = 0;
    }

    public String toString() {  //mensaje de excepcion, junto con el dato de atributo de clase
        return ("Edad necesita ser mayor de 65 años:" + edadAdulto + " años, deberá pagar: " + precioPasaje);
    }

}
