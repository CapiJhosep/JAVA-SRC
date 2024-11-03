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

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtTexto, txtPalindromo;

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
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblTexto = new JLabel("Texto:");
        lblTexto.setBounds(100, 30, 120, 30);
        getContentPane().add(lblTexto);

        JLabel lblPalindromo = new JLabel("Es Palíndromo:");
        lblPalindromo.setBounds(100, 70, 120, 30);
        getContentPane().add(lblPalindromo);

        txtTexto = new JTextField();
        txtTexto.setBounds(180, 30, 100, 30);
        txtTexto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTexto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTexto);

        txtPalindromo = new JTextField();
        txtPalindromo.setBounds(200, 70, 70, 30);
        txtPalindromo.setFocusable(false);
        txtPalindromo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPalindromo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPalindromo);

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
        String texto = txtTexto.getText();
        boolean resultado = esPalindromo(texto, 0, texto.length() - 1);
        txtPalindromo.setText(resultado ? "Sí" : "No");
    }

    private boolean esPalindromo(String texto, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        } else if (texto.charAt(inicio) != texto.charAt(fin)) {
            return false;
        } else {
            return esPalindromo(texto, inicio + 1, fin - 1);
        }
    }
}