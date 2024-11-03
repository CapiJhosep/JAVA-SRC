package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCadena;
	JTextArea txaRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCadena = new JLabel("Cadena :");
		lblCadena.setBounds(80, 20, 80, 30);
		getContentPane().add(lblCadena); 
		
		txtCadena = new JTextField();
		txtCadena.setBounds(150, 20, 100, 30);
		txtCadena.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCadena.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCadena);
		
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
		String cadena = txtCadena.getText();  
		List<String> resultado = permutacionRec(cadena); 

		txaRpta.setText(""); 
		for (String permutacion : resultado) {
			txaRpta.append(permutacion + "\n");
		}
	}

	private List<String> permutacionRec(String cadena) {
		if (cadena.length() == 1) {
			List<String> base = new ArrayList<>();
			base.add(cadena);
			return base;
		}

		List<String> resultado = new ArrayList<>();

		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);

			String resto = cadena.substring(0, i) + cadena.substring(i + 1);

			for (String permutacion : permutacionRec(resto)) {
				resultado.add(letra + permutacion);
			}
		}

		return resultado;
	}
}
