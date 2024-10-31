package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm28 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtHora, txtHora2, txtPeriodo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm28 frame = new frm28();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm28() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblHora = new JLabel("Hora(24h) : ");
		lblHora.setBounds(110, 30, 85, 30);
		getContentPane().add(lblHora);

		JLabel lblHora2 = new JLabel("Hora(12h) : ");
		lblHora2.setBounds(110, 70, 85, 30);
		getContentPane().add(lblHora2);
		
		JLabel lblPeriodo = new JLabel("Periodo : ");
		lblPeriodo.setBounds(110, 110, 85, 30);
		getContentPane().add(lblPeriodo);

		txtHora = new JTextField();
		txtHora.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHora.setBounds(190, 30, 60, 30);
		txtHora.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHora);
		
		txtHora2 = new JTextField();
		txtHora2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHora2.setBounds(190, 70, 60, 30);
		txtHora2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHora2);
		
		txtPeriodo = new JTextField();
		txtPeriodo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPeriodo.setBounds(190, 110, 60, 30);
		txtPeriodo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPeriodo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int hora = Integer.parseInt(txtHora.getText());
		int hora2;
		String periodo = "";
		
		if (hora >= 0 && hora <= 24) {
			if (hora == 0) {
				hora2 = 12;
				periodo = "AM"	;
			}
			else if (hora < 12) {
				hora2 = hora;
				periodo = "AM"	;
			}
			else if (hora == 12) {
				hora2 = 12;
				periodo = "PM"	;
			}
			else {
				hora2 = hora - 12;
				periodo = "PM"	;
			}	
			
			txtHora2.setText(Integer.toString(hora2));
			txtPeriodo.setText(periodo);
			
		}
		else {
			txtHora2.setText("Inválido");
		}
		
	}
	
}