package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm38 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtMes, txtAño;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm38 frame = new frm38();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm38() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMes = new JLabel("Mes :");
		lblMes.setBounds(50, 20, 80, 30);
		getContentPane().add(lblMes); 
		
		JLabel lblAño = new JLabel("Año :");
		lblAño.setBounds(180, 20, 80, 30);
		getContentPane().add(lblAño); 
		
		txtMes = new JTextField();
		txtMes.setBounds(100, 20, 70, 30);
		txtMes.setHorizontalAlignment( SwingConstants.RIGHT);
		txtMes.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtMes);
		
		txtAño = new JTextField();
		txtAño.setBounds(240, 20, 70, 30);
		txtAño.setHorizontalAlignment( SwingConstants.RIGHT);
		txtAño.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtAño);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(90, 60, 200, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
	    int mes = Integer.parseInt(txtMes.getText());
	    int año = Integer.parseInt(txtAño.getText());
	    String texto1;
	    String texto2 = null;
	    
	    boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    
        if (bisiesto) dias[1] = 29;

        if (mes >= 1 && mes <= 12) {
        	texto1 = ("El mes es " + meses[mes - 1] + " y tiene " + dias[mes - 1] + " días."); 
        
            if (bisiesto) texto2 = ("El año " + año + " es bisiesto.");
             
            else texto2 =("El año " + año + " no es bisiesto.");
            
        }
        else texto1 = ("El número del mes es inválido");
        
        txaRpta.setText("");
        txaRpta.append(texto1 + "\n");
        if (texto2 != null) {
            txaRpta.append(texto2 + "\n");
	    
        }
	}	
}
	
