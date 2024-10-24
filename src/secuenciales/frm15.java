package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm15 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtJuan, txtRosa, txtTotal, txtDaniel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblJuan = new JLabel("Aporte de Juan : ");
		lblJuan.setBounds(100, 30, 100, 30);
		getContentPane().add(lblJuan);

		JLabel lblRosa = new JLabel("Aporte de Rosa : ");
		lblRosa.setBounds(100, 70, 100, 30);
		getContentPane().add(lblRosa);

		JLabel lblDaniel = new JLabel("Aporte de Daniel : ");
		lblDaniel.setBounds(100, 110, 105, 30);
		getContentPane().add(lblDaniel);
		
		JLabel lblTotal = new JLabel("Total (dólares) : ");
		lblTotal.setBounds(100, 150, 100, 30);
		getContentPane().add(lblTotal);

		txtJuan = new JTextField();
		txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
		txtJuan.setBounds(210, 30, 60, 30);
		txtJuan.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtJuan);
		
		txtRosa = new JTextField();
		txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRosa.setBounds(210, 70, 60, 30);
		txtRosa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRosa);
		
		txtDaniel = new JTextField();
		txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDaniel.setBounds(210, 110, 60, 30);
		txtDaniel.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDaniel);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setBounds(210, 150, 60, 30);
		txtTotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(180, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int aJuan = Integer.parseInt(txtJuan.getText());
		double aRosa = Integer.parseInt(txtRosa.getText());
		double aDaniel = Integer.parseInt(txtDaniel.getText());
		
		double total = aJuan + aRosa + (aDaniel / 3);
				
		DecimalFormat df = new DecimalFormat("###.##");
		txtTotal.setText( df.format(total));
	
	}	
}


