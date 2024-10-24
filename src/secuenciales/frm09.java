package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtSuma, txtCifra1, txtCifra2, txtCifra3, txtCifra4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número (abcd) : ");
		lblNumero.setBounds(110, 30, 100, 30);
		getContentPane().add(lblNumero);

		JLabel lblSuma = new JLabel("Suma de Cifras : ");
		lblSuma.setBounds(110, 70, 100, 30);
		getContentPane().add(lblSuma);

		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setBounds(210, 30, 60, 30);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txtSuma = new JTextField();
		txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSuma.setBounds(210, 70, 60, 30);
		txtSuma.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSuma);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 120, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNumero.getText());
		
		double cifra1= Math.round(numero / 1000);
		double cifra2= Math.round(numero / 100) % 10;
		double cifra3= Math.round(numero / 10) % 10;
		double cifra4= Math.round(numero % 10);
		
		int suma = (int) (cifra1 + cifra2 + cifra3 + cifra4);
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtSuma.setText( df.format(suma));
		
	}
	
}