package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm35 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCodigo, txtTipo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm35 frame = new frm35();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm35() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(130, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblCodigo = new JLabel("Código : ");
		lblCodigo.setBounds(120, 30, 100, 30);
		getContentPane().add(lblCodigo);

		JLabel lblTipo = new JLabel("Tipo : ");
		lblTipo.setBounds(130, 70, 100, 30);
		getContentPane().add(lblTipo);

		txtCodigo = new JTextField();
		txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCodigo.setBounds(200, 30, 80, 30);
		txtCodigo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCodigo);
		
		txtTipo = new JTextField();
		txtTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTipo.setBounds(200, 70, 80, 30);
		txtTipo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTipo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(150, 120, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int codigo = Integer.parseInt(txtCodigo.getText());
		String empleado;
		
		if (codigo % 2 == 0 && codigo % 3 == 0 && codigo % 5 == 0) empleado = "Administrativo";
		else if (codigo % 3 == 0 && codigo % 5 == 0 && codigo % 2 != 0) empleado = "Directivo";
		else if (codigo % 2 == 0 && codigo % 3 != 0 && codigo % 5 != 0) empleado = "Vendedor";
		else empleado = "Seguridad";
		
		txtTipo.setText(empleado);
		
	}
	
}