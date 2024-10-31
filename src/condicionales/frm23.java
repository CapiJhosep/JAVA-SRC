package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm23 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMate, txtFisica, txtPropina, txtRegalo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm23 frame = new frm23();
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
	public frm23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblMate = new JLabel("Matemática : ");
		lblMate.setBounds(110, 30, 85, 30);
		getContentPane().add(lblMate);

		JLabel lblFisica = new JLabel("Física : ");
		lblFisica.setBounds(110, 70, 85, 30);
		getContentPane().add(lblFisica);

		JLabel lblPropina = new JLabel("Propina : ");
		lblPropina.setBounds(110, 110, 85, 30);
		getContentPane().add(lblPropina);
		
		JLabel lblRegalo = new JLabel("Regalo : ");
		lblRegalo.setBounds(110, 150, 85, 30);
		getContentPane().add(lblRegalo);
		
		txtMate = new JTextField();
		txtMate.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMate.setBounds(200, 30, 100, 30);
		txtMate.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMate);
		
		txtFisica = new JTextField();
		txtFisica.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFisica.setBounds(200, 70, 100, 30);
		txtFisica.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtFisica);

		txtPropina = new JTextField();
		txtPropina.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPropina.setBounds(200, 110, 100, 30);
		txtPropina.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPropina);
		
		txtRegalo = new JTextField();
		txtRegalo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRegalo.setBounds(200, 150, 100, 30);
		txtRegalo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRegalo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		double mate = Integer.parseInt(txtMate.getText());
		double fisica = Integer.parseInt(txtFisica.getText());
		double promedio = (mate + fisica) / 2;
		double propM;
		double propF;
		
		if (mate > 17) propM = mate * 3;
		else propM = mate * 1;

		if (fisica > 15) propF = fisica * 2;
		else propF = fisica * 0.5;
		
		double propTotal = propM + propF;
		
		if (promedio > 16) txtRegalo.setText("Reloj");
		else txtRegalo.setText("Nada");
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtPropina.setText( df.format(propTotal));
		
	}
}
