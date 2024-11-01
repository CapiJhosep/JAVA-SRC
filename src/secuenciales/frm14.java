package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txt1, txt2, txt3, txt4, txt5, txtPromedio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lbl1 = new JLabel("Nota 1: ");
		lbl1.setBounds(30, 30, 80, 30);
		getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("Nota 2: ");
		lbl2.setBounds(155, 30, 80, 30);
		getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("Nota 3: ");
		lbl3.setBounds(280, 30, 80, 30);
		getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel("Nota 4: ");
		lbl4.setBounds(100, 71, 80, 30);
		getContentPane().add(lbl4);

		JLabel lbl5 = new JLabel("Nota 5: ");
		lbl5.setBounds(225, 71, 80, 30);
		getContentPane().add(lbl5);
		
		JLabel lblPromedio = new JLabel("Promedio: ");
		lblPromedio.setBounds(150, 140, 80, 30);
		getContentPane().add(lblPromedio);

		txt1 = new JTextField();
		txt1.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1.setBounds(75, 30, 60, 30);
		txt1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2.setBounds(200, 30, 60, 30);
		txt2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2);
		
		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.RIGHT);
		txt3.setBounds(325, 30, 60, 30);
		txt3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt3);
		
		txt4 = new JTextField();
		txt4.setHorizontalAlignment(SwingConstants.RIGHT);
		txt4.setBounds(150, 71, 60, 30);
		txt4.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt4);
		
		txt5 = new JTextField();
		txt5.setHorizontalAlignment(SwingConstants.RIGHT);
		txt5.setBounds(275, 71, 60, 30);
		txt5.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt5);
		
		txtPromedio = new JTextField();
		txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPromedio.setBounds(210, 140, 60, 30);
		txtPromedio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPromedio);
	
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		double not1 = Integer.parseInt(txt1.getText());
		double not2 = Integer.parseInt(txt2.getText());
		double not3 = Integer.parseInt(txt3.getText());
		double not4 = Integer.parseInt(txt4.getText());
		double not5 = Integer.parseInt(txt5.getText());
		
        Double[] notas = {not1, not2, not3, not4, not5};
        Arrays.sort(notas, Collections.reverseOrder());

        double promedio = (notas[0] + notas[1] + notas[2]) / 3;

		DecimalFormat df = new DecimalFormat("###.##");
		txtPromedio.setText( df.format(promedio));
	
	}
	
}