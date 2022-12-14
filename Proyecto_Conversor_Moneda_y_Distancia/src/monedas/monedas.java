
package monedas;

import javax.swing.JOptionPane;

public class monedas {
    boolean validacion = true;
    conversorMonedas moneda = new conversorMonedas();
    Object[] valores = {"Pesos a Dolar","Pesos a Euro","Pesos a Libras Esterlinas","Pesos a Yen Japones",
            "Pesos a Won Surcoreano","Dolar a Pesos","Euro a Pesos","Libras Esterlinas a Pesos",
            "Yen Japones a Pesos","Won Surcoreano a Pesos"};
    
    public void menu() {
        validacion = true; 
        while (validacion){
        String opcion = (JOptionPane.showInputDialog(null, "Seleccione la opcion:", "Conversor de monedas", 
        JOptionPane.QUESTION_MESSAGE, null, valores, valores[0])).toString();
        String valor = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
        if(validar(valor) == true) {
            double valorMoneda = Double.parseDouble(valor);
            switch(opcion) {
                case "Pesos a Dolar": moneda.pesosaDolares(valorMoneda); break;
                case "Pesos a Euro": moneda.pesosaEuros(valorMoneda); break;
                case "Pesos a Libras Esterlinas": moneda.pesosaLibras(valorMoneda); break;
                case "Pesos a Yen Japones": moneda.pesosaYen(valorMoneda); break;
                case "Pesos a Won Surcoreano": moneda.pesosaWon(valorMoneda); break;    	    	                          
                case "Dolar a Pesos": moneda.dolaraPesos(valorMoneda); break;
                case "Euro a Pesos": moneda.eurosaPesos(valorMoneda); break;
                case "Libras Esterlinas a Pesos": moneda.librasaPesos(valorMoneda); break;
                case "Yen Japones a Pesos": moneda.yenaPesos(valorMoneda); break;
                case "Won Surcoreano a Pesos": moneda.wonaPesos(valorMoneda); break;
                }   
            int respuesta = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión de monedas?");
            if (JOptionPane.OK_OPTION == respuesta) {
            }
            if (JOptionPane.CANCEL_OPTION == respuesta || JOptionPane.NO_OPTION == respuesta){
                JOptionPane.showMessageDialog(null, "Conversor de monedas terminado"); 
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
