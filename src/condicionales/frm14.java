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

public class frm14 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtMonto;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(50, 20, 80, 30);
		getContentPane().add(lblNumero); 
		
		JLabel lblMonto = new JLabel("Monto :");
		lblMonto.setBounds(190, 20, 80, 30);
		getContentPane().add(lblMonto); 
		
		txtNumero = new JTextField();
		txtNumero.setBounds(110, 20, 70, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT);
		txtNumero.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(240, 20, 70, 30);
		txtMonto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMonto.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtMonto);
		
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
		int numero = Integer.parseInt(txtNumero.getText());
		double monto = Integer.parseInt(txtMonto.getText());
		double descuento;
		
		if (numero % 2 == 0 && numero >= 100) descuento = 15;
		else descuento = 5;
		
		txaRpta.setText("");
		txaRpta.append(String.format("# de Tarjeta: \t%d\n", numero));
		txaRpta.append(String.format("Monto: \tS/%.2f \n", monto));
		txaRpta.append(String.format("Descuento: \tS/%.2f\n", descuento));
		

	}

}