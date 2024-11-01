package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm30 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCuota, txtDia, txtPago;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm30 frame = new frm30();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm30() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblCuota = new JLabel("Cuotas : ");
		lblCuota.setBounds(110, 30, 85, 30);
		getContentPane().add(lblCuota);

		JLabel lblDia = new JLabel("Días : ");
		lblDia.setBounds(110, 70, 85, 30);
		getContentPane().add(lblDia);

		JLabel lblPago = new JLabel("Pago : ");
		lblPago.setBounds(110, 110, 85, 30);
		getContentPane().add(lblPago);

		txtCuota = new JTextField();
		txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCuota.setBounds(200, 30, 60, 30);
		txtCuota.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCuota);
		
		txtDia = new JTextField();
		txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia.setBounds(200, 70, 60, 30);
		txtDia.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDia);
		
		txtPago = new JTextField();
		txtPago.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPago.setBounds(200, 110, 60, 30);
		txtPago.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPago);	
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(180, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		double cuota = Integer.parseInt(txtCuota.getText());
		int dia = Integer.parseInt(txtDia.getText());
		double descuento;
		double recargo;
		double pago;
		
		if (dia <= 10) {
			descuento = Math.max(5, cuota * 0.02);
			pago = cuota - descuento;
		}
		else if (dia > 10 && dia <= 20) {
			descuento = 0;
			pago = cuota;
		}
		else {
			recargo = Math.max(10, cuota * 0.03);
			pago = cuota + recargo;
		}
		
		DecimalFormat df = new DecimalFormat("###.##");
		txtPago.setText( df.format(pago));	}
	
}