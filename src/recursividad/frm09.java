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

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtTexto, txtVocales;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm09 frame = new frm09();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTexto = new JLabel("Texto : ");
        lblTexto.setBounds(100, 30, 120, 30);
        getContentPane().add(lblTexto);

        JLabel lblVocales = new JLabel("Vocales : ");
        lblVocales.setBounds(100, 70, 120, 30);
        getContentPane().add(lblVocales);

        txtTexto = new JTextField();
        txtTexto.setBounds(180, 30, 200, 30); 
        txtTexto.setHorizontalAlignment(SwingConstants.LEFT);
        txtTexto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTexto);

        txtVocales = new JTextField();
        txtVocales.setBounds(180, 70, 70, 30);
        txtVocales.setFocusable(false);
        txtVocales.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVocales.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVocales);

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

    private void btnCalcular_actionPerformed() {
        String texto = txtTexto.getText(); 
        int resultado = contarVocalesRec(texto);  

        txtVocales.setText(String.valueOf(resultado));  
    }

    private int contarVocalesRec(String cadena) {
        String vocales = "aeiouAEIOU";

        if (cadena.isEmpty()) {
            return 0;
        }

        if (vocales.indexOf(cadena.charAt(0)) != -1) {
            return 1 + contarVocalesRec(cadena.substring(1));
        } else {
            return contarVocalesRec(cadena.substring(1));
        }
    }
}
