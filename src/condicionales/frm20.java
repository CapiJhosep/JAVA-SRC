package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm20 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txt1, txt2, txt3, txtOrden;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lbl1 = new JLabel("Nùmero 1: ");
		lbl1.setBounds(100, 30, 100, 30);
		getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("Nùmero 2: ");
		lbl2.setBounds(100, 70, 100, 30);
		getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("Nùmero 3: ");
		lbl3.setBounds(100, 110, 100, 30);
		getContentPane().add(lbl3);

		JLabel lblOrden = new JLabel("Orden: ");
		lblOrden.setBounds(100, 150, 100, 30);
		getContentPane().add(lblOrden);
		
		txt1 = new JTextField();
		txt1.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1.setBounds(180, 30, 60, 30);
		txt1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2.setBounds(180, 70, 60, 30);
		txt2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2);
		
		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.RIGHT);
		txt3.setBounds(180, 110, 60, 30);
		txt3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt3);
		
		txtOrden = new JTextField();
		txtOrden.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOrden.setBounds(180, 150, 100, 30);
		txtOrden.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtOrden);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(150, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int num1 = Integer.parseInt(txt1.getText());
		int num2 = Integer.parseInt(txt2.getText());
		int num3 = Integer.parseInt(txt3.getText());
		
		if (num1 < num2 && num2 < num3) txtOrden.setText("Ascendente");
		else if (num1 > num2 && num2 > num3) txtOrden.setText("Descendente");
		else txtOrden.setText("Desorden");
		
	}
	
}
