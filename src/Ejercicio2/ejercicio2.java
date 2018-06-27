package Ejercicio2;

/**Crea un programa que cuente las vocales de una cadena de caracteres.
*/

public class ejercicio2 {
    static String[] vocales={"a","e","i","o","u"};
    public static void main(String[] args) {
        String cadena="Esta es la cadena que se pondra de muestra para contar sus vocales";
        int numeroVocales = 0;
        for(int i=0; i< cadena.length(); i++){
            cadena.charAt(i);
            switch (cadena.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                numeroVocales++;
                break;
                default:
                continue;
                }
        }

        System.out.println("Hemos encontrado "+ numeroVocales + " vocales en la cadena");
    }
    public static boolean esVocal(String caracter){
        return false;
    }
}
