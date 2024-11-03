package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextArea txaRpta;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm12 frame = new frm12();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm12() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("Números del 1 al 100:");
        lblTitulo.setBounds(100, 20, 300, 30);
        getContentPane().add(lblTitulo);

        txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(90, 60, 250, 150);
		getContentPane().add(scrollPane);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            resultado.append(i).append(" ");
            if (i % 10 == 0) {
                resultado.append("\n");
            }
        }

        txaRpta.setText(resultado.toString());
    }
}