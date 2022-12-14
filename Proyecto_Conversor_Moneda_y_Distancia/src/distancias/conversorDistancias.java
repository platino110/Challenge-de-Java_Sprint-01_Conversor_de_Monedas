
package distancias;

import javax.swing.JOptionPane;

public class conversorDistancias {
    Double valor;
    Double millas = 1609.34;
    Double millasNauticas = 1852.00;
    
        public void metrosaKilometros(double cantidad) {
            valor = cantidad/1000;
            JOptionPane.showMessageDialog(null, cantidad + " Metros corresponden a " + String.format("%.4f",valor) + " Kilometros");
	}
	
	public void metrosaCentimetros(double cantidad) {
            valor = cantidad*100;
            JOptionPane.showMessageDialog(null, cantidad + " Metros corresponden a " + String.format("%.4f",valor) + " Centimetros");
	}
	
	public void metrosaMillas(double cantidad) {
            valor = cantidad/millas;
            JOptionPane.showMessageDialog(null, cantidad + " Metros corresponden a " + String.format("%.4f",valor) + " Millas");
	}
	
	public void metrosaMillasNauticas(double cantidad) {
            valor = cantidad/millasNauticas;
            JOptionPane.showMessageDialog(null, cantidad + " Metros corresponden a " + String.format("%.4f",valor) + " Millas nauticas");
	}
	
	public void kilometrosaMetros(double cantidad) {
            valor = cantidad*1000;
            JOptionPane.showMessageDialog(null, cantidad + " kilometros corresponden a " + String.format("%.4f",valor) + " Metros");
	}
        
        public void centimetrosaMetros(double cantidad) {
            valor = cantidad/100;
            JOptionPane.showMessageDialog(null, cantidad + " Centimetros corresponden a " + String.format("%.4f",valor) + " Metros");
	}
	
	public void millasaMetros(double cantidad) {
            valor = cantidad*millas;
            JOptionPane.showMessageDialog(null, cantidad + " Millas corresponden a " + String.format("%.4f",valor) + " Metros");
	}
	
	public void millasNauticasaMetros(double cantidad) {
            valor = cantidad*millasNauticas;
            JOptionPane.showMessageDialog(null, cantidad + " Millas Nauticas corresponden a " + String.format("%.4f",valor) + " Metros");
	}   
}
