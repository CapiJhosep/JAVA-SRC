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

public class frm20 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCantidad;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCantidad = new JLabel("Cantidad :");
		lblCantidad.setBounds(80, 20, 80, 30);
		getContentPane().add(lblCantidad); 
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(150, 20, 100, 30);
		txtCantidad.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCantidad.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidad);
		
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
		    int cantidad = Integer.parseInt(txtCantidad.getText());

		    int billetes200 = cantidad / 200; cantidad %= 200;
		    int billetes100 = cantidad / 100; cantidad %= 100;
		    int billetes50 = cantidad / 50; cantidad %= 50;
		    int billetes20 = cantidad / 20; cantidad %= 20;
		    int billetes10 = cantidad / 10; cantidad %= 10;
		    int monedas5 = cantidad / 5; cantidad %= 5;
		    int monedas2 = cantidad / 2; cantidad %= 2;
		    int monedas1 = cantidad;

		    txaRpta.setText("");
		    txaRpta.append(String.format("Billete 200: \t%d\n", billetes200));
		    txaRpta.append(String.format("Billete 100: \t%d\n", billetes100));
		    txaRpta.append(String.format("Billete 50: \t%d\n", billetes50));
		    txaRpta.append(String.format("Billete 20: \t%d\n", billetes20));
		    txaRpta.append(String.format("Billete 10: \t%d\n", billetes10));
		    txaRpta.append(String.format("Moneda 5: \t%d\n", monedas5));
		    txaRpta.append(String.format("Moneda 2: \t%d\n", monedas2));
		    txaRpta.append(String.format("Moneda 1: \t%d\n", monedas1));
		}
}