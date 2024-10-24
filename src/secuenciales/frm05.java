package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtGigabytes, txtMegabytes, txtKilobytes, txtBytes;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblGigabytes = new JLabel("Gigabytes : ");
		lblGigabytes.setBounds(110, 30, 85, 30);
		getContentPane().add(lblGigabytes);

		JLabel lblMegabytes = new JLabel("Megabytes : ");
		lblMegabytes.setBounds(110, 70, 85, 30);
		getContentPane().add(lblMegabytes);

		JLabel lblKilobytes = new JLabel("Kilobytes : ");
		lblKilobytes.setBounds(110, 110, 85, 30);
		getContentPane().add(lblKilobytes);
		
		JLabel lblBytes = new JLabel("Bytes : ");
		lblBytes.setBounds(110, 150, 85, 30);
		getContentPane().add(lblBytes);
		
		txtGigabytes = new JTextField();
		txtGigabytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGigabytes.setBounds(200, 30, 100, 30);
		txtGigabytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtGigabytes);
		
		txtMegabytes = new JTextField();
		txtMegabytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMegabytes.setBounds(200, 70, 100, 30);
		txtMegabytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMegabytes);

		txtKilobytes = new JTextField();
		txtKilobytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKilobytes.setBounds(200, 110, 100, 30);
		txtKilobytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtKilobytes);
		
		txtBytes = new JTextField();
		txtBytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBytes.setBounds(200, 150, 100, 30);
		txtBytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBytes);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int giga = Integer.parseInt(txtGigabytes.getText());

		double mega = giga * 1024;
		double kilo = giga * 1048576;
		double bytes = giga * 1073741824;
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtMegabytes.setText( df.format(mega));
		txtKilobytes.setText( df.format(kilo));
		txtBytes.setText( df.format(bytes));
		
	}
}
