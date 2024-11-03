package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm39 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtHoras, txtTorDef, txtNoDef, txtEficiencia;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm39 frame = new frm39();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm39() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblHoras = new JLabel("Ausencia (h) : ");
		lblHoras.setBounds(80, 30, 110, 30);
		getContentPane().add(lblHoras);

		JLabel lblTorDef = new JLabel("Defectuosos : ");
		lblTorDef.setBounds(80, 70, 110, 30);
		getContentPane().add(lblTorDef);

		JLabel lblNoDef = new JLabel("No Defectuosos : ");
		lblNoDef.setBounds(80, 110, 110, 30);
		getContentPane().add(lblNoDef);
		
		JLabel lblEficiencia = new JLabel("Eficiencia : ");
		lblEficiencia.setBounds(80, 150, 110, 30);
		getContentPane().add(lblEficiencia);
		
		txtHoras = new JTextField();
		txtHoras.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHoras.setBounds(200, 30, 70, 30);
		txtHoras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHoras);
		
		txtTorDef = new JTextField();
		txtTorDef.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTorDef.setBounds(200, 70, 70, 30);
		txtTorDef.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTorDef);

		txtNoDef = new JTextField();
		txtNoDef.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNoDef.setBounds(200, 110, 70, 30);
		txtNoDef.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNoDef);
		
		txtEficiencia = new JTextField();
		txtEficiencia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEficiencia.setBounds(200, 150, 70, 30);
		txtEficiencia.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEficiencia);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		double horas = Double.parseDouble(txtHoras.getText());
		int def = Integer.parseInt(txtTorDef.getText());
		int noDef = Integer.parseInt(txtNoDef.getText());
		int eficiencia = 5;
	
		if (horas <= 1.5 && def < 300 && noDef > 10000) {
		    eficiencia = 20;
		} else if (horas <= 1.5 && def < 300) {
		    eficiencia = 12;
		} else if (horas <= 1.5 && noDef > 10000) {
		    eficiencia = 13;
		} else if (def < 300 && noDef > 10000) {
		    eficiencia = 15;
		} else if (horas <= 1.5) {
		    eficiencia = 7;
		} else if (def < 300) {
		    eficiencia = 8;
		} else if (noDef > 10000) {
		    eficiencia = 9;
		}
		
		txtEficiencia.setText(String.valueOf(eficiencia));
	}
}
