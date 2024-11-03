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

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtMCD;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm05 frame = new frm05();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm05() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1 : ");
        lblNumero1.setBounds(80, 30, 120, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2 : ");
        lblNumero2.setBounds(80, 70, 120, 30);
        getContentPane().add(lblNumero2);

        JLabel lblMCD = new JLabel("MCD:");
        lblMCD.setBounds(100, 110, 120, 30);
        getContentPane().add(lblMCD);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(180, 30, 70, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(180, 70, 70, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

        txtMCD = new JTextField();
        txtMCD.setBounds(180, 110, 70, 30);
        txtMCD.setFocusable(false);
        txtMCD.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMCD.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMCD);

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
        int numero1 = Integer.parseInt(txtNumero1.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());
        int resultado = mcd(numero1, numero2);
        txtMCD.setText(String.valueOf(resultado));
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }
}
