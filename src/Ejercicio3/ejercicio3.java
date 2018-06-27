package Ejercicio3;

/**Crea una cadena de caracteres y mediante el metodo indexOf inserta una barra / adiccional.
 */

public class ejercicio3 {
    public static void main(String[] args) {
        String cadena= " Esto es una cadena para hacer el ejercicio.";
        cadena = cadena.replace(" ","/");
        System.out.println(cadena);
    }
}
