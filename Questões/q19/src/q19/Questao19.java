package q19;
import javax.swing.JOptionPane;

public class Questao19 {
	public static void main(String[] args) {
		
		JOptionPane pane = new JOptionPane();
		float a_degrau, a_desejada, degraus;
		
		a_degrau = 
		a_desejada = Float.parseFloat(pane.showInputDialog("Altura desejada: "));
		
		degraus = a_desejada/a_degrau;
		if (degraus > 0 && degraus < 1) {
			degraus = 1;
		}
		
		int total = (int) degraus;
		
		pane.showMessageDialog(pane, "Degraus a subir: " + total);
		
	}
}
