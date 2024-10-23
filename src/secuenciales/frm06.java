package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtRadio, txtAltura, txtArea, txtVolumen;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblRadio = new JLabel("Radio: ");
		lblRadio.setBounds(120, 50, 60, 30);
		getContentPane().add(lblRadio);
		
		JLabel lblAltura = new JLabel("Altura: ");
		lblAltura.setBounds(120, 90, 60, 30);
		getContentPane().add(lblAltura);
		
		JLabel lblArea = new JLabel("Área: ");
		lblArea.setBounds(90, 130, 60, 30);
		getContentPane().add(lblArea);
		
		JLabel lblVolumen = new JLabel("Volumen: ");
		lblVolumen.setBounds(210, 130, 60, 30);
		getContentPane().add(lblVolumen);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(170, 50, 60, 30);
		txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRadio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRadio);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(170, 90, 60, 30);
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAltura);
		
		txtArea = new JTextField();
		txtArea.setBounds(130, 130, 60, 30);
		txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
		txtArea.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtArea);
		
		txtVolumen = new JTextField();
		txtVolumen.setBounds(270, 130, 60, 30);
		txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVolumen.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVolumen);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 170, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int radio = Integer.parseInt(txtRadio.getText());
		int altura = Integer.parseInt(txtAltura.getText());

		double area = 2 * 3.1416 * ( radio + altura );
		double volumen = 3.1416 * ( radio * radio ) * altura;

		DecimalFormat df = new DecimalFormat("###.##");
		txtArea.setText( df.format(area));
		txtVolumen.setText( df.format(volumen));

	}

}