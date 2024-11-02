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

public class frm31 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtHoras, txtCategoria;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm31 frame = new frm31();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm31() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblHoras = new JLabel("Horas :");
		lblHoras.setBounds(50, 20, 80, 30);
		getContentPane().add(lblHoras); 
		
		JLabel lblCategoria = new JLabel("Categoría :");
		lblCategoria.setBounds(180, 20, 80, 30);
		getContentPane().add(lblCategoria); 
		
		txtHoras = new JTextField();
		txtHoras.setBounds(100, 20, 70, 30);
		txtHoras.setHorizontalAlignment( SwingConstants.RIGHT);
		txtHoras.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtHoras);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(250, 20, 70, 30);
		txtCategoria.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCategoria.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtCategoria);
		
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
	    double horas = Double.parseDouble(txtHoras.getText()); 
	    String categoria = txtCategoria.getText();
	    String cat = categoria.toUpperCase();
	    double pago = 0;
	    double descuento;
	    double sueldo = 0;
	    
	    if (cat.equals("A")) {
	        pago = 21; 
	        sueldo = horas * pago;
	    }
	    else if (cat.equals("B")) {
	        pago = 19.50; 
	        sueldo = horas * pago;
	    }
	    else if (cat.equals("C")) {
	        pago = 17; 
	        sueldo = horas * pago;
	    }
	    else if (cat.equals("D")) {
	        pago = 15.50; 
	        sueldo = horas * pago;
	    }
	    
	    if (sueldo > 2500) {
	        descuento = sueldo * 0.2;
	    } else {
	        descuento = sueldo * 0.15;
	    }
	    
	    double neto = sueldo - descuento;
	    
	    txaRpta.setText("");
	    txaRpta.append(String.format("Sueldo Bruto: \tS/%.2f\n", sueldo));
	    txaRpta.append(String.format("Descuento: \tS/%.2f\n", descuento));
	    txaRpta.append(String.format("Sueldo Neto: \tS/%.2f\n", neto));
	}
}
