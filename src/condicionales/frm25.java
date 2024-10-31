package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm25 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtHijo, txtSueldo, txtBoni, txtNeto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm25 frame = new frm25();
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
	public frm25() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblHijo = new JLabel("Hijos : ");
		lblHijo.setBounds(110, 30, 85, 30);
		getContentPane().add(lblHijo);

		JLabel lblSueldo = new JLabel("Sueldo : ");
		lblSueldo.setBounds(110, 70, 85, 30);
		getContentPane().add(lblSueldo);

		JLabel lblBoni = new JLabel("Bonificación : ");
		lblBoni.setBounds(110, 110, 85, 30);
		getContentPane().add(lblBoni);
		
		JLabel lblNeto = new JLabel("Sueldo Neto : ");
		lblNeto.setBounds(110, 150, 85, 30);
		getContentPane().add(lblNeto);
		
		txtHijo = new JTextField();
		txtHijo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHijo.setBounds(200, 30, 100, 30);
		txtHijo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHijo);
		
		txtSueldo = new JTextField();
		txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldo.setBounds(200, 70, 100, 30);
		txtSueldo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldo);

		txtBoni = new JTextField();
		txtBoni.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBoni.setBounds(200, 110, 100, 30);
		txtBoni.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBoni);
		
		txtNeto = new JTextField();
		txtNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNeto.setBounds(200, 150, 100, 30);
		txtNeto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNeto);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int hijo = Integer.parseInt(txtHijo.getText());
		double sueldo = Integer.parseInt(txtSueldo.getText());
		double boni;
		
		if (hijo > 1) boni = (sueldo * 0.125) + (40 * hijo);
		else boni = sueldo * 0.1;
		
		double neto = sueldo + boni;
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtBoni.setText( df.format(boni));
		txtNeto.setText( df.format(neto));
		
	}
}
