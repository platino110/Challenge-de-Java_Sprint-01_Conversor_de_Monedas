
package proyectoconversor;

import distancias.distancias;
import javax.swing.JOptionPane;
import monedas.monedas;

public class ProyectoConversor {

    public static void main(String[] args) {
    boolean validacion = true;
    String opcion;
    monedas menuMonedas = new monedas();
    distancias menuDistancias = new distancias();
        while (validacion){
            Object[] valores = {"Conversor de monedas", "Conversor de distancias"};
            try {
            opcion = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion:", "Conversor", JOptionPane.QUESTION_MESSAGE, null, valores, valores[0])).toString();
            if (JOptionPane.OK_OPTION == 0){
                switch(opcion) {
                    case "Conversor de monedas": menuMonedas.menu(); break;
                    case "Conversor de distancias": menuDistancias.menu(); break;
                    }  
                }
            } catch (Exception  e){
                validacion = false;
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            }
        }        
    }
}
