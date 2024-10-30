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

public class frm18 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMonto;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm18 frame = new frm18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm18() {
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
		scrollPane.setBounds(70, 60, 250, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(130, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	private void btnCalcular_actionPerformed() {
		double monto = Integer.parseInt(txtMonto.getText());
		double salud = 0;
		double bolsa = 0;
		double comedor = 0;
		
		if ( monto >= 10000 ) {
			salud = 10000 * 0.3;
			comedor = 10000 * 0.5;
			bolsa = 10000 - (salud + comedor);
			
		}
		else if ( monto < 10000 ) {
			salud = 10000 * 0.25;
			comedor = 10000 * 0.6;
			bolsa = 10000 - (salud + comedor);
		}
		
		txaRpta.setText("");
		txaRpta.append(String.format("Centro de Salud: \tS/%.2f\n", salud));
		txaRpta.append(String.format("Comedor de Niños: \tS/%.2f\n", comedor));
		txaRpta.append(String.format("Inversión en Bolsa: \tS/%.2f \n", bolsa ));

	}


}
