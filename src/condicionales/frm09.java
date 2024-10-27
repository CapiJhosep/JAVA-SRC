package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCantidad, txtCodigo;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCodigo = new JLabel("Código :");
		lblCodigo.setBounds(50, 20, 80, 30);
		getContentPane().add(lblCodigo); 
		
		JLabel lblCantidad = new JLabel("Cantidad :");
		lblCantidad.setBounds(180, 20, 80, 30);
		getContentPane().add(lblCantidad); 
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(100, 20, 70, 30);
		txtCodigo.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCodigo.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtCodigo);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(240, 20, 70, 30);
		txtCantidad.setHorizontalAlignment( SwingConstants.RIGHT);
		txtCantidad.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidad);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(90, 60, 200, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int codigo = Integer.parseInt(txtCodigo.getText());
		int cantidad = Integer.parseInt(txtCantidad.getText());
		double precio;
		double descuento;
		
		if (codigo > 100 && codigo < 105) {
			precio = codigo == 101 ? 17 : codigo == 102 ? 25 : codigo == 103 ? 16 : 27;
		}
		else { txaRpta.append(String.format("No existe el código \n"));
			return;
		}
		
		double pago = cantidad * precio;
		
		if (cantidad <= 0) {
			txaRpta.append(String.format("La cantidad no puede ser 0"));
			return; 
        } 
		
        descuento = pago * (cantidad <= 10 ? 0.05 : (cantidad <= 20 ? 0.08 : (cantidad <= 30 ? 0.10 : 0.13)));
        
		
		double total = pago - descuento;
		
		txaRpta.setText("");
		txaRpta.append(String.format("Importe: \tS/%.2f\n", pago));
		txaRpta.append(String.format("Descuento: \tS/%.2f\n", descuento));
		txaRpta.append(String.format("Total: \tS/%.2f \n", total));

	}

}