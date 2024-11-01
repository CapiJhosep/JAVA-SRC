package secuenciales;

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
	JTextField txtCantidad, txtPrecio;
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
		
		JLabel lblCantidad = new JLabel("Cantidad :");
		lblCantidad.setBounds(50, 20, 80, 30);
		getContentPane().add(lblCantidad); 
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setBounds(200, 20, 80, 30);
		getContentPane().add(lblPrecio); 
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(115, 20, 70, 30);
		txtCantidad.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCantidad.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(250, 20, 70, 30);
		txtPrecio.setHorizontalAlignment( SwingConstants.RIGHT);
		txtPrecio.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtPrecio);
		
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
		double cantidad = Integer.parseInt(txtCantidad.getText());
		double precio = Integer.parseInt(txtPrecio.getText());

		double importe = cantidad * precio;
		double des1 = importe * 0.15;
		double des2 = (importe - des1) * 0.15;
		double desTotal = des1 + des2;
		double imporFinal = importe - desTotal;
		
		txaRpta.setText("");
		txaRpta.append(String.format("Importe : \tS/%.2f\n", importe));
		txaRpta.append(String.format("Descuento : \tS/%.2f\n", desTotal));
		txaRpta.append(String.format("Pago : \tS/%.2f\n", imporFinal));
		
	}

}