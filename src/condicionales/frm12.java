package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtDia;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número :");
		lblNumero.setBounds(90, 50, 80, 30);
		getContentPane().add(lblNumero);

		JLabel lbtDia = new JLabel("Día de Semana :");
		lbtDia.setBounds(50, 90, 100, 30);
		getContentPane().add(lbtDia);

		txtNumero = new JTextField();
		txtNumero.setBounds( 150, 50, 70, 30);
		txtNumero.setHorizontalAlignment( SwingConstants.RIGHT );
		txtNumero.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtNumero);

		txtDia = new JTextField();
		txtDia.setBounds( 150, 90, 70, 30);
		txtDia.setHorizontalAlignment( SwingConstants.RIGHT );
		txtDia.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtDia);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 80, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {

        int numero = Integer.parseInt(txtNumero.getText());
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        if (numero >= 1 && numero <= 7) {
        	String diaSem = dias[numero - 1];
            txtDia.setText(diaSem);
        } else {
            txtDia.setText("Error");
        }
	}
}