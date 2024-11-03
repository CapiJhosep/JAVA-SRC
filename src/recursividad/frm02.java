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

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtInvertido;

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
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(100, 30, 100, 30);
        getContentPane().add(lblNumero);

        JLabel lblInvertido = new JLabel("Invertido:");
        lblInvertido.setBounds(100, 70, 100, 30);
        getContentPane().add(lblInvertido);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtInvertido = new JTextField();
        txtInvertido.setBounds(180, 70, 80, 30);
        txtInvertido.setFocusable(false);
        txtInvertido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInvertido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInvertido);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 120, 100, 30);
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
        int invertido = invertirNumero(numero, 0);
        txtInvertido.setText(String.valueOf(invertido));
    }

    private int invertirNumero(int n, int invertido) {
        if (n == 0) {
            return invertido;
        } else {
            return invertirNumero(n / 10, invertido * 10 + n % 10);
        }
    }
}