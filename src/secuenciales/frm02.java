package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMetros, txtCentrimetros, txtPulgadas, txtPies, txtYardas;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblMetros = new JLabel("Metros: ");
		lblMetros.setBounds(50, 30, 80, 30);
		getContentPane().add(lblMetros);

		JLabel lblCentimetros = new JLabel("Centímetros: ");
		lblCentimetros.setBounds(50, 70, 80, 30);
		getContentPane().add(lblCentimetros);

		JLabel lblPulgadas = new JLabel("Pulgadas: ");
		lblPulgadas.setBounds(50, 110, 80, 30);
		getContentPane().add(lblPulgadas);

		JLabel lblPies = new JLabel("Pies: ");
		lblPies.setBounds(50, 150, 80, 30);
		getContentPane().add(lblPies);

		JLabel lblYardas = new JLabel("Yardas: ");
		lblYardas.setBounds(50, 190, 80, 30);
		getContentPane().add(lblYardas);

		txtMetros = new JTextField();
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setBounds(130, 30, 60, 30);
		txtMetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMetros);
		
		txtCentrimetros = new JTextField();
		txtCentrimetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCentrimetros.setBounds(130, 70, 60, 30);
		txtCentrimetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCentrimetros);
		
		txtPulgadas = new JTextField();
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPulgadas.setBounds(130, 110, 60, 30);
		txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPulgadas);
		
		txtPies = new JTextField();
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setBounds(130, 150, 60, 30);
		txtPies.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPies);
		
		txtYardas = new JTextField();
		txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtYardas.setBounds(130, 190, 60, 30);
		txtYardas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtYardas);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 230, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int metros = Integer.parseInt(txtMetros.getText());
		
		double centimetros = metros * 100;
		double pulgadas = centimetros / 2.54;
		double pies = pulgadas / 12;
		double yardas = pies / 3;

		DecimalFormat df = new DecimalFormat("###.##");
		txtCentrimetros.setText( df.format(centimetros));
		txtPulgadas.setText( df.format(pulgadas));
		txtPies.setText( df.format(pies));
		txtYardas.setText( df.format(yardas));	
	
	}
	
}