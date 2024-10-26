package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txt1, txt2, txt3, txtPropina;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lbl1 = new JLabel("Nota 1 : ");
		lbl1.setBounds(110, 30, 85, 30);
		getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("Nota 2 : ");
		lbl2.setBounds(110, 70, 85, 30);
		getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("Nota 3 : ");
		lbl3.setBounds(110, 110, 85, 30);
		getContentPane().add(lbl3);
		
		JLabel lblPromedio = new JLabel("Propina : ");
		lblPromedio.setBounds(110, 150, 85, 30);
		getContentPane().add(lblPromedio);
		
		txt1 = new JTextField();
		txt1.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1.setBounds(200, 30, 70, 30);
		txt1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2.setBounds(200, 70, 70, 30);
		txt2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2);

		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.RIGHT);
		txt3.setBounds(200, 110, 70, 30);
		txt3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt3);
		
		txtPropina = new JTextField();
		txtPropina.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPropina.setBounds(200, 150, 70, 30);
		txtPropina.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPropina);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		double nota1 = Integer.parseInt(txt1.getText());
		double nota2 = Integer.parseInt(txt2.getText());
		double nota3 = Integer.parseInt(txt3.getText());
		double propina;
		
		if ( nota1 > 10.5 && nota2 > 10.5 && nota3 > 10.5) {
			propina = 20 + 5*3; 
		}
		else if ( (nota1 > 10.5 && nota2 > 10.5) || (nota1 > 10.5 && nota3 > 10.5) || (nota2 > 10.5 && nota3 > 10.5) ) {
			propina = 20 + 5*2;
		}
		else if ( (nota1 > 10.5) || (nota2 > 10.5) || (nota3 > 10.5) ) {
			propina = 20 + 5;
		}
		else {
			propina = 20;
		}
		DecimalFormat df = new DecimalFormat("###.##");
		txtPropina.setText( df.format(propina));
		
	}

}
