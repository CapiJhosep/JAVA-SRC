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

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtDivisores;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm03() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
        JLabel lblNumero = new JLabel("Número : ");
        lblNumero.setBounds(120, 50, 100, 30);
        getContentPane().add(lblNumero);

        JLabel lblDivisores = new JLabel("Divisores : ");
        lblDivisores.setBounds(120, 90, 100, 30);
        getContentPane().add(lblDivisores);

        txtNumero = new JTextField();
        txtNumero.setBounds(190, 50, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtDivisores = new JTextField();
        txtDivisores.setBounds(190, 90, 60, 30);
        txtDivisores.setFocusable(false);
        txtDivisores.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDivisores.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisores);

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

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        txtDivisores.setText(String.valueOf(divisores));
    }
}