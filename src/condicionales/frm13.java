package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtOrden;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
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
		txtOrden.setBounds( 110, 90, 105, 30);
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
		String numero =  txtNumero.getText();
		if (numero.length() == 3 && numero.matches("\\d+")) {
            int digito1 = Character.getNumericValue(numero.charAt(0));
            int digito2 = Character.getNumericValue(numero.charAt(1));
            int digito3 = Character.getNumericValue(numero.charAt(2));

            if (digito1 + 1 == digito2 && digito2 + 1 == digito3) txtOrden.setText("Ascendente");
            else if (digito1 - 1 == digito2 && digito2 - 1 == digito3) txtOrden.setText("Descendente");
            else txtOrden.setText("No son consec.");
        	} 
		
		else { txtOrden.setText("Error");
    			return;
        	}

	}
}