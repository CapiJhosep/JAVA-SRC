package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtDigitos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm07 frame = new frm07();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm07() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número : ");
        lblNumero.setBounds(100, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblDigitos = new JLabel("Dígitos : ");
        lblDigitos.setBounds(100, 70, 120, 30);
        getContentPane().add(lblDigitos);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 70, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtDigitos = new JTextField();
        txtDigitos.setBounds(180, 70, 70, 30);
        txtDigitos.setFocusable(false);
        txtDigitos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDigitos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDigitos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 120, 100, 30);
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
        int digito = contarDigitos(numero);
        txtDigitos.setText(String.valueOf(digito));
    }

    private int contarDigitos(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + contarDigitos(n / 10);
        }
    }
}