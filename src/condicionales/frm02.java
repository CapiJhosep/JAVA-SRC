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

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtUnidades;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("Unidades :");
		lblUnidades.setBounds(80, 20, 80, 30);
		getContentPane().add(lblUnidades); 
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(150, 20, 100, 30);
		txtUnidades.setHorizontalAlignment( SwingConstants.RIGHT);
		txtUnidades.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtUnidades);
		
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
		int unidades = Integer.parseInt(txtUnidades.getText());
		int precio = unidades * 20;
		
		if (unidades >= 26 && unidades <=50) precio = 25;
		else if (unidades > 50) precio = 23;
		
		double compra = precio * unidades;
		double descuento = compra * (compra <= 500 ? 0.12 : compra > 700 ? 0.16 : 0.14);
		double total = compra - descuento;
		int caramelos = unidades <= 500 ? 5 : unidades > 100 ? 15 : 10;
		
		txaRpta.setText("");
		txaRpta.append(String.format("Compra: \tS/%.2f\n", compra));
		txaRpta.append(String.format("Descuento: \tS/%.2f\n", descuento));
		txaRpta.append(String.format("Total: \tS/%.2f \n", total));
		txaRpta.append(String.format("Caramelos: \t%s\n", caramelos));


	}

}