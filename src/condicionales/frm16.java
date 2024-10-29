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

public class frm16 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtIngreso, txtCasa;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblIngreso = new JLabel("Ingreso :");
		lblIngreso.setBounds(45, 20, 80, 30);
		getContentPane().add(lblIngreso); 
		
		JLabel lblCasa = new JLabel("Monto :");
		lblCasa.setBounds(180, 20, 80, 30);
		getContentPane().add(lblCasa); 
		
		txtIngreso = new JTextField();
		txtIngreso.setBounds(100, 20, 70, 30);
		txtIngreso.setHorizontalAlignment( SwingConstants.RIGHT);
		txtIngreso.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtIngreso);
		
		txtCasa = new JTextField();
		txtCasa.setBounds(240, 20, 70, 30);
		txtCasa.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCasa.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtCasa);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(70, 60, 250, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		double ingreso = Integer.parseInt(txtIngreso.getText());
		double casa = Integer.parseInt(txtCasa.getText());
		double inicial = 0;
		double mensual = 0;
		
		if ( ingreso < 1250 ) {
			inicial = casa * 0.15;
			mensual = (casa - inicial) / 120;
		} 

		else if ( ingreso >= 1250 ){
			inicial = casa * 0.3;
			mensual = (casa - inicial) / 75;
		}
		
		txaRpta.setText("");
		txaRpta.append(String.format("Cuota Inicial: \t\tS/%.2f\n", inicial));
		txaRpta.append(String.format("Monto Mensual: \tS/%.2f\n", mensual));

	}

}