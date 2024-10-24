package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm13 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCateto1, txtCateto2, txtHipotenusa;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblCateto1 = new JLabel("Cateto 1 : ");
		lblCateto1.setBounds(110, 30, 85, 30);
		getContentPane().add(lblCateto1);

		JLabel lblCateto2 = new JLabel("Cateto 2 : ");
		lblCateto2.setBounds(110, 70, 85, 30);
		getContentPane().add(lblCateto2);

		JLabel lblHipotenusa = new JLabel("Hipotenusa : ");
		lblHipotenusa.setBounds(110, 110, 85, 30);
		getContentPane().add(lblHipotenusa);

		txtCateto1 = new JTextField();
		txtCateto1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCateto1.setBounds(200, 30, 60, 30);
		txtCateto1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCateto1);
		
		txtCateto2 = new JTextField();
		txtCateto2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCateto2.setBounds(200, 70, 60, 30);
		txtCateto2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCateto2);
		
		txtHipotenusa = new JTextField();
		txtHipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHipotenusa.setBounds(200, 110, 60, 30);
		txtHipotenusa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHipotenusa);	
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(180, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int cateto1 = Integer.parseInt(txtCateto1.getText());
		int cateto2 = Integer.parseInt(txtCateto2.getText());
		
		double hipotenusa = Math.sqrt((Math.pow(cateto1,2) + Math.pow(cateto2,2)));
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtHipotenusa.setText( df.format(hipotenusa));
		
	}
	
}