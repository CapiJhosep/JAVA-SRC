package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm16 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtHoras, txtTarifa, txtBasico, txtBruto, txtNeto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblHoras = new JLabel("Horas: ");
		lblHoras.setBounds(65, 50, 60, 30);
		getContentPane().add(lblHoras);
		
		JLabel lblTarifa = new JLabel("Tarifa: ");
		lblTarifa.setBounds(195, 50, 60, 30);
		getContentPane().add(lblTarifa);
		
		JLabel lblBasico = new JLabel("Sueldo Básico: ");
		lblBasico.setBounds(100, 90, 100, 30);
		getContentPane().add(lblBasico);
		
		JLabel lblBruto = new JLabel("Sueldo Bruto: ");
		lblBruto.setBounds(100, 130, 100, 30);
		getContentPane().add(lblBruto);
		
		JLabel lblNeto = new JLabel("Sueldo Neto: ");
		lblNeto.setBounds(100, 170, 100, 30);
		getContentPane().add(lblNeto);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(110, 50, 60, 30);
		txtHoras.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHoras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHoras);
		
		txtTarifa = new JTextField();
		txtTarifa.setBounds(240, 50, 60, 30);
		txtTarifa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTarifa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTarifa);
		
		txtBasico = new JTextField();
		txtBasico.setBounds(190, 90, 60, 30);
		txtBasico.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBasico.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBasico);
		
		txtBruto = new JTextField();
		txtBruto.setBounds(190, 130, 60, 30);
		txtBruto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBruto);
		
		txtNeto = new JTextField();
		txtNeto.setBounds(190, 170, 60, 30);
		txtNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNeto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNeto);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		double horas = Integer.parseInt(txtHoras.getText());
		double tarifa = Integer.parseInt(txtTarifa.getText());

		double basico = horas * tarifa;
		double bonificacion = basico * 20/100;
		double bruto = basico + bonificacion;
		double descuento = bruto * 10/100;
		double neto = bruto - descuento;
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtBasico.setText( df.format(basico));
		txtBruto.setText( df.format(bruto));
		txtNeto.setText( df.format(neto));
		
	}
}

