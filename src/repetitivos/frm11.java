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

public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextArea txaRpta;
    JLabel lblCantidad;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm11 frame = new frm11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm11() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("Números capicúas de 3 cifras: ");
        lblTitulo.setBounds(70, 20, 300, 30);
        getContentPane().add(lblTitulo);

        lblCantidad = new JLabel("Cantidad : ");
        lblCantidad.setBounds(80, 170, 300, 30);
        getContentPane().add(lblCantidad);

        txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(70, 60, 200, 100);
		getContentPane().add(scrollPane);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 220, 100, 30);
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
        int cantidad = 0;

        for (int i = 100; i <= 999; i++) {
            int centena = i / 100;
            int unidad = i % 10;

            if (centena == unidad) {
                resultado.append(i).append("\n");
                cantidad++;
            }
        }

        txaRpta.setText(resultado.toString());
        lblCantidad.setText("Cantidad: " + cantidad);
    }
}