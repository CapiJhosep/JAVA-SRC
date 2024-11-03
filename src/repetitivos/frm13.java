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

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtSuma;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm13() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Números : ");
        lblNumero.setBounds(100, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblSuma = new JLabel("Suma : ");
        lblSuma.setBounds(100, 70, 120, 30);
        getContentPane().add(lblSuma);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtSuma = new JTextField();
        txtSuma.setBounds(180, 70, 80, 30);
        txtSuma.setFocusable(false);
        txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSuma.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSuma);

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
        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                suma += i;
            }
        }

        txtSuma.setText(String.valueOf(suma));
    }
}