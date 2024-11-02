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

public class frm36 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCuadernos;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm36 frame = new frm36();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm36() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCuadernos = new JLabel("Cuadernos :");
		lblCuadernos.setBounds(70, 20, 80, 30);
		getContentPane().add(lblCuadernos); 
		
		txtCuadernos = new JTextField();
		txtCuadernos.setBounds(150, 20, 100, 30);
		txtCuadernos.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCuadernos.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtCuadernos);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(70, 60, 200, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(130, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int cuadernos = Integer.parseInt(txtCuadernos.getText());
		int lapiFaber = 0;
		int lapiLucas = 0;    
		int lapiPilot = 0;

		if (cuadernos < 12) {
		    lapiFaber = 0;
		    lapiLucas = 0;    
		    lapiPilot = 0;
		} 
		else if (cuadernos >= 12 && cuadernos < 24) {
		    lapiLucas = cuadernos / 4;
		} 
		else if (cuadernos >= 24 && cuadernos < 36) {
		    lapiFaber = (cuadernos / 4) * 2;
		} 
		else {
		    lapiPilot = (cuadernos / 4) * 2;
		    lapiFaber = cuadernos / 6;
		    lapiLucas = cuadernos / 12;
		}

		txaRpta.setText("");
		txaRpta.append(String.format("Lapiceros Lucas: \t%s\n", lapiLucas));
		txaRpta.append(String.format("Lapiceros Faber: \t%s\n", lapiFaber));
		txaRpta.append(String.format("Lapiceros Pilot: \t%s\n",  lapiPilot));
		
	}

}
