package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtCantidad, txtResult;

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
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
        JLabel lblNumero = new JLabel("Número : ");
        lblNumero.setBounds(100, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblCantidad = new JLabel("Cantidad : ");
        lblCantidad.setBounds(100, 70, 120, 30);
        getContentPane().add(lblCantidad);

        JLabel lblResult = new JLabel("Múltiplos: ");
        lblResult.setBounds(100, 110, 120, 30);
        getContentPane().add(lblResult);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 70, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(180, 70, 70, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        txtResult = new JTextField();
        txtResult.setBounds(180, 110, 70, 30);
        txtResult.setFocusable(false);
        txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResult.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResult);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 160, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
    	int numero = Integer.parseInt(txtNumero.getText());
    	int cantidad = Integer.parseInt(txtCantidad.getText());
    	StringBuilder resultado = new StringBuilder();

    	for (int i = 1; i <= cantidad; i++) {
    	    resultado.append(numero * i).append(" ");
    	}

    	txtResult.setText(resultado.toString().trim());
    }
}