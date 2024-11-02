package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm37 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtPamela, txtCarol, txtFanny, txtResultado;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm37 frame = new frm37();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm37() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblPamela = new JLabel("Votos de Pamela : ");
		lblPamela.setBounds(80, 30, 110, 30);
		getContentPane().add(lblPamela);

		JLabel lblCarol = new JLabel("Votos de Carol : ");
		lblCarol.setBounds(80, 70, 110, 30);
		getContentPane().add(lblCarol);

		JLabel lblFanny = new JLabel("Votos de Fanny : ");
		lblFanny.setBounds(80, 110, 110, 30);
		getContentPane().add(lblFanny);
		
		JLabel lblResultado = new JLabel("Resultado : ");
		lblResultado.setBounds(80, 150, 110, 30);
		getContentPane().add(lblResultado);
		
		txtPamela = new JTextField();
		txtPamela.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPamela.setBounds(200, 30, 70, 30);
		txtPamela.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPamela);
		
		txtCarol = new JTextField();
		txtCarol.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCarol.setBounds(200, 70, 70, 30);
		txtCarol.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCarol);

		txtFanny = new JTextField();
		txtFanny.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFanny.setBounds(200, 110, 70, 30);
		txtFanny.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtFanny);
		
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setBounds(150, 150, 150, 30);
		txtResultado.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 190, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		int Pamela = Integer.parseInt(txtPamela.getText());
		int Carol = Integer.parseInt(txtCarol.getText());
		int Fanny = Integer.parseInt(txtFanny.getText());

		int total = Pamela + Carol + Fanny;
		int paraGanar = total / 2 + 1;
		String resultado;

		if (Pamela >= paraGanar) resultado = "Gana Pamela";
		else if (Carol >= paraGanar) resultado = "Gana Carol";
		else if (Fanny >= paraGanar) resultado = "Gana Fanny";
		else if ((Pamela == Carol && Carol == Fanny) || (Pamela == Carol && Carol > Fanny) || (Pamela == Fanny && Fanny > Carol) || (Carol == Fanny && Fanny > Pamela)) 
			resultado = "Empate";
		else if (Pamela > Carol && Pamela > Fanny) {
			if (Carol > Fanny) resultado = "Pasan: Pamela y Carol";
			else resultado = "Pasan: Pamela y Fanny";
		}		    
		else if (Carol > Pamela && Carol > Fanny) {
			if (Pamela > Fanny) resultado = "Pasan: Carol y Pamela";
			 else resultado = "Pasan: Carol y Fanny";
		}
		else {
			if (Pamela > Carol) resultado = "Pasan: Fanny y Pamela";
			 else resultado = "Pasan: Fanny y Carol";
				    
		}
		
		txtResultado.setText(resultado);
	}
}
