package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm34 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtPeso, txtEstatura, txtIMC;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm34 frame = new frm34();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm34() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblPeso = new JLabel("Peso (kg) : ");
		lblPeso.setBounds(110, 30, 85, 30);
		getContentPane().add(lblPeso);

		JLabel lblEstatura = new JLabel("Estatura (m) : ");
		lblEstatura.setBounds(110, 70, 85, 30);
		getContentPane().add(lblEstatura);

		JLabel lblIMC = new JLabel("IMC : ");
		lblIMC.setBounds(110, 110, 85, 30);
		getContentPane().add(lblIMC);
		
		txtPeso = new JTextField();
		txtPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPeso.setBounds(210, 30, 60, 30);
		txtPeso.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPeso);
		
		txtEstatura = new JTextField();
		txtEstatura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEstatura.setBounds(210, 70, 60, 30);
		txtEstatura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEstatura);
		
		txtIMC = new JTextField();
		txtIMC.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIMC.setBounds(210, 110, 80, 30);
		txtIMC.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtIMC);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(180, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		double peso = Integer.parseInt(txtPeso.getText());
		double estatura = Double.parseDouble(txtEstatura.getText());
		double IMC = peso / Math.pow(estatura, 2);
		String gradoObesidad;
		
		if (IMC <= 20) gradoObesidad = "Delgado";
		else if (IMC <= 25) gradoObesidad = "Normal";
		else if (IMC <= 27) gradoObesidad = "Sobrepeso";
		else gradoObesidad = "Obesidad";
		
		txtIMC.setText(gradoObesidad);
		
	}
	
}