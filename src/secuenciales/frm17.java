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

public class frm17 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtDonacion;
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
		
		JLabel lblDonacion = new JLabel("Donación :");
		lblDonacion.setBounds(80, 20, 80, 30);
		getContentPane().add(lblDonacion); 
		
		txtDonacion = new JTextField();
		txtDonacion.setBounds(150, 20, 100, 30);
		txtDonacion.setHorizontalAlignment( SwingConstants.RIGHT);
		txtDonacion.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtDonacion);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(60, 60, 250, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(130, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		double donacion = Integer.parseInt(txtDonacion.getText());

		double salud = donacion *0.25;
		double comedor = donacion * 0.35;
		double escuela = donacion * 0.25;
		double ascilo = donacion - (salud + comedor + escuela);
		
		txaRpta.setText("");
		txaRpta.append(String.format("Centro de Salud: \tS/%.2f\n", salud));
		txaRpta.append(String.format("Comedor Infantil: \tS/%.2f\n", comedor));
		txaRpta.append(String.format("Escuela Infantil: \tS/%.2f \n", escuela));
		txaRpta.append(String.format("Ascilo de Ancianos: \tS/%.2f\n", ascilo));


	}

}