package Ejercicio5;
import javax.swing.*;
import java.lang.*;

/**Crea un programa que te pida dos numeros y despues te diga cual de los dos es mayor.
 */

public class ejercicio5 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"¿Que numeros quieres comparar?","Güindows Server 2018",JOptionPane.QUESTION_MESSAGE);
        String Intronumero1 = JOptionPane.showInputDialog(null,"Introduce un numero, por favor.","Güindows Server 2018",JOptionPane.QUESTION_MESSAGE);
        int numero1 = Integer.parseInt(Intronumero1);
        String Intronumero2 = JOptionPane.showInputDialog(null,"Introduce otro numero, por favor.","Güindows Server 2018",JOptionPane.QUESTION_MESSAGE);
        int numero2 = Integer.parseInt(Intronumero2);
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null,"El numero mayor es: "+numero1,"Güindows Server 2018",JOptionPane.INFORMATION_MESSAGE);
        }
        if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null,"El numero mayor es: "+numero2,"Güindows Server 2018",JOptionPane.INFORMATION_MESSAGE);
            } else if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Error de Güindows Server 2018_Error:_69 Los numeros son iguales, prueba meter los dedos en el enchufe, gracias.", "Error de Güindows Server 2018", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "El programa ha finalizado con exito y sin que nada explote,todo un logro para Sergio, gracias y buen dia.", "Güindows Server 2018", JOptionPane.INFORMATION_MESSAGE);
    }
}
