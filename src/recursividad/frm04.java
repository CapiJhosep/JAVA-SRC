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

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCadena, txtInvertida;

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
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblCadena = new JLabel("Cadena : ");
        lblCadena.setBounds(100, 30, 120, 30);
        getContentPane().add(lblCadena);

        JLabel lblInvertida = new JLabel("Invertida : ");
        lblInvertida.setBounds(100, 70, 120, 30);
        getContentPane().add(lblInvertida);

        txtCadena = new JTextField();
        txtCadena.setBounds(180, 30, 100, 30);
        txtCadena.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCadena.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCadena);

        txtInvertida = new JTextField();
        txtInvertida.setBounds(180, 70, 100, 30);
        txtInvertida.setFocusable(false);
        txtInvertida.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInvertida.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInvertida);

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
        String cadena = txtCadena.getText();
        String invertida = invertirCadena(cadena);
        txtInvertida.setText(invertida);
    }

    private String invertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}