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

public class frm32 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCategoria, txtPromedio;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm32 frame = new frm32();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm32() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCategoria = new JLabel("Categoría :");
		lblCategoria.setBounds(40, 20, 80, 30);
		getContentPane().add(lblCategoria); 
		
		JLabel lblPromedio = new JLabel("Promedio :");
		lblPromedio.setBounds(190, 20, 80, 30);
		getContentPane().add(lblPromedio); 
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(110, 20, 70, 30);
		txtCategoria.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCategoria.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtCategoria);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(260, 20, 70, 30);
		txtPromedio.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPromedio.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtPromedio);
		
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
	    String categoria = txtCategoria.getText();
	    String cat = categoria.toUpperCase();
	    double promedio = Integer.parseInt(txtPromedio.getText());
	    double descuento = 0;
	    double pension = 0;
	    
	    if (cat.equals("A")) pension = 550;
	    else if (cat.equals("B")) pension = 500;
	    else if (cat.equals("C")) pension = 450;
	    else if (cat.equals("D")) pension = 400;
	    
	    if (promedio < 14) descuento = 0;
	    else if (promedio >= 14 && promedio < 16) descuento = pension * 0.1;
	    else if (promedio >= 16 && promedio < 18) descuento = pension * 0.12;
	    else if (promedio >= 18 && promedio <= 20) descuento = pension * 0.15;
	    
	    double pago = pension - descuento;
	    
	    txaRpta.setText("");
	    txaRpta.append(String.format("Pensión: \tS/%.2f\n", pension));
	    txaRpta.append(String.format("Descuento: \tS/%.2f\n", descuento));
	    txaRpta.append(String.format("Pago Total: \tS/%.2f\n", pago));
	    
	}
}
