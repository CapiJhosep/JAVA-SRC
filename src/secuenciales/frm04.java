package secuenciales;

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
	JTextField txtPies, txtPulgadas, txtEstatura;
	
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

		JLabel lblPies = new JLabel("Medida (ft): ");
		lblPies.setBounds(110, 30, 85, 30);
		getContentPane().add(lblPies);

		JLabel lblPulgadas = new JLabel("Medida (in): ");
		lblPulgadas.setBounds(110, 70, 85, 30);
		getContentPane().add(lblPulgadas);

		JLabel lblEstatura = new JLabel("Estatura (m): ");
		lblEstatura.setBounds(110, 110, 85, 30);
		getContentPane().add(lblEstatura);
		
		txtPies = new JTextField();
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setBounds(210, 30, 60, 30);
		txtPies.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPies);
		
		txtPulgadas = new JTextField();
		txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPulgadas.setBounds(210, 70, 60, 30);
		txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPulgadas);
		txtEstatura = new JTextField();
		txtEstatura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEstatura.setBounds(210, 110, 60, 30);
		txtEstatura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEstatura);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(180, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int pies = Integer.parseInt(txtPies.getText());
		int pulgadas = Integer.parseInt(txtPulgadas.getText());

		double estatura= (pies * 0.3048) + (pulgadas * 0.0254);
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtEstatura.setText( df.format(estatura));
		
	}
	
}