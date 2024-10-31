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

public class frm22 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtA, txtB;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm22 frame = new frm22();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblA = new JLabel("Unidades A :");
		lblA.setBounds(30, 20, 80, 30);
		getContentPane().add(lblA); 
		
		JLabel lblB = new JLabel("Unidades B :");
		lblB.setBounds(190, 20, 80, 30);
		getContentPane().add(lblB); 
		
		txtA = new JTextField();
		txtA.setBounds(110, 20, 70, 30);
		txtA.setHorizontalAlignment( SwingConstants.RIGHT);
		txtA.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtA);
		
		txtB = new JTextField();
		txtB.setBounds(270, 20, 70, 30);
		txtB.setHorizontalAlignment( SwingConstants.RIGHT);
		txtB.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtB);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(100, 60, 180, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int a = Integer.parseInt(txtA.getText());
		int b = Integer.parseInt(txtB.getText());
		double precioA = 25;
		double precioB = 30;
		double descuentoA;
		double descuentoB;
		
		double brutoA = a * precioA;
		double brutoB = b * precioB;
		double bruto = brutoA + brutoB;
		
		if (a > 50) descuentoA = brutoA * 0.15;
		else descuentoA = 0;
		
		if (b > 60) descuentoB = brutoB * 0.1;
		else descuentoB = 0;
		
		double descuento = descuentoA + descuentoB;
		double pago = bruto - descuento;
		
		txaRpta.setText("");
		txaRpta.append(String.format("Importe Bruto: \tS/%.2f\n", bruto));
		txaRpta.append(String.format("Descuento: \tS/%.2f\n", descuento));
		txaRpta.append(String.format("Total: \tS/%.2f \n", pago));

		} 

}