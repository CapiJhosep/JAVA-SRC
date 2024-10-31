package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm24 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMonto, txtSueldo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm24 frame = new frm24();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMonto = new JLabel("Monto : ");
		lblMonto.setBounds(100, 50, 60, 30);
		getContentPane().add(lblMonto);
		
		JLabel lblSueldo = new JLabel("Sueldo : ");
		lblSueldo.setBounds(100, 90, 60, 30);
		getContentPane().add(lblSueldo);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(170, 50, 60, 30);
		txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMonto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMonto);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(170, 90, 60, 30);
		txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(150, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		double monto = Integer.parseInt(txtMonto.getText());
		double sueldo = monto *  0.1;
		double bonificacion; 
		
		if (monto > 5000) {
			double restante = monto - 5000;
			bonificacion = Math.round(restante / 500) * 25;
		}
		
		else bonificacion = 0;
		
		double sueldoTotal = sueldo + bonificacion;
		
		DecimalFormat df = new DecimalFormat("###.00");
		txtSueldo.setText( df.format(sueldoTotal));

	}

}
