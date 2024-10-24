package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero1, txtNumero2, txtNuevo1, txtNuevo2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNummero1 = new JLabel("Numero 1 : ");
		lblNummero1.setBounds(100, 50, 100, 30);
		getContentPane().add(lblNummero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2 : ");
		lblNumero2.setBounds(100, 90, 100, 30);
		getContentPane().add(lblNumero2);
		
		JLabel lblNuevo1 = new JLabel("1° Nuevo : ");
		lblNuevo1.setBounds(70, 130, 100, 30);
		getContentPane().add(lblNuevo1);
		
		JLabel lblNuevo2 = new JLabel("2° Nuevo : ");
		lblNuevo2.setBounds(210, 130, 100, 30);
		getContentPane().add(lblNuevo2);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(170, 50, 60, 30);
		txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero1);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(170, 90, 60, 30);
		txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero2);
		
		txtNuevo1 = new JTextField();
		txtNuevo1.setBounds(130, 130, 60, 30);
		txtNuevo1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNuevo1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNuevo1);
		
		txtNuevo2 = new JTextField();
		txtNuevo2.setBounds(270, 130, 60, 30);
		txtNuevo2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNuevo2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNuevo2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 170, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int numero1 = Integer.parseInt(txtNumero1.getText());
		int numero2 = Integer.parseInt(txtNumero2.getText());

		double cif1Num1 = Math.round(numero1 / 100);
		double cif2Num1 = Math.round(numero1 / 10) % 10;
		double cif3Num1 = numero1 % 10;

		int cif1Num2 = Math.round(numero2 / 100);
		int cif2Num2 = Math.round(numero2 / 10) % 10;
	    int cif3Num2 = numero2 % 10;

	    int nuevoNum1 = (int) (cif3Num2 * 100 + cif2Num1 * 10 + cif1Num2);
	    int nuevoNum2 = (int) (cif3Num1 * 100 + cif2Num2 *10 + cif1Num1);

		DecimalFormat df = new DecimalFormat("###.##");
		txtNuevo1.setText( df.format(nuevoNum1));
		txtNuevo2.setText( df.format(nuevoNum2));
		
	}
}
