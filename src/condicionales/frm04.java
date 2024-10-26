package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txt1, txt2, txt3, txtPromedio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
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
		
		JLabel lblPromedio = new JLabel("Promedio : ");
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
		
		txtPromedio = new JTextField();
		txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPromedio.setBounds(200, 150, 70, 30);
		txtPromedio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPromedio);
		
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
		double promedio;
		
		if (nota3 > 10) {
			promedio = (nota1 + nota2 + nota3 + 3) / 3; 
		}
		else {
			promedio = (nota1 + nota2 + nota3) / 3;
		}
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtPromedio.setText( df.format(promedio));
		
	}

}

