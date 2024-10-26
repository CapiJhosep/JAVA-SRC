package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtAngulo, txtTipo;
	
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
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblAngulo = new JLabel("Ángulo :");
		lblAngulo.setBounds(50, 50, 80, 30);
		getContentPane().add(lblAngulo);

		JLabel lblTipo = new JLabel("Tipo :");
		lblTipo.setBounds(50, 90, 80, 30);
		getContentPane().add(lblTipo);

		txtAngulo = new JTextField();
		txtAngulo.setBounds( 130, 50, 70, 30);
		txtAngulo.setHorizontalAlignment( SwingConstants.RIGHT );
		txtAngulo.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtAngulo);

		txtTipo = new JTextField();
		txtTipo.setBounds( 130, 90, 70, 30);
		txtTipo.setHorizontalAlignment( SwingConstants.RIGHT );
		txtTipo.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtTipo);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 80, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		double angulo =  Integer.parseInt( txtAngulo.getText() );
		if ( angulo == 0 ) txtTipo.setText("Nulo");
		else if ( angulo > 0 && angulo < 90) txtTipo.setText("Agudo");
		else if ( angulo == 90 ) txtTipo.setText("Recto");
		else if ( angulo > 90 && angulo < 180) txtTipo.setText("Obtuso");
		else if ( angulo == 180 ) txtTipo.setText("Llano");
		else if ( angulo > 180 && angulo < 360 ) txtTipo.setText("Cóncavo");
		else if ( angulo == 360 ) txtTipo.setText("Completo");

	}

}