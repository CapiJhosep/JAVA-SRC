package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm19 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtSexo, txtEdad, txtCategoria;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblSexo = new JLabel("Sexo : ");
		lblSexo.setBounds(110, 30, 85, 30);
		getContentPane().add(lblSexo);

		JLabel lblEdad = new JLabel("Edad : ");
		lblEdad.setBounds(110, 70, 85, 30);
		getContentPane().add(lblEdad);

		JLabel lblCategoria = new JLabel("Categoría : ");
		lblCategoria.setBounds(110, 110, 85, 30);
		getContentPane().add(lblCategoria);
		
		txtSexo = new JTextField();
		txtSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSexo.setBounds(210, 30, 60, 30);
		txtSexo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSexo);
		
		txtEdad = new JTextField();
		txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEdad.setBounds(210, 70, 60, 30);
		txtEdad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdad);
		
		txtCategoria = new JTextField();
		txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCategoria.setBounds(210, 110, 60, 30);
		txtCategoria.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCategoria);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(180, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		String sexo = txtSexo.getText();
		int edad = Integer.parseInt(txtEdad.getText());
		String sex = sexo.toUpperCase();
		
		if (sex.equals("F") && edad < 23) txtCategoria.setText("FA");
		if (sex.equals("F") && edad >= 23) txtCategoria.setText("FB");
		if (sex.equals("M") && edad >= 25) txtCategoria.setText("MB");
		if (sex.equals("M") && edad < 25) txtCategoria.setText("MA");
		
	}
	
}