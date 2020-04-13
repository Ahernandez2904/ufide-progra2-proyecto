package proyecto.pkgfinal.progra.ii;

public class adultoException extends Exception {

    public adultoException(int pasaje) {
        pasaje = 0;
    }

    public String toString() {  //mensaje de excepcion, junto con el dato de atributo de clase
        return ("Su pasaje es gratis");
    }

}
