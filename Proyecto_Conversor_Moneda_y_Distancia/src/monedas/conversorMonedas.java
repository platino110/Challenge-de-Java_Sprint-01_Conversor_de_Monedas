package monedas;

import javax.swing.JOptionPane;

public class conversorMonedas {
    Double valor;
    Double dolar = 4821.86;
    Double euro = 5106.91;
    Double libra = 5942.37;
    Double yen = 35.17;
    Double won = 3.70;
    
    	public void pesosaDolares(double cantidad) {
            valor = cantidad/dolar;
            JOptionPane.showMessageDialog(null, cantidad + " Pesos corresponden a " + String.format("%.2f",valor) + " Dolares");
	}
	
	public void pesosaEuros(double cantidad) {
            valor = cantidad/euro;
            JOptionPane.showMessageDialog(null, cantidad + " Pesos corresponden a " + String.format("%.2f",valor) + " Euros");
	}
	
	public void pesosaLibras(double cantidad) {
            valor = cantidad/libra;
            JOptionPane.showMessageDialog(null, cantidad + " Pesos corresponden a " + String.format("%.2f",valor) + " Libras Esterlinas");
	}
	
	public void pesosaYen(double cantidad) {
            valor = cantidad/yen;
            JOptionPane.showMessageDialog(null, cantidad + " Pesos corresponden a " + String.format("%.2f",valor) + " Yen Japones");
	}
	
	public void pesosaWon(double cantidad) {
            valor = cantidad/won;
            JOptionPane.showMessageDialog(null, cantidad + " Pesos corresponden a " + String.format("%.2f",valor) + " Wom Surcoreano");
	}
        
        public void dolaraPesos(double cantidad) {
            valor = cantidad*dolar;
            JOptionPane.showMessageDialog(null, cantidad + " Dolares corresponden a " + String.format("%.2f",valor) + " Pesos");
	}
	
	public void eurosaPesos(double cantidad) {
            valor = cantidad*euro;
            JOptionPane.showMessageDialog(null, cantidad + " Euros corresponden a " + String.format("%.2f",valor) + " Pesos");
	}
	
	public void librasaPesos(double cantidad) {
            valor = cantidad*libra;
            JOptionPane.showMessageDialog(null, cantidad + " Libras Esterlinas corresponden a " + String.format("%.2f",valor) + " Pesos");
	}
	
	public void yenaPesos(double cantidad) {
            valor = cantidad*yen;
            JOptionPane.showMessageDialog(null, cantidad + " Yen Japones corresponden a " + String.format("%.2f",valor) + " Pesos");
	}
	
	public void wonaPesos(double cantidad) {
            valor = cantidad*won;
            JOptionPane.showMessageDialog(null, cantidad + " Won Surcoreano corresponden a " + String.format("%.2f",valor) + " Pesos");
	}     
}
