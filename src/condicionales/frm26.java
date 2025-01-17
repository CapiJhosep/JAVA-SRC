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

public class frm26 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMonto;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm26 frame = new frm26();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm26() {
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
		double porcentaje;
		
		if (monto > 5000) porcentaje = 0.3;
		else porcentaje = 0.2;
		
		double prestamo = monto * porcentaje; 
		double interes = prestamo * 0.1;
		double total = prestamo * interes;
		double propio = monto - prestamo;
		
		txaRpta.setText("");
		txaRpta.append(String.format("Préstamo : \tS/%.2f\n", prestamo));
		txaRpta.append(String.format("Pago Propio : \tS/%.2f\n", propio));
		txaRpta.append(String.format("Total : \tS/%.2f \n", total));

	}

}