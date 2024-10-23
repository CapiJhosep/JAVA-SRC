package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtBase, txtAltura, txtArea, txtPerimetro;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblBase = new JLabel("Base: ");
		lblBase.setBounds(120, 50, 60, 30);
		getContentPane().add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura: ");
		lblAltura.setBounds(120, 90, 60, 30);
		getContentPane().add(lblAltura);
		
		JLabel lblArea = new JLabel("Área: ");
		lblArea.setBounds(90, 130, 60, 30);
		getContentPane().add(lblArea);
		
		JLabel lblPerimetro = new JLabel("Perimetro: ");
		lblPerimetro.setBounds(210, 130, 80, 30);
		getContentPane().add(lblPerimetro);
		
		txtBase = new JTextField();
		txtBase.setBounds(170, 50, 60, 30);
		txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBase);
		
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
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(280, 130, 60, 30);
		txtPerimetro.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPerimetro.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPerimetro);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 170, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int base = Integer.parseInt(txtBase.getText());
		int altura = Integer.parseInt(txtAltura.getText());

		double area = base * altura;
		double perimetro = 2 * ( base + altura );

		DecimalFormat df = new DecimalFormat("###.##");
		txtArea.setText( df.format(area));
		txtPerimetro.setText( df.format(perimetro));

	}

}