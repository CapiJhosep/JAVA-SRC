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

public class frm29 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtHoras, txtPago;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm29 frame = new frm29();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm29() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblHoras = new JLabel("Horas :");
		lblHoras.setBounds(50, 20, 80, 30);
		getContentPane().add(lblHoras); 
		
		JLabel lblPago = new JLabel("Pago :");
		lblPago.setBounds(180, 20, 80, 30);
		getContentPane().add(lblPago); 
		
		txtHoras = new JTextField();
		txtHoras.setBounds(100, 20, 70, 30);
		txtHoras.setHorizontalAlignment( SwingConstants.RIGHT);
		txtHoras.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtHoras);
		
		txtPago = new JTextField();
		txtPago.setBounds(240, 20, 70, 30);
		txtPago.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPago.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtPago);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(90, 60, 200, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
	    int horas = Integer.parseInt(txtHoras.getText());
	    double pago = Double.parseDouble(txtPago.getText());
	    double descuento;
	    double sueldo;
	    
	    if (horas <= 48) {
	        sueldo = horas * pago;
	    } else { 
	        int extras = horas - 48;
	        sueldo = (48 * pago) + (extras * pago * 1.2);
	    }
	    
	    if (sueldo > 1500) {
	        descuento = sueldo * 0.11;
	    } else {
	        descuento = 0;
	    }
	    
	    double total = sueldo - descuento;
	    
	    txaRpta.setText("");
	    txaRpta.append(String.format("'H' Trabajadas: \t%d\n", horas));
	    txaRpta.append(String.format("Pago/hora: \tS/%.2f\n", pago));
	    txaRpta.append(String.format("Sueldo Bruto: \tS/%.2f \n", sueldo));
	    txaRpta.append(String.format("Descuento: \tS/%.2f \n", descuento));
	    txaRpta.append(String.format("Pago Total: \tS/%.2f \n", total));
	    
	}
	
}