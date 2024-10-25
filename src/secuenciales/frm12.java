package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtA, txtB, txtC, txtX1, txtX2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblRaiz = new JLabel("Ax^2 + Bx + C");
		lblRaiz.setBounds(150, 10, 100, 30);
		getContentPane().add(lblRaiz);
		
		JLabel lblA = new JLabel("Valor de A: ");
		lblA.setBounds(110, 50, 85, 30);
		getContentPane().add(lblA);

		JLabel lblB = new JLabel("Valor de B: ");
		lblB.setBounds(110, 90, 85, 30);
		getContentPane().add(lblB);

		JLabel lblC = new JLabel("Valor de C: ");
		lblC.setBounds(110, 130, 85, 30);
		getContentPane().add(lblC);
		
		JLabel lblX1 = new JLabel("1ª Raìz: ");
		lblX1.setBounds(70, 170, 100, 30);
		getContentPane().add(lblX1);
		
		JLabel lblX2 = new JLabel("2ª Raìz: ");
		lblX2.setBounds(220, 170, 100, 30);
		getContentPane().add(lblX2);

		txtA = new JTextField();
		txtA.setHorizontalAlignment(SwingConstants.RIGHT);
		txtA.setBounds(190, 50, 60, 30);
		txtA.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtA);
		
		txtB = new JTextField();
		txtB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtB.setBounds(190, 90, 60, 30);
		txtB.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtB);
		
		txtC = new JTextField();
		txtC.setHorizontalAlignment(SwingConstants.RIGHT);
		txtC.setBounds(190, 130, 60, 30);
		txtC.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtC);
		
		txtX1 = new JTextField();
		txtX1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtX1.setBounds(130, 170, 60, 30);
		txtX1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtX1);
		
		txtX2 = new JTextField();
		txtX2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtX2.setBounds(280, 170, 60, 30);
		txtX2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtX2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(180, 210, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int a = Integer.parseInt(txtA.getText());
		int b = Integer.parseInt(txtB.getText());
		int c = Integer.parseInt(txtC.getText());
		
		double discriminante = (b * b) - (4 * a * c);
		double raiz = Math.sqrt(discriminante);
		double x1 = (-b + raiz) / (2 * a);
		double x2 = (-b - raiz) / (2 * a);
				
		DecimalFormat df = new DecimalFormat("###.##");
		txtX1.setText( df.format(x1));
		txtX2.setText( df.format(x2));

	}
	
}
