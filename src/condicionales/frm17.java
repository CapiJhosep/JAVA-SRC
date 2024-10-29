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

public class frm17 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtDocenas, txtPrecio;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDocenas = new JLabel("Docenas :");
		lblDocenas.setBounds(50, 20, 80, 30);
		getContentPane().add(lblDocenas); 
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setBounds(190, 20, 80, 30);
		getContentPane().add(lblPrecio); 
		
		txtDocenas = new JTextField();
		txtDocenas.setBounds(110, 20, 70, 30);
		txtDocenas.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDocenas.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtDocenas);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(250, 20, 70, 30);
		txtPrecio.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPrecio.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtPrecio);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(70, 60, 240, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int docenas = Integer.parseInt(txtDocenas.getText());
		double precio = Integer.parseInt(txtPrecio.getText());
		double pago = docenas * precio;
		double descuento;
		int lapiceros;
		
		if ( docenas >= 6 ) descuento = pago * 0.15;
		else descuento = pago * 0.1;
		
		double pagoTotal = pago - descuento;
		
		if ( docenas >= 30 ) lapiceros = (docenas / 3) * 2;
		else lapiceros = 0;
		
		txaRpta.setText("");
		txaRpta.append(String.format("Monto de Compra: \tS/%.2f\n", pago));
		txaRpta.append(String.format("Descuento: \t\tS/%.2f\n", descuento));
		txaRpta.append(String.format("Pago Total: \t\tS/%.2f\n", pagoTotal));
		txaRpta.append(String.format("Lapiceros: \t\t%d\n", lapiceros));

	}

}