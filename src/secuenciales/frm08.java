package secuenciales;

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
	JTextField txtRadio, txtAltura, txtLateral, txtBase, txtArea;

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
		
		JLabel lblRadio = new JLabel("Radio: ");
		lblRadio.setBounds(70, 50, 60, 30);
		getContentPane().add(lblRadio);
		
		JLabel lblAltura = new JLabel("Altura: ");
		lblAltura.setBounds(195, 50, 60, 30);
		getContentPane().add(lblAltura);
		
		JLabel lblBase = new JLabel("Área Base: ");
		lblBase.setBounds(110, 90, 80, 30);
		getContentPane().add(lblBase);
		
		JLabel lblLateral = new JLabel("Área Lateral: ");
		lblLateral.setBounds(110, 130, 80, 30);
		getContentPane().add(lblLateral);
		
		JLabel lblArea = new JLabel("Área Total: ");
		lblArea.setBounds(110, 170, 80, 30);
		getContentPane().add(lblArea);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(110, 50, 60, 30);
		txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRadio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRadio);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(240, 50, 60, 30);
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAltura);
		
		txtBase = new JTextField();
		txtBase.setBounds(190, 90, 60, 30);
		txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBase);
		
		txtLateral = new JTextField();
		txtLateral.setBounds(190, 130, 60, 30);
		txtLateral.setHorizontalAlignment(SwingConstants.RIGHT);
		txtLateral.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtLateral);
		
		txtArea = new JTextField();
		txtArea.setBounds(190, 170, 60, 30);
		txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
		txtArea.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtArea);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int radio = Integer.parseInt(txtRadio.getText());
		int altura = Integer.parseInt(txtAltura.getText());

		double aBase = 3.1416 * ( radio * radio );
		double aLateral = 2 * 3.1416 *  radio * altura;
		double aTotal = 2 * aBase *  aLateral;
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtBase.setText( df.format(aBase));
		txtLateral.setText( df.format(aLateral));
		txtArea.setText( df.format(aTotal));
		
	}
}

