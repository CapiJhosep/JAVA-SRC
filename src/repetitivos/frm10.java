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

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextArea txaRpta;
    JLabel lblCantidad;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("Números de 4 cifras con suma de cifras pares iguales a las impares: ");
        lblTitulo.setBounds(50, 30, 400, 30);
        getContentPane().add(lblTitulo);

        txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(120, 60, 200, 150);
		getContentPane().add(scrollPane);

        lblCantidad = new JLabel("Cantidad : ");
        lblCantidad.setBounds(100, 230, 300, 30);
        getContentPane().add(lblCantidad);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 300, 100, 30);
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

        for (int i = 1000; i <= 9999; i++) {
            int pares = 0;
            int impares = 0;
            int numero = i;

            for (int j = 0; j < 4; j++) {
                int digito = numero % 10;
                if (digito % 2 == 0) {
                    pares += digito;
                } else {
                    impares += digito;
                }
                numero /= 10;
            }

            if (pares == impares) {
                resultado.append(i).append("\n");
                cantidad++;
            }
        }

        txaRpta.setText(resultado.toString());
        lblCantidad.setText("Cantidad: " + cantidad);
    }
}