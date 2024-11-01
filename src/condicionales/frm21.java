package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm21 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm21 frame = new frm21();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(80, 20, 80, 30);
		getContentPane().add(lblNumero); 
		
		txtNumero = new JTextField();
		txtNumero.setBounds(150, 20, 100, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(72, 62, 200, 148);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(130, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNumero.getText());
		String numStr = String.valueOf(numero);
		
		char estado = numStr.charAt(0);
		int edad = Integer.parseInt(numStr.substring(1,3));
		char sex = numStr.charAt(3);
		
		String estCivil;
		String sexo;
		
		if (estado == '1') estCivil = "Soltero";
		else if (estado == '2') estCivil = "Casado";
		else if (estado == '3') estCivil = "Divorciado";
		else if (estado == '4') estCivil = "Viudo";
		else estCivil = "Desconocido";
		
		if (sex == '1') sexo = "Masculino";
		else if (sex == '2') sexo = "Femenino";
		else sexo = "Desconocido";
		
		txaRpta.setText("");
		txaRpta.append(String.format("Estado Civil : \t%s\n", estCivil));
		txaRpta.append(String.format("Edad : \t%d\n", edad));
		txaRpta.append(String.format("Sexo : \t%s \n", sexo));

	}

}