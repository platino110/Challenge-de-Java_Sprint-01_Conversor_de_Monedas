
package distancias;

import javax.swing.JOptionPane;

public class distancias {
    boolean validacion = true;
    conversorDistancias distancias = new conversorDistancias();
    Object[] valores = {"Metros a Kilometros","Metros a Centimetros","Metros a Millas","Metros a Millas nauticas",
            "Kilometros a Metros","Centimetros a Metros","Millas a Metros","Millas nauticas a Metros",};
    
        public void menu() {
        validacion = true; 
        while (validacion){
        String opcion = (JOptionPane.showInputDialog(null, "Seleccione una opcion:", "Conversor de distancias", 
        JOptionPane.QUESTION_MESSAGE, null, valores, valores[0])).toString();
        String valor = JOptionPane.showInputDialog("Ingrese la distancia que desea convertir: ");
        if(validar(valor) == true) {
            double valorDistancia = Double.parseDouble(valor);
            switch(opcion) {
                case "Metros a Kilometros":distancias.metrosaKilometros(valorDistancia); break;
                case "Metros a Centimetros":distancias.metrosaCentimetros(valorDistancia); break;
                case "Metros a Millas":distancias.metrosaMillas(valorDistancia); ; break;
                case "Metros a Millas nauticas":distancias.metrosaMillasNauticas(valorDistancia); break;
                case "Kilometros a Metros":distancias.kilometrosaMetros(valorDistancia); break;    	    	                          
                case "Centimetros a Metros":distancias.centimetrosaMetros(valorDistancia); break;
                case "Millas a Metros":distancias.millasaMetros(valorDistancia); break;
                case "Millas nauticas a Metros":distancias.millasNauticasaMetros(valorDistancia); break;
                }   
            int respuesta = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión de distancias?");
            if (JOptionPane.OK_OPTION == respuesta) {
            }
            if (JOptionPane.CANCEL_OPTION == respuesta || JOptionPane.NO_OPTION == respuesta){
                JOptionPane.showMessageDialog(null, "Conversor de distancias terminado"); 
                validacion =false;
            }
            }else{
                JOptionPane.showMessageDialog(null, "Digite un valor numerico valido");                
                }
            }
        }
        
    public static boolean validar(String valor) {
        try {
        double moneda = Double.parseDouble(valor);
        if(moneda>=0||moneda<0);
            return true;
        } catch (NumberFormatException error) {
            return false;
        }
    }
    
}
