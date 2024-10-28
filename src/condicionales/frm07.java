package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txt1, txt2, txt3, txtIntermedio;
	
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

		JLabel lbl1 = new JLabel("Número 1 : ");
		lbl1.setBounds(110, 30, 85, 30);
		getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("Número 2 : ");
		lbl2.setBounds(110, 70, 85, 30);
		getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("Número 3 : ");
		lbl3.setBounds(110, 110, 85, 30);
		getContentPane().add(lbl3);
		
		JLabel lblIntermedio = new JLabel("Número Intermedio : ");
		lblIntermedio.setBounds(70, 150, 120, 30);
		getContentPane().add(lblIntermedio);
		
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
		
		txtIntermedio = new JTextField();
		txtIntermedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIntermedio.setBounds(200, 150, 70, 30);
		txtIntermedio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtIntermedio);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int num1 = Integer.parseInt(txt1.getText());
		int num2 = Integer.parseInt(txt2.getText());
		int num3 = Integer.parseInt(txt3.getText());		
		int intermedio;

        if (num1 > num2) {
            if (num1 < num3) {
                intermedio = num1;
            } else if (num2 > num3) {
                intermedio = num2;
            } else {
                intermedio = num3;
            }
        } else {
            if (num1 > num3) {
                intermedio = num1;
            } else if (num2 < num3) {
                intermedio = num2;
            } else {
                intermedio = num3;
            }
        }
        txtIntermedio.setText(String.valueOf(intermedio));
		
	}

}
