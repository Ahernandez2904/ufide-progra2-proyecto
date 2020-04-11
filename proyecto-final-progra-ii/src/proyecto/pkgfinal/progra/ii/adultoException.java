package proyecto.pkgfinal.progra.ii;

public class adultoException extends Exception {

    private int edad;
    private int pasaje = 365;

    public adultoException(int gratis) {
        edad = gratis;
    }

    public String toString() {  //mensaje de excepcion, junto con el dato de atributo de clase
        return ("Edad necesita ser mayor de 65 años:" + edad + " años, deberá pagar: " + pasaje);
    }

}
