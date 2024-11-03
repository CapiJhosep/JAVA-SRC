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

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCadena, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm15 frame = new frm15();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm15() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblCadena = new JLabel("Cadena : ");
        lblCadena.setBounds(100, 30, 120, 30);
        getContentPane().add(lblCadena);

        JLabel lblResultado = new JLabel("Resultado : ");
        lblResultado.setBounds(100, 70, 120, 30);
        getContentPane().add(lblResultado);

        txtCadena = new JTextField();
        txtCadena.setBounds(180, 30, 150, 30);
        txtCadena.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCadena.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCadena);

        txtResultado = new JTextField();
        txtResultado.setBounds(180, 70, 150, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnMayusculas = new JButton("Mayúsculas");
        btnMayusculas.setBounds(50, 120, 120, 30);
        btnMayusculas.setMnemonic('M');
        getContentPane().add(btnMayusculas);

        JButton btnMinusculas = new JButton("Minúsculas");
        btnMinusculas.setBounds(210, 120, 120, 30);
        btnMinusculas.setMnemonic('m');
        getContentPane().add(btnMinusculas);

        btnMayusculas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnMayusculas_actionPerformed();
            }
        });

        btnMinusculas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnMinusculas_actionPerformed();
            }
        });
    }

    protected void btnMayusculas_actionPerformed() {
        String cadena = txtCadena.getText();
        txtResultado.setText(cadena.toUpperCase());
    }

    protected void btnMinusculas_actionPerformed() {
        String cadena = txtCadena.getText();
        txtResultado.setText(cadena.toLowerCase());
    }
}