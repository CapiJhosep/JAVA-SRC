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

public class frm15 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMonto;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMonto = new JLabel("Monto :");
		lblMonto.setBounds(80, 20, 80, 30);
		getContentPane().add(lblMonto); 
		
		txtMonto = new JTextField();
		txtMonto.setBounds(150, 20, 100, 30);
		txtMonto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMonto.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtMonto);
		
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
		int monto = Integer.parseInt(txtMonto.getText());
		double comision;
		double descuento;
		double sueldoBas = 250;
		
		if ( monto > 0 ) {
			if ( monto <= 5000 ) comision = 0.05 * monto;
			else if ( monto > 5000 && monto <= 10000 ) comision = 0.08 * monto;
			else if ( monto > 10000 && monto <= 20000 ) comision = 0.1 * monto;
			else comision = 0.15 * monto;
		}
		
		else { txaRpta.setText("Error");
			return;
		}
		
		double sueldo = sueldoBas + comision;
		
		if ( sueldo > 3500 ) descuento = 0.15 * sueldo;
		else descuento = 0.08 * sueldo;
		
		double sueldoBru = sueldo + comision;
		double sueldoNet = sueldoBru - descuento;
				
		txaRpta.setText("");
		txaRpta.append(String.format("Sueldo Bruto: \tS/%.2f\n", sueldoBru));
		txaRpta.append(String.format("Sueldo Neto: \tS/%.2f\n", sueldoNet));
		txaRpta.append(String.format("Descuento: \tS/%.2f\n", descuento));
		txaRpta.append(String.format("Comisión: \tS/%.2f\n", comision));
		
	}

}
