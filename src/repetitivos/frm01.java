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

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDividendo, txtDivisor, txtCociente, txtResto;

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
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDividendo = new JLabel("Dividendo : ");
        lblDividendo.setBounds(100, 30, 100, 30);
        getContentPane().add(lblDividendo);

        JLabel lblDivisor = new JLabel("Divisor : ");
        lblDivisor.setBounds(100, 70, 100, 30);
        getContentPane().add(lblDivisor);

        JLabel lblCociente = new JLabel("Cociente : ");
        lblCociente.setBounds(100, 110, 100, 30);
        getContentPane().add(lblCociente);

        JLabel lblResto = new JLabel("Resto : ");
        lblResto.setBounds(100, 150, 100, 30);
        getContentPane().add(lblResto);

        txtDividendo = new JTextField();
        txtDividendo.setBounds(170, 30, 70, 30);
        txtDividendo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDividendo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDividendo);

        txtDivisor = new JTextField();
        txtDivisor.setBounds(170, 70, 70, 30);
        txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDivisor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisor);

        txtCociente = new JTextField();
        txtCociente.setBounds(170, 110, 70, 30);
        txtCociente.setFocusable(false);
        txtCociente.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCociente.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCociente);

        txtResto = new JTextField();
        txtResto.setBounds(170, 150, 70, 30);
        txtResto.setFocusable(false);
        txtResto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 200, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int dividendo = Integer.parseInt(txtDividendo.getText());
        int divisor = Integer.parseInt(txtDivisor.getText());
        int residuo = dividendo;
        int cociente = 0;
        
        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        txtCociente.setText(String.valueOf(cociente));
        txtResto.setText(String.valueOf(residuo));
    }
}