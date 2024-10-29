package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMultiplicando, txtMultiplicador, txtProducto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando :");
		lblMultiplicando.setBounds(70, 50, 100, 30);
		getContentPane().add(lblMultiplicando); 
		
		JLabel lblMultiplicador = new JLabel("Multiplicador :");
		lblMultiplicador.setBounds(70, 90, 100, 30);
		getContentPane().add(lblMultiplicador); 
		
		JLabel lblProducto = new JLabel("Producto :");
		lblProducto.setBounds(70, 130, 100, 30);
		getContentPane().add(lblProducto);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 50, 70, 30);
		txtMultiplicando.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMultiplicando.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtMultiplicando);
		
		txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(180, 90, 70, 30);
		txtMultiplicador.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMultiplicador.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtMultiplicador);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(180, 130, 70, 30);
		txtProducto.setHorizontalAlignment( SwingConstants.RIGHT);
		txtProducto.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtProducto);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(130, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int multiplicando = Integer.parseInt(txtMultiplicando.getText());
		int multiplicador = Integer.parseInt(txtMultiplicador.getText());
		int producto = 0;
		
		while ( multiplicador > 0 ) {
			multiplicador -= 1;
			producto += multiplicando;
		}
		txtProducto.setText(String.valueOf(producto));
		
	}

}	