package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtTramo1, txtTramo2, txtTramo3, txtTramoTotal1, txtTramoTotal2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblTramo1 = new JLabel("Tramo 1 (km): ");
		lblTramo1.setBounds(110, 30, 85, 30);
		getContentPane().add(lblTramo1);

		JLabel lblTramo2 = new JLabel("Tramo 2 (ft): ");
		lblTramo2.setBounds(110, 70, 85, 30);
		getContentPane().add(lblTramo2);

		JLabel lblTramo3 = new JLabel("Tramo 3 (mi): ");
		lblTramo3.setBounds(110, 110, 85, 30);
		getContentPane().add(lblTramo3);
		
		JLabel lblTramoTotal1 = new JLabel("Tramo Total (m): ");
		lblTramoTotal1.setBounds(50, 150, 100, 30);
		getContentPane().add(lblTramoTotal1);
		
		JLabel lblTramoTotal2 = new JLabel("Tramo Total (yd): ");
		lblTramoTotal2.setBounds(220, 150, 100, 30);
		getContentPane().add(lblTramoTotal2);

		txtTramo1 = new JTextField();
		txtTramo1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTramo1.setBounds(210, 30, 60, 30);
		txtTramo1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTramo1);
		
		txtTramo2 = new JTextField();
		txtTramo2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTramo2.setBounds(210, 70, 60, 30);
		txtTramo2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTramo2);
		
		txtTramo3 = new JTextField();
		txtTramo3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTramo3.setBounds(210, 110, 60, 30);
		txtTramo3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTramo3);
		
		txtTramoTotal1 = new JTextField();
		txtTramoTotal1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTramoTotal1.setBounds(150, 150, 60, 30);
		txtTramoTotal1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTramoTotal1);
		
		txtTramoTotal2 = new JTextField();
		txtTramoTotal2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTramoTotal2.setBounds(320, 150, 60, 30);
		txtTramoTotal2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTramoTotal2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(200, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int tramo1 = Integer.parseInt(txtTramo1.getText());
		int tramo2 = Integer.parseInt(txtTramo2.getText());
		int tramo3 = Integer.parseInt(txtTramo3.getText());
		double tramoTotal1= (tramo1 * 1000) + (tramo2 / 3.28) + (tramo3 * 1609);
		double tramoTotal2 = (tramo1 * 1993.61) + (tramo2 / 3) + (tramo3 * 1760);
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtTramoTotal1.setText( df.format(tramoTotal1));
		txtTramoTotal2.setText( df.format(tramoTotal2));
		
	}
	
}