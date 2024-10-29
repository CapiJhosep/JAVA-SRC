package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.util.Arrays;

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtOrden;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(60, 50, 80, 30);
		getContentPane().add(lblNumero);

		JLabel lblOrden = new JLabel("Orden :");
		lblOrden.setBounds(60, 90, 80, 30);
		getContentPane().add(lblOrden);

		txtNumero = new JTextField();
		txtNumero.setBounds( 130, 50, 70, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT );
		txtNumero.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtNumero);

		txtOrden = new JTextField();
		txtOrden.setBounds( 130, 90, 70, 30);
		txtOrden.setHorizontalAlignment( SwingConstants.RIGHT );
		txtOrden.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtOrden);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 80, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		String numero = txtNumero.getText();
		
		if ( numero.length() == 4 ) {
			char[] digits = numero.toCharArray();
			Arrays.sort(digits); 
			String orden = new String(digits);
			txtOrden.setText(orden);
		}	
		
		else {
			txtOrden.setText("Error");
		}
		
	}

}