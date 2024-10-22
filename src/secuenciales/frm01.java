package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
	
	private static final long serialVersionUID = 1L;
		JTextField txtVarones, txtMujeres;
		JLabel lblPVarones, lblPMujeres;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVarones = new JLabel("Varones: ");
		lblVarones.setBounds(50, 50, 60, 30);
		getContentPane().add(lblVarones);
		
		JLabel lblMujeres = new JLabel("Mujeres: ");
		lblMujeres.setBounds(50, 90, 60, 30);
		getContentPane().add(lblMujeres);
		
		lblPVarones = new JLabel("%");
		lblPVarones.setBounds(200, 50, 60, 30);
		getContentPane().add(lblPVarones);
		
		lblPMujeres = new JLabel("%");
		lblPMujeres.setBounds(200, 90, 60, 30);
		getContentPane().add(lblPMujeres);
		
		txtVarones = new JTextField();
		txtVarones.setBounds(120, 50, 60, 30);
		txtVarones.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVarones.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVarones);
		
		txtMujeres = new JTextField();
		txtMujeres.setBounds(120, 90, 60, 30);
		txtMujeres.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMujeres.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMujeres);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int varones = Integer.parseInt(txtVarones.getText());
		int mujeres = Integer.parseInt(txtMujeres.getText());

		int total = varones + mujeres;
		double pVarones = varones * 100 / total;
		double pMujeres = mujeres * 100 / total;

		DecimalFormat df = new DecimalFormat("###.00");
		lblPVarones.setText( df.format(pVarones) + "%");
		lblPMujeres.setText( df.format(pMujeres) + "%");

	}

}
