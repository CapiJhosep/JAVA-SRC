package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtInvertido;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número : ");
		lblNumero.setBounds(110, 30, 85, 30);
		getContentPane().add(lblNumero);

		JLabel lblInvertido = new JLabel("Invertido : ");
		lblInvertido.setBounds(110, 70, 85, 30);
		getContentPane().add(lblInvertido);

		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setBounds(190, 30, 60, 30);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txtInvertido = new JTextField();
		txtInvertido.setHorizontalAlignment(SwingConstants.RIGHT);
		txtInvertido.setBounds(190, 70, 60, 30);
		txtInvertido.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtInvertido);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 120, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		txtInvertido.setText(new StringBuilder(txtNumero.getText()).reverse().toString());
		
	}
	
}