package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class fmr18 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtRpta;
	String texto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fmr18 frame = new fmr18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public fmr18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		txtRpta = new JTextField();
		txtRpta.setBounds( 110, 90, 200, 30);
		txtRpta.setHorizontalAlignment( SwingConstants.RIGHT );
		txtRpta.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtRpta);
		
		texto = "jhosep";
		txtRpta.setText( toUpperCase());
	}

	private String toUpperCase() {
		if ( texto == null || texto.isEmpty() ) return "";
		
		char letra;
		int longitud = texto.length();
		String rpta = "";
		String minuscula = "abcdefghijklmnñopqrstuvwxyzáéíóú";
		String mayuscula = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ";
	
		for (int i = 0; i < longitud; i++) {
			letra = texto.charAt(i);
			letra = minuscula.contains("" + letra) ? mayuscula.charAt(minuscula.indexOf(letra)) : letra;
			rpta += letra;
		}
	
		return rpta;
		
	}

}