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

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtBase, txtLogaritmo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm08 frame = new frm08();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número : ");
        lblNumero.setBounds(100, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblBase = new JLabel("Base : ");
        lblBase.setBounds(100, 70, 120, 30);
        getContentPane().add(lblBase);

        JLabel lblLogaritmo = new JLabel("Logaritmo : ");
        lblLogaritmo.setBounds(100, 110, 120, 30);
        getContentPane().add(lblLogaritmo);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 70, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtBase = new JTextField();
        txtBase.setBounds(180, 70, 70, 30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        txtLogaritmo = new JTextField();
        txtLogaritmo.setBounds(180, 110, 70, 30);
        txtLogaritmo.setFocusable(false);
        txtLogaritmo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtLogaritmo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtLogaritmo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 150, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    private void btnCalcular_actionPerformed() {
            double numero = Double.parseDouble(txtNumero.getText());
            double base = Double.parseDouble(txtBase.getText());

            double resultado = logaritmoRec(numero, base);

            if (resultado == -1) {
                txtLogaritmo.setText("Error");
            } else {
                txtLogaritmo.setText(String.valueOf(resultado));
            }
    }
    

    public static double logaritmoRec(double a, double b) {
        if (b <= 0 || b == 1) {
            System.out.println("La base debe ser mayor que 0 y diferente de 1.");
            return -1; 
        } else {
            return Math.log(a) / Math.log(b);
        }
    }
}
