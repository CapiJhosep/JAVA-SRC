package condicionales;

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
	JTextField txt1, txt2, txt3, txtMayor;
	
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

		JLabel lbl1 = new JLabel("Edad 1 : ");
		lbl1.setBounds(110, 30, 85, 30);
		getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("Edad 2 : ");
		lbl2.setBounds(110, 70, 85, 30);
		getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("Edad 3 : ");
		lbl3.setBounds(110, 110, 85, 30);
		getContentPane().add(lbl3);
		
		JLabel lblPromedio = new JLabel("Edad Mayor : ");
		lblPromedio.setBounds(110, 150, 85, 30);
		getContentPane().add(lblPromedio);
		
		txt1 = new JTextField();
		txt1.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1.setBounds(200, 30, 50, 30);
		txt1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2.setBounds(200, 70, 50, 30);
		txt2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2);

		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.RIGHT);
		txt3.setBounds(200, 110, 50, 30);
		txt3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt3);
		
		txtMayor = new JTextField();
		txtMayor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMayor.setBounds(200, 150, 50, 30);
		txtMayor.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMayor);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int edad1 = Integer.parseInt(txt1.getText());
		int edad2 = Integer.parseInt(txt2.getText());
		int edad3 = Integer.parseInt(txt3.getText());
		int mayor;
		
		if (edad1 >= edad2 && edad1 >= edad3) {
			mayor = edad1; 
		}
		else if (edad2 >= edad1 && edad2 >= edad3){
			mayor = edad2;
		}
		else {
			mayor = edad3;
		}
		DecimalFormat df = new DecimalFormat("###.##");
		txtMayor.setText( df.format(mayor));
		
	}

}

