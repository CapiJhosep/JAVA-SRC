package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCantidad, txtPrecio, txtDescuento, txtTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblCantidad = new JLabel("Cantidad: ");
		lblCantidad.setBounds(100, 30, 80, 30);
		getContentPane().add(lblCantidad);

		JLabel lblPrecio = new JLabel("Precio: ");
		lblPrecio.setBounds(100, 70, 80, 30);
		getContentPane().add(lblPrecio);

		JLabel lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(100, 110, 80, 30);
		getContentPane().add(lblDescuento);

		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(100, 150, 80, 30);
		getContentPane().add(lblTotal);
		
		txtCantidad = new JTextField();
		txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidad.setBounds(180, 30, 60, 30);
		txtCantidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrecio.setBounds(180, 70, 60, 30);
		txtPrecio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPrecio);
		
		txtDescuento = new JTextField();
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setBounds(180, 110, 60, 30);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setBounds(180, 150, 60, 30);
		txtTotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(150, 200, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
	    int cantidad = Integer.parseInt(txtCantidad.getText());
	    double precioPorUnidad;
	    double descuento;

	    if (cantidad > 51) {
	        precioPorUnidad = 23;
	        descuento = 0.15; 
	    } else if (cantidad > 25) {
	        precioPorUnidad = 25;
	        descuento = 0.05;
	    } else {
	        precioPorUnidad = 27;
	        descuento = 0.05; 
	    }

	    double precio = cantidad * precioPorUnidad;
	    double total = precio - (descuento * precio);

	    DecimalFormat df = new DecimalFormat("###.##");
	    txtPrecio.setText(df.format(precio));
	    txtDescuento.setText(df.format(descuento * precio));
	    txtTotal.setText(df.format(total));
	    
	}
	
}
